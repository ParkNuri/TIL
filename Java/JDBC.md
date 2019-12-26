JDBC Connection																																	  		2019.12.23

---

# JDBC (Java Data Base Connectivity)

> java로 DBMS 연동하는 기술
>
> SQL문을 자바로 만든 시스템을 통해 실행할 수 있도록 만들어진 자바의 기술

* Java에서 구현해야 할 스펙 제시

* 라이브러리를 포함하는 드라이버 제공

* 상속관계에 의해 호환가능



## **[JDBC처리 순서]**

​	==== jdbc api 사용 전 처리 순서

1. JDBC드라이버를 제조사 홈페이지에서 다운로드 받는다.

   → C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib 폴더에 있는 ojdbc6.jar 파일

2. JVM이 인식할 수 있는 위치에 연결

   1 ) 이클립스를 사용하는 경우(Application)

   ​	① 작업 중인 프로젝트 선택

   ​	② 프로젝트에서 단축메뉴 선택 

   ​		**[Build path] - [Configure Build Path]**

   ​	③ 대화상자에서 세 번째 탭인 **[Libraries]** 탭 선택

   ​	④ **[Add External jar..]** 선택 후 1번 위치에 있는 ojdbc6.jar 파일 등록	

   ==== java api 사용하기

3. 오라클 드라이버 로딩

   : JVM에서 드라이버 내의 API를 접근해서 사용할 수 있도록 Class 클래스의 forName 메소드를 이용해서 핵심 클래스를 로딩하는 작업

   * 문법

     ```java
     Class.forName("DBMS 드라이버의 핵심클래스명")
         		// 패키지 명까지 명시
     ```

     - 오라클 : oracle.jdbc.driver.OracleDriver
     - Mysql : com.mysql.jdbc.Driver
     - 제조사 홈페이지에서 확인 가능

4. DBMS에 연결하기

   → DriverManager클래스의 getConnection 메소드를 통해 작업

   ​	 DriverManager : Connection 객체를 생성하는 클래스

   ​	1) static 메소드이므로 클래스이름으로 액세스

   ​	2) throws SQLException하고 있고 SQLException은 RuntimeException의 하위가 아니므로 try~catch를 이용해서 exception에 대한 처리를 해야한다.

   ​	3) 매개변수

   ​		url : DBMS내부에서 인식할 연결문자열 ( 어떤 DBMS를 쓰냐에 따라 달라진다. )

   ​		

   ​			[오라클]

   ​			jdbc:oracle:thin:@70.12.115.50:1521:xe

   ​			=============  =========== ==== ==

   오라클에서 사용하는 프로토콜:@dbms가 설치되어있는 PC의 IP:PORT

   user : 접속계정

   password : 접속할 계정의 패스워드

   

   ​		4) 리턴타입

   ​			연결정보를 java.sql.Connection타입으로 리턴

   ​			DriverManager의 getConnection메소드를 이용하면 DBMS에 연결 후 연결정보를 객체로 만들어서 리턴한다.

   ​			연결 객체의 타입은 java.sql.Connection이지만 어떤 DBMS를 접속햇냐에 따라 Connection의 하위 객체가 리턴된다.

   ​			내부에서는 접속된 DBMS회사에서 제공하는 라이브러리 속 Connection이 리턴되도록 다형성이 적용되어 있다.

   ​		

   ​			5) 사용 방법

   ​			Connection con = DriverManager.getConnection(url, user, password)

   ​			→어떤 DBMS를 쓰냐에 따라 다르게 리턴되는 Connection객체를 con이라는 참조변수를 통해 접근할 수 있도록 할당

   dbms 회사에 따라 연결객체가 달라짐

   드라이버 연결 후 DB연결성공까지의 딜레이가 긴걸 보면 많은 리소스를 쓴다는 것을 알 수 있음

