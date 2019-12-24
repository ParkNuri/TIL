JDBC Connection																																	  		2019.12.23

---

# JDBC (Java Data Base Connectivity)

* Java에서 구현해야 할 스펙 제시

* 라이브러리를 포함하는 드라이버 제공

* 상속관계에 의해 호환가능



```java

```

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



