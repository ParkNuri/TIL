API																																									2019.12.17

---

# 1. java.lang 패키지



### 1) Object 클래스

> object클래스는 자바에서 작성하는 모든 클래스의 최상위 클래스이다.
>
> 상속 받는 클래스가 없을 때, 컴파일러가 class 클래스명 뒤에 extends Object를 자동으로 생성한다.



* Object 클래스의 메소드

```java
Object obj1 = new Object();

System.out.println(obj1.getClass());	//클래스의 정보를 return
System.out.println(obj1.hashCode());	//객체의 정보를 return
System.out.println(obj1.toString());	//객체의 주소 return - 기본메소드
System.out.println(obj1);		  //==obj1.toString()
								  //기본메소드이므로 생략이 가능
```





* Object.toString() 오버라이딩

```java
Person p1 = new Person("장동건",50,"서울");
System.out.println(p1.toString());	//개발자가 작성하는 모든 클래스에서
									//오버라이딩해야한다.
System.out.println(p1);				

//API의 클래스들..
//=> 기존 클래스들 중 몇몇은 toString()이 오버라이딩 되어있다.
Random rand = new Random();
System.out.println(rand);		//toString 주소출력
Date d = new Date();			//toString 날짜출력(오버라이딩됨)
System.out.println(d);
String str = new String("java");//toString str값출력(오버라이딩됨)
System.out.println(str);
	
// => 우리가 만드는 클래스에서도 값들을 확인하기 위해 항상 toString()을 오버라이딩하자.
```

* 

  * Person 클래스

  ```java
  package chap09.api.lang;
  
  public class Person {
  	String name;
  	int age;
  	String addr;
  	
  	
  	
  	//Constructor----------------------------------------------------
  	public Person() {
  		
  	}
  	public Person(String name, int age, String addr) {
  		super();
  		this.name = name;
  		this.age = age;
  		this.addr = addr;
  	}
  	//Method---------------------------------------------------------
  	/*public String toString() {
  		return this.name+","+this.age+","+this.addr;
  	}
  	*/
  	@Override
  	public String toString() {
  		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
  	}
  	
  	//Getter&Setter--------------------------------------------------
  	public String getName() {
  		return name;
  	}
  	public void setName(String name) {
  		this.name = name;
  	}
  	public int getAge() {
  		return age;
  	}
  	public void setAge(int age) {
  		this.age = age;
  	}
  	public String getAddr() {
  		return addr;
  	}
  	public void setAddr(String addr) {
  		this.addr = addr;
  	}
  	
  	
  }
  
  ```

  

### 2) String 클래스

* String

  * String 클래스의 메소드

    | method                                                       | use                                                          |
    | ------------------------------------------------------------ | ------------------------------------------------------------ |
    | char charAt(int index)                                       | 해당 인덱스의 값 return                                      |
    | concat(String str)                                           | 매개변수 String과 객체string 연결                            |
    | indexOf(char c)                                              | 해당 문자가 있는 인덱스 return (0번지부터 확인)(없으면  return값: -1) |
    | lastIndexOf(char c)                                          | indexOf()와 같은 역할 수행. 끝에서부터 확인                  |
    | length()                                                     | 문자의 길이 return                                           |
    | equals(String str)                                           | 매개변수 String과 객체 String이 같으면 true, 아니면 false return (대소문자 구분) |
    | equalsIgnoreCase(String str)                                 | equals()와 같은 역할 수행. (대소문자 구분 x)                 |
    | startsWith(String str)                                       | 매개변수 String값으로 시작하는지 확인. 맞으면 true, 아니면 false return |
| endsWith(String str)                                         | 매개변수 String값으로 끝나는지 확인. 맞으면 true, 아니면 false return |
    | toUpperCase()                                                | 대문자로 변환                                                |
    | toLowerCase()                                                | 소문자로 변환                                                |
    | substring(int index1)<br />substring(int index1, int index2) | index1 ~ index2까지 남기고 자르기                            |
    | replace(String s1, String s2)                                | s1을 s2로 변경                                               |
    
  
  
  
  
  
  * String 객체를 다른 타입의 데이터로 변환
  
    * String → byte[]
  
    ```java
    byte[] bArr = str1.getBytes();
    for (int i = 0; i < bArr.length; i++) {
    	System.out.println(bArr[i]);
    }
    ```
  
    
  
    
  
    * String -> char[]
  
    ```java
    char[] cArr = str1.toCharArray();
    		for (int i = 0; i < cArr.length; i++) {
    			System.out.println(cArr[i]);
    		}
    ```
  
    
  
    * String -> String[]
  
    ```java
    String[] sArr = str2.split(" ");
    for(String string : sArr) {
    	System.out.print(string+"\t");
    }
    System.out.println();
    ```
  
    
  
    * 기본형 -> String
  
    ```java
    
    public static void main(String[] args){
    	//case1
    	int i = 1000;
    	double d = 10.0;
    	test(String.valueOf(i));
    	test(String.valueOf(d));
    
    
    	//case2
    	System.out.println("\n4-2. 기본형 -> String");
    	test(i+"");
    	test(d+"");
    }
    public static void test(String str) {
    	System.out.println("전달된 데이터=>"+str);
    }
    
    ```
  
  
  



* String  vs  StringBuffer  vs  StringBuilder
  
  : 문자열 조작이 빈번한 곳에서는 String 이 아닌 StringBuffer/StringBuilder 사용해야 한다.
  
  
  
  * StringBuilder (java 1.5)
  
    : 주로 웹에서 사용. 
  
    웹은 서버 자체에 동시접속(thread) 처리를 할 수 있게 해두었기 때문에 동시접속을 고려할 필요가 없다.
  
    
  
  * StringBuffer (java1.0)
  
    : 안드로이드, 빅데이터 등 동시접속을 고려해야 하는 상황에서 사용한다.
  
  
  
  