5. SQL을 실행하는 역할을 담당하는 Statement객체 생성

   Statement - PreparedStatement - CallableStatement

   정적 SQL 실행 (보안(:SQLInjection)에 취약) - 동적 SQL 실행 (시큐어코딩에 적합) - 각 DBMS에 특화된 SQL을 실행 (ex. 오라클 : PL-SQL)

   1) Statement 객체를 이용

   ​	Connection객체에 있는 createStatement 메소드를 통해 생성

   ​	Connection정보를 유지해야 한다.

   ​	Statement stmt = con.createStatement()

   ​	Statement (java.sql.Statement 타입이지만 드라이버 파일에 포함된 Statement 객체가 리턴)

   2) PreparedStatement 객체를 이용

   ​	why? 동적SQL문을 사용해야 하기 때문에

   ​	sql이 실행되는 과정은

    - 쿼리문을 읽고 분석

    - 컴파일

    - 실행

      

   Statement는 위의 단계를 모두 반복해서 길행하고 작업하지만 PreparedStatement는 한 번 실행하고 캐쉬에 저장하고 캐쉬에서 읽어서 작업

   

   PreparedStatement는 sql문을 실행하는 방식이 sql문을 미리 파싱한 후 동적으로 바인딩해서 작업해야 하는 값들만 나중에 연결해서 인식시키고 실행한다.

   

   ① sql문을 작성할때 외부에서 입력받아서 처리해야하는 부분에 ?로 정의한다.

   ② sql문을 미리 파싱해야 하므로 실행할때 sql을 전달하지 않고 PreparedStatement 객체를 생성할때 sql문을 전달한다.

   PreparedStatement ptmt = con.prepareStatement(sql문);

   ③ ? 에 값을 셋팅

   ​	PreparedStatement 객체에 정의되어 있는 setXXXX메소드를 이용

   ​	ResultSet과 동일한 방식으로 메소드를 구성

   ​	setXXXX(index, 값)

   컬럼타입(?순서(1부터 시작), 컬럼에 설정할 값)

   

   오라클 타입과 매칭되는 setXXX메소드

   * char, varchar2 : setString(1, "xxxx")
   * number, integer : setInt(1, 0000)
   * 소숫점이 있는 number : setDouble(1,0.0)
   * date : setDate(1, java.sql.Date 객체)

   

   ④ 실행 메소드 호출

   * insert, delete, update

     int result = ptmt.executeUpdate()

     

   * select

     ResultSet rs = ptmt.executeQuery()

   ​		

6.  SQL 실행 

   1) Statement 이용		

   ​	① executeUpdate : insert/update/delete 문을 실행

   ​		int 결과값 = stmt.executeUpdate(sql(DML)문)

   ​		sql실행결과

   ​		몇개의 row가 변경되었는지 리턴 

   ​	② executeQuery : select문을 실행

   ​									select문의 실행 결과로 리턴되는 2차원 표를 자바에서 사용할 수 있도록 모델링해 놓은 									객체가 ResultSet이고 executeQuery 메소드는 결과로 ResultSet객체를 반환하므로 이 									객체를 반환받을 수 있도록 정의한다. 

   ​				ResultSet r = stmt.executeQuery(sql);

   

   2) PreparedStatement 이용

   →5번 참고

   

7.  결과 값 처리

   1) insert, delete, update 모두 동일

   ​	→ int로 결과를 리턴하므로 결과값을 출력

   2) select

   ​	① select문의 실행결과롤 반환되는 ResultSet을 참조할 수 있도록 정의

   ​		ResultSet rs = stmt.executeQuery("sql문");

   

   ​	② ResultSet안에서 모든 레코드를 읽어서 처리할 수 있도록 반복문을 이용해서 처리

   ​		처음 반환되는 ResultSet에서 Cursor가 레코드에 위치하지 않으므로 Cursor를 ResultSet안의 레코드에 위치할 수 있도록 내부 메소드를 이용해서 처리한다.

   while(rs.next()){}

   rs.next() : 다음 레코드로 Cursor를 이동하고 레코드가 존재하면 true를 리턴하고 레코드가 존재하지 않으면 false를 리턴한다.

   

   ③ 레코드에 값을 읽는다.

   → 한번에 하나의 컬럼만 읽을 수 있다.

   ​	ResultSet 내부에서 제공되는 getXXXXX메소드를 이용

   ​			rs.getXXXXXX(1)

   ​					  ====== ==

      		   데이터 타입 | 테이블에 존재하는 컬럼의 원래 순서가 아닌 조회된 컬럼의 순서 (index = 1 부터 시작)

   ​	오라클(DBMS)의 타입과 매칭되는 자바의 타입으로 메소드명이 구성

   ​	varchar2 or char 로 정의된 컬럼값 : getString(컬럼의 순서 or 컬럼명)

   

   ​	소숫점 없는 number or integer : getInt( 컬럼의 순서 or 컬럼명)

   

   ​	소숫점이 있는 number : getDouble(컬럼의 순서 or 컬럼명)

   ​	날짜데이터 : getDate(컬럼의 순서 or 컬럼명)

   

   ​	while(rs.next()){	// 조회된 테이블의 모든 레코드에 반복 작업 수행

   ​		sysout(rs.getString(1));	// 조회된 레코드의 첫번째 컬럼값

   ​		sysout(rs.getString("ename"));	// 조회된 레코드의 컬럼명이 ename인 컬럼의 값

   ​	}

    

