class																						2019.12.10

---

# 클래스

---

> 개체선택 데이터 정의 데이터 처리기능
>
> 하나의 역할만하게 만들기



## 객체 

: 속성과 기능의 집합







## 데이터







## 기능



```java
class class_name{
	data_type data;
    ...
    function(value){
        
    }
}

```



* function (in java=>) method

* value

  : 외부에서 입력받아서 처리할 값







# 메서드

> 특정 작업을 수행하는 일련의 문장들을 하나로 묶은것.
>
> ? 사용하는 이유 ?
>
> 1. 높은 재사용성
>
> 2. 중복된 코드의 제거



### 1. 메서드 사용방법

```java
return_type method_name (data_type value_name1, data_type value_name2, ...){
    //code
}

ex1)

int add (int a, int b){
    int result = a + b;
    return result;
}

ex2)
    
void login(String id, String pw){
    if(p.id==id&&p.pw==pw){
        로그인 허용
    }
}
```



