web application server																																	2019.12.31

---

http://apache.org/



* 웹 요청 방식

  http://127.0.0.1:8088/context명/요청할 webapplication

  프로토콜://웹서버 ip:port(web의 기본port 80-생략가능)/기본context(ROOT)는 생략

* examples

  http://127.0.0.1:8088/docs/index.html

  http://127.0.0.1:8088/manager/index.jsp

  http://127.0.0.1:8088/examples/servlets/index.html

* user name 변경

  C:\Program Files\Apache Software Foundation\Tomcat 9.0\conf\tomcat-users.xml 에서 user 명 변경 가능

설정정보 저장



* context 표준 형태

context에는 폴더별 내용이 정해져있다. 해당 폴더 기준은 지켜야한다.

context > jsp, html, js, css, image

​			  > WEB-INF > web.xml : 설정파일. 해당 context의 설정을 기술하는 파일

​								  > lib : 해당 context를 이용할 때 필요한 외부 library 위치시킬 폴더 

​								  > classes : servlet, DAO, DTO, logic 등 자바파일을 위치시킬 폴터.





# 이클립스에서 tomcat 실행

내부 브라우저에서는 변경사항이 즉각적으로 보이지 않기때문에 외부 explore로 확인

[Window]-[properties]-[General]-[Web Browser]의 [Use external web browser] 와 [Internet Explorer] 을 선택하면 실행 화면이 외부 explorer창으로 나온다.

![image-20191231134036833](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191231134036833.png)

## tomcat error

* case 1) 포트가 사용중일때

  cmd 창에 netstat -ano 명령어로 포트 사용중인지 확인하기 

  ```bash
  netstat -ano
  
  활성 연결
  
    프로토콜  로컬 주소              외부 주소              상태            PID
    TCP    0.0.0.0:80             0.0.0.0:0              LISTENING       4
    TCP    0.0.0.0:135            0.0.0.0:0              LISTENING       504
    TCP    0.0.0.0:445            0.0.0.0:0              LISTENING       4
    TCP    0.0.0.0:1521           0.0.0.0:0              LISTENING       3472
    TCP    0.0.0.0:5040           0.0.0.0:0              LISTENING       5768
    TCP    0.0.0.0:5357           0.0.0.0:0              LISTENING       4
    TCP    0.0.0.0:8009           0.0.0.0:0              LISTENING       7904
    
    ...
  ```

  

* case 2)