8. 자원반납

   자원을 반납하지 않으면 계속 메모리에 할당되어 있는 상태

   ResultSet, Statement, Connection 모두 반납해야 한다.

   close 메소드를 이용해서 자원해제

   가장 마지막에 만들어진 객체부터 해제

9. 











lock, 내부스펙 확인 불가 -> new 키워드를 사용할 수 없다.

① 드라이버 파일을 JVM이 인식할 수 있는 위치에 연결

② 드라이버 로딩

③ DBMS 연결

④ SQL을 실행하는 기능을 갖고있는 객체(Statement) 생성

⑤ SQL 실행



## 1. JDBC환경설정

JDBC는 새로운﻿ 언어가 아니라 Java를 이용해서 DBMS에 접근할 수 있는 기술이다. 

 1. JVM이 인식할 수 있는 위치로 오라클 드라이버를 복사   

    1) 오라클 드라이버는 해당 제품회사 홈페이지에 다운로드    

    ​	① 오라클이 설치되어 있는 경우    

    C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib에서      ojdbc.jar파일을 이용      

    ![img](https://blogfiles.pstatic.net/20160405_57/heaves1_14598141215157Io2K_PNG/test1.png?type=w2) 

    

    ​	

    ​	2) 이클립스가 아닌 경우

    오라클 드라이버가 있는 폴더를 classpath로 설정하거나     C:\Program 	Files\Java\jdk1.8.0_73\jre\lib\ext에 드라이버를     copy해서 인식(권하지 않음) 3) 이클립스를 사용하는 경우   ① 프로젝트 선택하고  마우스 오른쪽 버튼을 눌러 [Build Path]     -[Configure Build Path..]선택     ![img](https://blogfiles.pstatic.net/20160405_271/heaves1_1459814341941BsyFd_PNG/test2.png?type=w2)   ② 대화상자가 나타나면 [Libraries]탭을 선택하고 [Add External      JARS...]버튼을 누른다. 오라클 드라이버가 있는 폴더에서 드라이버      파일을 선택해서 등록       ![img](https://blogfiles.pstatic.net/20160405_182/heaves1_145981958769629nQ6_PNG/test3.png?type=w2)        ![img](https://blogfiles.pstatic.net/20160405_292/heaves1_1459819588352a4Q2M_PNG/test4.png?type=w2)        ![img](https://blogfiles.pstatic.net/20160405_219/heaves1_1459819588662GGVcx_PNG/test5.png?type=w2)  



referenced libraries - ojdbc6.jar - oracle.jdbc.driver - OracleDriver.class가 start point



## 2. JDBC 개요

JDBC(Java Database Connectivity)는 자바에서 데이터베이스를 접속하기 위한 기술입니다. DBMS에 insert하고 delete, update, select 하는 작업을 SQL-Plus창에서 하지 않고 자바코드를 통해 하려면 반드시 필요한 기술인거죠.우리가 사용하는 DBMS는 ORACLE,MYSQL,MSSQL,DB2등 이 있습니다. 이거 보다 더 많은 종류의 DBMS가 있죠. JDBC는 이 DBMS내부로 접근해서 SQL문을 실행하겠다는 건데 가능할까요? 어떤 DBMS를 쓰냐에 따라 내부 접근 로직이 모두 다를 것입니다. DBMS회사 측에서 접근할 수 있도록 허용하지도 않을 것이구요. 그럼 어떻게 해야 할까요?자바는 OOP언어입니다. OOP의 특성이 가장 잘 녹아져 있는 것이 API라 했습니다. 우리가 어떤 DBMS를 쓰느냐에 따라 클래스명이나 메소드명이 달라진다면 굉장히 혼란스러울 것입니다. 유지보수는 당연히 힘들꺼구요...그래서 자바에서는 표준API를 제공하고 있습니다.  우리 자바 개발자들은 이 표준 API를 이용해서 개발을 합니다. 어떤 DBMS를 쓰느냐에 따라 API가 달라지지 않습니다. 대신 내부 접근 코드는 DBMS를 만든 제조사쪽에서 개발해서 제공합니다. 마치 우리가 프린터기를 구매하고 윈도우와 연결하기 위해 케이블을 연결하고 프린터 드라이버를 다운로드 받아 설치하는 것처럼 말입니다.  자, 이제 부터 JDBC가 어떻게 동작하고 우린 어떤 처리를 해야 하는지 살펴보도록 하겠습니다. 우선 JDBC를 사용하기 위해서는 위에서 설명한 것 처럼 제조사 홈페이지에서 해당 DBMS를 사용하기 위해 제공하는 드라이버를 다운로드 받아 JVM이 인식할 수 있는 위치에 등록해야 합니다.우리는 이클립스를 이용해서 작업하므로 아래 게시물을 참고하여 드라이버 파일을 등록합니다.                       JDBC는 원리만 이해하면 코드를 이용해서 작업하기 쉬운 편입니다. insert, update, delete작업은 소스 한 줄 건드리지 않고 SQL만 변경해도 코드가 실행됩니다.패턴이 정해져 있다는 것입니다.다음과 같은 순서로 JDBC를 적용합니다.**1. 드라이버로딩****2. 커넥션설정하기****3. Statement객체 생성하기****4. SQL문실행하기****5. 결과처리****6. 자원반납*****\*





## 3. JDBC - 드라이버 로딩

드라이버를 로딩한다는 것은 JVM이 어 떤 DBMS를 사용하는지 인식시키는 작업으로 java에서 오라클을 연동할 수 있도록 오라클에서 제공해준 드라이버 파일을 JVM의 메모리에 로딩시키는 작업을 하는 단계입니다.보통 외부 라이브러리에서 제공되는 클래스를 사용하려면 아래와 같이 new연산자를 이용해서 객체를 생성해서 사용하는 것이 일반적입니다.                             JSON데이터를 파싱할때 사용하는 json-simple라이브러리 JSONObject myjson = new JSONObject();                  그러나 DBMS드라이버는 Class라는 클래스에 정의되어 있는 forName이라는 메소드를 이용해서 오라클 드라이버(ojdbc6.jar)의 핵심클래스를 동적 로드 방식을 통해 메모리에 로딩해야 합니다. 정확하게 이해하시려면 클래스로딩의 종류나 과정부터 이해해야 하지만 우선은 JDBC에만 포커스를 맞춰 설명하도록 하겠습니다.ojdbc6.jar파일의 API를 직접 호출하지 않고 java.sql의 표준API를 이용하여 호출하면 ojdbc6.jar의 API가 호출될 것입니다.핵심클래스를 흔히 JDBC드라이버라 하며 어떤 DBMS를 쓰느냐에 따라 달라집니다.작업전에 제조사 홈페이지에서 확인해야 합니다.**[오라클]****oracle.jdbc.driver.OracleDriver********[MySQL]****co**[**m.mysql.jdbc.Driver**](http://m.mysql.jdbc.driver/)******Class.forName("oracle.jdbc.driver.OracleDriver")**                        **-------------------------------------------**                                     **^**                                      **|__ 오라클 드라이버명(패키지 포함)******여기까지 테스트를 해보도록 하겠습니다. api.sql패키지를 작성하고 ConnectionTest.java를 작성합니다. 다음과 같이 코드를 작성합니다.                             **

```java
**package jdbc; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 

public class ConnectionTest { 
    public static void main(String[] args) { 	
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 	
        String user = "scott"; 	
        String password = "tiger"; 	
        try { 		//1. JDBC드라이버로딩 		
        	Class.forName("oracle.jdbc.driver.OracleDriver"); 		
        	System.out.println("드라이버로딩성공"); 		
        } catch (ClassNotFoundException e) {        	
            System.out.println("드라이버로딩실패"); 		
            e.printStackTrace(); 	
        } 	
    } 
}               
```



​        콘솔에 **"드라이버로딩성공"** 메시지가 출력됐다는 것은 위의 코드인 **Class.forName(...........)** 명령문이 정상적으로 실행됐다는 의미입니다.)

[![img](https://k.kakaocdn.net/dn/bRMXFz/btqwmtqfH3N/U0iUZOQYRQx4dSopkChCNk/img.png) ](https://blog.naver.com/PostView.nhn?blogId=heaves1&logNo=221151959087&parentCategoryNo=&categoryNo=87&viewDate=&isShowPopularPosts=false&from=postList#)



# ★Alert

* cmdline에서 한 작업은 Auto Commit이 되지 않기때문에 항상 commit 후 작업을 진행해야 한다.

* 백업