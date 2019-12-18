SQL Query																																						2019.12.18

---

#  1.  Query 



## 1) 기본 select

```sql
select 컬럼명1, 컬럼2...

	from 테이블
```



 - sql문은 대소문자 구분하지 않는다.

 - ;은 sql문의 종료를 의미

   ;을 입력하기 전에 여러줄로 sql문을 작성할 수 있다.

- *는 모든 컬럼을 조회하겠다는 의미

- 컬럼에 null을 저장할 수 있다.

  null은 0이나 space만 입력해 놓은 값과 다른 값

  null : 아무 값도 없는 것을 의미(empty)

  사용할 수 없고 저장되어 있지 않은 상태



```mysql
select empno, ename, hiredate, job
from emp;
```



* 컬럼명 대신 alias를 정의해서 사용할 수 있다.

  ```mysql
  select 컬럼명 alias명, 컬럼명 as alias명, 컬럼명 "alias명"
  ```

  * 컬럼명 "alias명"

 	: alias명에 공백이 있는 경우 사용



ex)

```mysql
select ename 사원명, hiredate as 입사일, sal "월 급여"
from emp;

result-----------------------------------------------------------

사원명               입사일      월 급여
-------------------- -------- ----------
SMITH                80/12/17        800
ALLEN                81/02/20       1600
WARD                 81/02/22       1250
JONES                81/04/02       2975
MARTIN               81/09/28       1250
BLAKE                81/05/01       2850
CLARK                81/06/09       2450
SCOTT                82/12/09       3000
KING                 81/11/17       5000
TURNER               81/09/08       1500
ADAMS                83/01/12       1100

사원명               입사일      월 급여
-------------------- -------- ----------
JAMES                81/12/03        950
FORD                 81/12/03       3000
MILLER               82/01/23       1300

14 rows selected.
```



* 여러 컬럼을 합쳐서 하나의 컬럼으로 조회할 수 있다.

  → ||연산자 이용 (sout에서의 '+'처럼 사용)

  ```mysql
  select '나의 입사일은' || hiredate || '입니다.'
  from emp;
  
  result----------------------------------------------------------------
  
  '나의입사일은'||HIREDATE||'입니다.'
  -----------------------------------
  나의 입사일은80/12/17입니다.
  나의 입사일은81/02/20입니다.
  나의 입사일은81/02/22입니다.
  나의 입사일은81/04/02입니다.
  나의 입사일은81/09/28입니다.
  나의 입사일은81/05/01입니다.
  나의 입사일은81/06/09입니다.
  나의 입사일은82/12/09입니다.
  나의 입사일은81/11/17입니다.
  나의 입사일은81/09/08입니다.
  나의 입사일은83/01/12입니다.
  
  '나의입사일은'||HIREDATE||'입니다.'
  -----------------------------------
  나의 입사일은81/12/03입니다.
  나의 입사일은81/12/03입니다.
  나의 입사일은82/01/23입니다.
  
  14 rows selected.
  ```

  

* 오라클의 문자열, 날짜 데이터는 ' '로 표현

  

* 연산의 결과로 컬럼을 생성할 수 있다.  (+, *, /, -, 함수...)

  → 원본에 저장되지는 않는다.

  단, null이 포함되어있는 컬럼은 연산할 수 없다.

  ```mysql
  select ename, sal, comm, sal+comm 급여합
  from emp;
  
  result==============================================
  
  ENAME                       SAL       COMM     급여합
  -------------------- ---------- ---------- ----------
  SMITH                       800
  ALLEN                      1600        300       1900
  WARD                       1250        500       1750
  JONES                      2975
  MARTIN                     1250       1400       2650
  BLAKE                      2850
  CLARK                      2450
  SCOTT                      3000
  KING                       5000
  TURNER                     1500          0       1500
  ADAMS                      1100
  
  ENAME                       SAL       COMM     급여합
  -------------------- ---------- ---------- ----------
  JAMES                       950
  FORD                       3000
  MILLER                     1300
  
  14 rows selected.
  ```

  

* 중복이 있는 경우 중복을 제거하기 위해 select문에 distinct를 추가할 수 있다. 

  ```mysql
  select distinct job from emp;
  
  result-------------------------------
  
  JOB
  -----------
  CLERK
  SALESMAN
  PRESIDENT
  MANAGER
  ANALYST
  
  ref====================================
  
  select job from emp;
  
  result---------------------------------
  
  JOB
  --------------
  CLERK
  SALESMAN
  SALESMAN
  MANAGER
  SALESMAN
  MANAGER
  MANAGER
  ANALYST
  PRESIDENT
  SALESMAN
  CLERK
  
  JOB
  --------------
  CLERK
  ANALYST
  CLERK
  
  ```







## 2) select절에 조건 추가하기

> select	[distinct]	컬럼명,	컬럼명,	.... [alias명]
>
> from	테이블명
>
> where 조건

* 검색 결과를 제한 (조건에 만족하는 데이터만 조회하겠다는 의미)

* where절은 from절 다음에 정의

