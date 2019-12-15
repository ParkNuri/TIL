제어자																																								2019.12.10

---

# Modifier 제어자 (캡슐화)

> 클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미를 부여.



* 접근 제어자

  : public, protected, private, default

* etc

  : static, final, abstract, native, transient, synchronized, volatile, strictfp







## 1. 접근 제어자

* 접근 제어자 범위

public : 접근 제한이 전혀 없음.

private : 같은 클래스 내에서만 접근 가능 (필요할땐 인증절차를 거쳐서 메소드를 통해 접근 가능)

protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능.

default : 아무것도 추가되지 않은 상태. 같은 패키지 내에서만 접근이 가능.

