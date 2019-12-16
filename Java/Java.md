#  1. 빅데이터의 정의

## 3V (velocity, volume, variety)

다양하고 빠르고 대용량



# 2. Java 버전

> SE (Standard Edition)
>
> : 가장 널리 쓰이는 자바 핵심 라이브러리 및 API 집합체
>
>    데스크탑, 서버, 임베디드 시스템 등을 위한 표준 자바 플랫폼에서 사용

> EE (Enterprise Edition)
>
> : 서버 측 개발을 위한 플래폼에서 사용
>
> 응용프로그램(웹 앱) 서버에서 장애복구, 분산 멀티미디어, 다중 계층 등의 자바 소프트웨어 기능을 제공 (응용 프로그램에서 큰 규모의 분산시스템이 필요한 경우 사용) 

> ME (Mobile Edition)
>
> : 임베디드 시스템 개발을 위한 플랫폼(모바일, PDA, 셋톱박스 등 )에서 사용
>
> 과거 Java SE버전 을 기반으로 하기 때문에 자바 1.5부터 도입된 기능 중 일부(generic)는 미포함



Java 8 버전을 기준으로 8 이전을 classic java, 이후를 modern java라고 한다.

modern java에서 `람다` 가 추가 되었다.



# 3. 환경변수 설정

JAVA_HOME → home directory  설정

PATH → java 명령어를 window 시스템 전체에서 사용가능하게 윈도우 전체에 적용

시스템 변수 → 전체



# 4. Java

### 1) Application

: public static void main(String[] args)를 찾아서 그 블럭 내의 첫번째 라인을 실행

###  2) Applet

: 느려서 사용하지 않는다.

### 3) Servlet

: 스프링과 비슷한

### 4) JVM (Java Virtual Machine)

Java는 가상머신을 생성한 후 그 위에서 코드를 실행하기 때문에 OS에 독립적이다.



Java 소스 파일을 JVM이 읽을 수 있도록 binary code의 class 파일로 컴파일한다.



### *) CMD 창에서 java 실행하기

① 자바소스 파일 작성(.java)

② 컴파일 

```bash
javac file_name.java
```

> javac.exe : java compiler. 자바소스코드를 바이트코드로 컴파일한다. 

③ class 파일이 생성됨(.class)

④ java 실행  (.class 파일을 실행) 

```bash
java file_name
```

> java.exe : java interpreter. 컴파일러가 생성한 바이트코드를 해석하고 실행한다.

### 5) Interpreter

: 한 줄씩 매번 컴파일하는 것

* 인터프리터 언어

  : Basic, Prolog, ...

* + 파이썬 : 컴파일러 + 인터프리터 (하이브리드 방식)



---



* jdk 내부의 jre

  : java 내부의 실행 환경

* jdk 외부의 jre

  : 외부 프로그램이 접근 가능한 실행 환경



* rt.jar (위치 : C:\Program Files\Java\jdk1.x.xxx\jre\lib)

  : java 명령어 압축 파일 (라이브러리 압축 파일)

* jar

  : 자바 압축 파일



+ 패키지 컴파일

  javac -d .$(fileName) $(FileDir)

​                             