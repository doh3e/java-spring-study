# ![alt text](icons8-봄-로고-48.png) Spring 
## DI (Dependency Injection)

class A 객체가 어떤 일을 처리하기 위해서 class B의 객체의 도움을 받아야만 일을 처리할 수 있다.
→ class A는 class B에 의존한다.

---

__의존성 주입__

1. 생성자 이용
```JAVA
public class Programmer {
	private Computer computer;
	
	// 생성자를 이용한 의존성 주입
	public Programmer(Computer computer) {
		this.computer= computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
}
```

2. 설정자 이용
```JAVA
public class Programmer {
	private Computer computer;
	
	// 설정자 이용할 때에는 기본 생성자 만들어 놓기
	public Programmer() {
	}
	
	// setter를 이용한 의존성 주입, 설정자 이용
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
}
```

```JAVA
public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		Programmer p = new Programmer(desktop);
		Programmer p2 = new Programmer();
		
		p2.setComputer(laptop);
		
		p.coding();  // 데스크톱으로 개발을 합니다.
		p2.coding();  // 랩톱으로 개발을 합니다.
	}
}
```

3. 메서드 이용
```JAVA
public class Programmer {
	private Computer computer;
	private Keyboard keyboard;
	
	// 메서드 주입 (여러 개를 동시에 주입할 수 있음)
	public void init(Computer computer, Keyboard keyboard) {
		this.computer = computer;
		this.keyboard = keyboard;
	}
	
	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
}
```

```JAVA
public class ComputerFactory {
	public static Computer getComputer(String type) {
		if(type.equals("D") return new Desktop();
		else if(type.equals("L") return new Laptop();
		return null;
	}
}
```

```JAVA
public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		Scanner sc - new Scanner(System.in);
		
		Programmer p3 = new Programmer();
		
		while(true) {
			p3.setComputer(ComputerFactory.getComputer(sc.next()));
			p3.coding();
            // D 입력 시 -> 데스크톱으로 개발을 합니다.
            // L 입력 시 -> 랩톱으로 개발을 합니다.
		}
		
	}
}
```


---
## Spring Container
- Container
    - 스프링에서 핵심적인 역할을 하는 객체 == Bean(기본 생성자, 직렬화, 필드 별로 `getter`&`setter` 생성)
    - Bean의 인스턴스화 조립, 관리의 역할, 사용 소멸에 대한 처리를 담당  

|이름|설명|  
|---|---|  
|BeanFactory|- 프레임워크 설정과 기본 기능을 제공하는 컨테이너|
||- 모든 유형의 객체를 관리할 수 있는 메커니즘 제공|
|ApplicationContext|- BeanFactory 하위 인터페이스|
||- 이벤트 처리, 국제화용 메시지 처리 등 다양한 기능 제공|
|WebApplicationContext|- 대표적인 구현 클래스로 XmlWebApplicationContext가 있음|

- Spring Container build
    - Project 생성 후 → Maven Project로 변경
    - pom.xml → Spring Context 의존성 추가

- Bean Scope
    - Bean 범위 정의를 통해 객체의 범위를 제어할 수 있음!!
    - `<bean class="com.ssafy.di.Programmer" id="programmer" scope=""></bean>`

|Scope|설명|
|---|---|
|`singleton`|기본값, Spring IoC 컨테이너에 대한 단일 객체 인스턴스|
|`prototype`|빈을 요청할 때마다 새로운 인스턴스 생성|
|`request`|HTTP Request 주기로 빈 인스턴스 생성|
|`session`|HTTP Session 주기로 빈 인스턴스 생성|

---
### XML 방식
__생성자 이용__
- constructor-arg를 이용하여 의존성 주입
- `<ref>`, `<value>`와 같이 하위 태그를 이용
```JAVA
<bean class="com.ssafy.di.Desktop" id="desktop"></bean>
<bean class="com.ssafy.di.Programmer" id="programmer">
	<constructor-arg ref="desktop"></constructor-arg>
</bean>
```

```JAVA
public class Programmer {
	private Computer computer;
	
	// 기본 생성자
	public Programmer() {
	}
	
	// 생성자를 이용한 의존성 주입
	public Programmer(Computer computer) {
		this.computer = computer;
	}
}
```

__설정자 이용__
- `setter`를 이용하여 의존성 주입
- `<ref>`, `<value>`와 같이 하위 태그를 이용

```JAVA
<bean class="com.ssafy.di.Laptop" id="laptop"></bean>
<bean class="com.ssafy.di.Programmer" id="programmer">
	<property name="computer" ref="Laptop"></property>
	// name == 설정자 이름, setComputer에서 set을 제외한 이
</bean>
```

```JAVA
public class Programmer {
	private Computer computer;
	
	// 기본 생성자
	public Programmer() {
	}
	
	// setter를 이용한 의존성 주입
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
```

## Annotation
```JAVA
import org.springframework.stereotype.Component;

@Component  // 객체를 생성할 대상 클래스에 작성해주는 Annotation
public class Desktop implements Computer {
}
```
- 생성되는 빈의 이름은 클래스의 첫 글자를 소문자로 바꾼 것.
- `@Component` 외에도 `@Service`, `@Controller`, `@Repository`

## Java Config
- 
- 