* where절은 조건식이 true가 되도록 정의

* where절에 사용할 수 있는 비교연산자

  \>, >=, <, <=, =(같다), <>(같지않다), != (같지않다)

  ```mysql
  select ename, job, hiredate, sal
  from emp
  where sal>3000;
  
  result-----------------------------------------------
  
  ENAME                JOB                HIREDATE        SAL
  -------------------- ------------------ -------- ----------
  KING                 PRESIDENT          81/11/17       5000
  ```





* where절에서 조건과 함께 비교하는 값을 추가해야 하는 경우 문자, 날짜는 작은 따옴표로 묶어줘야 한다.





* SQL은 대소문자를 구분하지 않지만, 값을 비교하는 경우 정확하게 대소문자까지 일치해야 한다.

  ```mysql
  select ename, job, hiredate, sal
  from emp
  where job = 'CLERK';
  
  result----------------------------------
  
  ENAME                JOB                HIREDATE        SAL
  -------------------- ------------------ -------- ----------
  SMITH                CLERK              80/12/17        800
  ADAMS                CLERK              83/01/12       1100
  JAMES                CLERK              81/12/03        950
  MILLER               CLERK              82/01/23       1300
  
  compare=================================
  
  select ename, job, hiredate, sal
  from emp
  where job = 'clerk';
  
  result----------------------------------
  
  no rows selected
  ```





* 날짜도 연산 가능하다.

  ```mysql
  select ename, job, hiredate, sal
  from emp
  where hiredate> '1982/01/01';
  
  result----------------------------------------------------
  
  ENAME                JOB                HIREDATE        SAL
  -------------------- ------------------ -------- ----------
  SCOTT                ANALYST            82/12/09       3000
  ADAMS                CLERK              83/01/12       1100
  MILLER               CLERK              82/01/23       1300
  ```

  

  

* 두 개 이상의 조건이 있는 경우 사용할 수 있는 연산자

  * and 연산자 : 모든 조건이 일치

```mysql
select *
from emp
where deptno = 10
	  and job = 'MANAGER';
  
result-------------------------------------------------------------------------------
  
EMPNO  ENAME   JOB              MGR       HIREDATE      SAL       COMM     DEPTNO
------ ------- --------------- -------    ------------- --------- -------- ----------
7782   CLARK           MANAGER   7839      81/06/09       2450                   10
```

  

  * or 연산자 : 조건 중 한 개만 일치

```mysql
select ename, job, deptno, sal
from emp
where deptno = 10
or sal>=2000;

result-------------------------------------------------------

ENAME                JOB                    DEPTNO        SAL
-------------------- ------------------ ---------- ----------
JONES                MANAGER                    20       2975
BLAKE                MANAGER                    30       2850
CLARK                MANAGER                    10       2450
SCOTT                ANALYST                    20       3000
KING                 PRESIDENT                  10       5000
FORD                 ANALYST                    20       3000
MILLER               CLERK                      10       1300
```





  * in 연산자 : or연산자의 의미와 동일

    ​				  컬럼명 in (비교할 값, 값, ........)

    ```
    
    ```

    

  * not 연산자 : 부정







* null값에 대한 비교

  * is null:

    ```mysql
    select ename, sal, comm
    from emp
    where comm is null;
    
    result-----------------------------------
    
    ENAME                       SAL       COMM
    -------------------- ---------- ----------
    SMITH                       800
    JONES                      2975
    BLAKE                      2850
    CLARK                      2450
    SCOTT                      3000
    KING                       5000
    ADAMS                      1100
    JAMES                       950
    FORD                       3000
    MILLER                     1300
    ```

    

  * is not null:

    ```mysql
    select ename, sal, comm
    from emp
    where comm is not null;
    
    result --------------------------------
    
    ENAME                       SAL       COMM
    -------------------- ---------- ----------
    ALLEN                      1600        300
    WARD                       1250        500
    MARTIN                     1250       1400
    TURNER                     1500          0
    ```

    





* like 연산자 : 대표문자와 함께 사용. 조건 비교를 위해 입력한 값이 문자열에 포함되어 있는 것을 찾는 경우.

  * %: 모든 문자열

    * 컬럼명 like 값%

      ```mysql
      # 값%
      select ename, sal, comm
      from emp
      where ename like 'A%';
      
      result --------------------------------
      
      ENAME                       SAL       COMM
      -------------------- ---------- ----------
      ALLEN                      1600        300
      ADAMS                      1100
      ```

      

    * 컬럼명 like %값

    * 컬럼명 like %값%

      ```mysql
      select ename, sal, comm
      from emp
      where ename like '%A%';
      
      result-------------------
      
      ENAME                       SAL       COMM
      -------------------- ---------- ----------
      ALLEN                      1600        300
      WARD                       1250        500
      MARTIN                     1250       1400
      BLAKE                      2850
      CLARK                      2450
      ADAMS                      1100
      JAMES                       950
      ```

      

      

      

  * _ : 한 자리 문자를 의미

    ```mysql
    select ename, sal, comm
    from emp
    where ename like '_A%';
    
    result--------------------------
    
    ENAME                       SAL       COMM
    -------------------- ---------- ----------
    WARD                       1250        500
    MARTIN                     1250       1400
    JAMES                       950
    ```

    



* between 연산자

  ```mysql
  select ename, sal
  from emp
  where sal between 2000 and 5000;
  
  result---------------------------
  
  ENAME                       SAL
  -------------------- ----------
  JONES                      2975
  BLAKE                      2850
  CLARK                      2450
  SCOTT                      3000
  KING                       5000
  FORD                       3000
  
  6 rows selected.
  
  ```

  

## 3) 데이터 정렬

> select [distinct] 컬럼명, 컬럼명, .........[alias명]
>
> from 테이블명
>
> where 조건
>
> order by 컬럼명 정렬기준 (asc, desc)

> 생략시 오름차순



* 기본(asc)

  ```mysql
  SQL> select ename, sal, job
    2  from emp
    3  order by sal;
  
  result-------------------------------------------
  
  ENAME                       SAL JOB
  -------------------- ---------- ------------------
  SMITH                       800 CLERK
  JAMES                       950 CLERK
  ADAMS                      1100 CLERK
  WARD                       1250 SALESMAN
  MARTIN                     1250 SALESMAN
  MILLER                     1300 CLERK
  TURNER                     1500 SALESMAN
  ALLEN                      1600 SALESMAN
  CLARK                      2450 MANAGER
  BLAKE                      2850 MANAGER
  JONES                      2975 MANAGER
  
  ENAME                       SAL JOB
  -------------------- ---------- ------------------
  SCOTT                      3000 ANALYST
  FORD                       3000 ANALYST
  KING                       5000 PRESIDENT
  ```

  

* 오름차순 (asc)

  ```mysql
  SQL> select ename, sal, job
    2  from emp
    3  order by job asc;
  
  ENAME                       SAL JOB
  -------------------- ---------- --------------
  SCOTT                      3000 ANALYST
  FORD                       3000 ANALYST
  MILLER                     1300 CLERK
  JAMES                       950 CLERK
  SMITH                       800 CLERK
  ADAMS                      1100 CLERK
  BLAKE                      2850 MANAGER
  JONES                      2975 MANAGER
  CLARK                      2450 MANAGER
  KING                       5000 PRESIDENT
  TURNER                     1500 SALESMAN
  
  ENAME                       SAL JOB
  -------------------- ---------- --------------
  MARTIN                     1250 SALESMAN
  WARD                       1250 SALESMAN
  ALLEN                      1600 SALESMAN
  
  14 rows selected.
  ```

  

* 내림차순 (desc)

  ```mysql
  SQL> select ename, sal, job
    2  from emp
    3  order by sal desc;
  
  ENAME                       SAL JOB
  -------------------- ---------- ------------------
  KING                       5000 PRESIDENT
  FORD                       3000 ANALYST
  SCOTT                      3000 ANALYST
  JONES                      2975 MANAGER
  BLAKE                      2850 MANAGER
  CLARK                      2450 MANAGER
  ALLEN                      1600 SALESMAN
  TURNER                     1500 SALESMAN
  MILLER                     1300 CLERK
  WARD                       1250 SALESMAN
  MARTIN                     1250 SALESMAN
  
  ENAME                       SAL JOB
  -------------------- ---------- ------------------
  ADAMS                      1100 CLERK
  JAMES                       950 CLERK
  SMITH                       800 CLERK
  
  14 rows selected.
  ```

  

















SQL> create table test(
  2     num1 number,
  3     num2 number(3)
  4  , num3 num(3,2),
  5  num4 num(5,2),
  6     num5 number(10,3),
  7     num6 integer);
, num3 num(3,2),
          *
ERROR at line 4:
ORA-00907: missing right parenthesis

SQL> create table test(
  2     num1 number,
  3     num2 number(3)
  4  , num3 num(3,2),
  5  num4 num(5,2),
  6     num5 number(10,3),
  7     num6 integer);
, num3 num(3,2),
          *
ERROR at line 4:
ORA-00907: missing right parenthesis

SQL> create table test(
  2     num1 number,
  3     num2 number(3),
  4     num3 number(3,2),
  5     num4 number(5,2),
  6     num5 number(10,3),
  7     num6 integer);

Table created.

SQL> insert into test values(125.88, 125.88, 125.88, 125.88, 1234.12345, 125.88)
  2  ;
insert into test values(125.88, 125.88, 125.88, 125.88, 1234.12345, 125.88)
                                        *
ERROR at line 1:
ORA-01438: value larger than specified precision allowed for this column


SQL> insert into test values(125.88, 125.88, 5.88, 125.88, 1234.12345, 125.88)
  2  ;

1 row created.

SQL> select * from test;

      NUM1       NUM2       NUM3       NUM4       NUM5       NUM6
---------- ---------- ---------- ---------- ---------- ----------
```mysql
125.88        126       5.88     125.88   1234.123        126
```