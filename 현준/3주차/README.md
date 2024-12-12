# java-spring-study

# 클래스 Class

객체를 만들기 위한 설계도

객체의 속성(필드)와 행동(메서드)를 정의

```java
public class Car {
    String color;   // 속성
    int speed;      // 속성

    public void drive() { // 행동
        System.out.println("Driving...");
    }
}
```

`Car` 클래스

# 객체 Object

클래스를 기반으롤 만들어진 실체

클래스에 정의된 속성과 행동을 가짐

```java
Car myCar = new Car(); // Car 클래스의 객체 생성
```

- `myCar`는 `Car` 클래스를 기반으로 만든 하나의 **객체**
- 이제 `myCar`라는 이름을 통해 `Car`의 속성(예: `color`, `speed`)과 행동(예: `drive()`)을 사용 가능

# 인스턴스 Instance

특정 클래스에서 만들어진 객체를 강조할 때 사용하는 더 구체적인 표현

```java
Car myCar = new Car();
Car yourCar = new Car();
```

- 여기서 `myCar`와 `yourCar`는 `Car` 클래스의 **인스턴스**
- "인스턴스"라는 용어를 사용하는 이유는 `myCar`와 `yourCar`가 같은 클래스(`Car`)를 기반으로 만들어졌지만, 각각 독립적인 메모리 공간을 가지기 때문

# Framework

: 클래스와 인터페이스의 집합 / 뼈대, 틀

의존성 주입을 통한 객체 관계 구성

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/38c22652-dc3b-452e-8786-5601c671c0ca/image.png)

### 패키지 선언

```java
package com.ssafy.di1_의존성개념;
```

- 이 코드는 `com.ssafy.di1_의존성개념`  이라는 패키지에 속한다
- `Desktop` 이라는 이름의 클래스가 다른 패키지에 존재하더라도 각 패키지 이름이 다르면 충돌하지 않는다

### 클래스 선언

```java
public class Desktop {
```

- `Desktop` 이라는 이름의 클래스를 정의한다
- `public` 접근 제어자 : 다른 패키지에서도 이 클래스를 사용할 수 있다
- 클래스는 Java의 기본 구성 단위로 객체를 생성하기 위한 설계도

### 멤버 필드

```java
// private String CPU;
// private String RAM;
// ...작성을 할 수 있다. 오늘은 필요 없어
```

- 클래스 내부에 데이터(상태)를 저장하기 위해 멤버 필드(속성)를 추가할 수 있다
- `private`  : 외부 클래스에서 접근할 수 없도록 설정하여 정보 은닉(캡슐화)
- 클래스는 Java의 기본 구성 단위로 객체를 생성하기 위한 설계도

### getInfo 메서드

```java
public String getInfo() {
    return "데스크탑";
}
```

- `Desktop` 객체에 대한 정보를 제공하는 역할을 하는 메서드
- `getInfo` 메서드 이름
- `String` : 메서드가 반환하는 값이 문자열
- return “데스크탑” : 메서드가 호출될 때 반환할 값을 지정

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/0372092f-830d-4627-9d65-4d9a8909aa8f/image.png)

### 클래스 선언

```java
public class Programmer {
```

`Programmer` 라는 이름의 클래스 선언

### 멤버 필드

```java
private Desktop desktop;
```

- `Desktop` 클래스의 모든 속성과 메서드를 `desktop` 변수를 통해 사용할 수 있다
- `Programmer` 클래스는 `Desktop` 클래스에 강하게 의존

### 생성자

```java
public Programmer() {
    this.desktop = new Desktop();
}
```

- `Programmer()` 생성자 : 클래스 이름과 동일한 이름을 가지며 **객체가 초기화될 때 자동으로 호출**
- `this.desktop = new Desktop();` : Programmer 클래스의 객체를 생성할 때마다 Desktop 클래스의 객체를 생성하여 `desktop` 변수에 저장하는 초기화 작업이 이루어짐

### coding() 메서드

```java
public void coding() {
    System.out.println(desktop.getInfo() + "으로 개발을 합니다.");
}
```

- `Desktop` 객체의 getInfo() 메서드를 호출하여 컴퓨터 정보를 가져오고 출력

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/a185e344-39cd-404c-aed1-142e6c1642a0/image.png)

### 클래스 선언

```java
public class Test {
```

- `Test`는 프로그램의 **진입점(Entry Point)** 역할을 하는 클래스
- **`main()` 메서드**를 포함하고 있으므로 이 프로그램은 이곳에서 실행을 시작

```java
public static void main(String[] args) {
// 프로그램 실행 시작
}
```

- **`main()` 메서드**는 자바 프로그램이 실행될 때 가장 먼저 호출되는 메서드
- **`String[] args`**: 명령줄 인자를 받을 수 있는 배열(현재는 사용하지 않음)

### 객체 생성

```java
Programmer p = new Programmer();
```

- `new Programmer()`를 통해 `Programmer` 클래스의 **생성자**가 실행
- `Desktop` 객체가 생성되고 `desktop` 변수에 저장
- 생성된 객체의 참조를 변수 `p`에 저장

### 메서드 호출

```java
p.coding();
```

- `Programmer` 객체 `p`의 `coding()` 메서드를 실행
- `desktop.getInfo()`를 호출하여 `Desktop` 객체에서 컴퓨터 정보를 가져옴
- `"데스크탑으로 개발을 합니다."`라는 메시지를 출력

여기서 Programmer 클래스는 Desktop 클래스에 의존하고 있다.

- `Programmer` 객체가 생성될 때 내부에서 `Desktop` 객체도 자동으로 생성

만약 `Desktop` 클래스를 변경하거나 다른 컴퓨터(예: `Laptop` 클래스)를 사용하려면 `Programmer` 코드도 수정해야 합니다.

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/6bf3ae0e-8380-4da0-8677-aaa95c20e8a5/image.png)

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/092be2a9-8364-478e-9b2a-42cd780b0b76/image.png)

# 타입의존성 제거

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/710d1610-e5c2-4863-976b-c68f088e1af3/image.png)

랩탑 추가

Programmer.java에서 desktop 을 laptop으로 바꿔야한다. 타입의존성 존재

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/6dd77cb1-1766-444e-a98a-c594dd7cd485/image.png)

Desktop과 Laptop을 하나의 Interface로 설계

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/74b357f8-52f1-49ce-9e96-be7636ef1a2e/image.png)

Desktop과 Laptop에 implements Computer 추

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/f5efa159-aa12-4b94-85be-d6b1da214242/image.png)

Computer로 변경 

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/efc5989f-21f4-47b6-913e-62b971281edd/image.png)

다형성 성질, 느슨한 결합

# 의존성 주입

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/f1c73224-2b71-45e9-ba68-c7ac1e33e6e3/image.png)

생성자 Programmer를 통해 Computer를 주입

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/aac138ec-c21c-4a21-b286-4ec5e261de47/image.png)

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/58dab5e1-9a1f-4623-9587-f8d332a05de1/image.png)

객체 생성시에 할당하지 않고 p2가 가지고 있는 setComputer를 통해서 부여.

이때 생성자가 없으면 기본 생성자가 자동으로 만들어지지만 생성자를 하나 더 추가하면 기본 생성자가 만들어지지 않는다. → 클래스를 만들면 기본 생성자는 일단 만들자

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/938c8d24-388f-48e6-b689-a7c5c675c9db/image.png)

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/6e4598d7-acf5-4319-96f8-e8a529bb0656/image.png)

실행환경에서 내가 조작한대로 동작하는 방식

# Spring IOC Container

### Container

스프링에서 핵심적인 역할을 하는 객체 Bean(만들때 기본생성자, 직렬화, 필드별로 getter setter)

Bean의 인스턴스화 조립, 관리의 역할, 사용 소멸에 대한 처리를 담당 

BeanFactory 에서 출발해서 ApplicationContext라는  설정을 읽어서 처리할 수 있다

→ 이를 위해 설정 정보를 위한 파일이 필요

작성 방식에는 XML방식, Annotation 방식, Java Config 방식

Spring을 가져다 사용하기 위해서는 jar 파일을 추가해야 한다. 

→ 두가지 방식 중 Maven  

프로젝트 “Configure” → “Convert to Maven project”

https://mvnrepository.com/

spring 검색 → spring content → 최신 버전 Maven 복사 → pom.xml에 <dependencies> 내에 작성 → Maven Dependencies 생성된 것 확인

설정파일을 작성 → src폴더와 설정폴더를 구분하기 위해 Source Folder 생성(resources) → spring 설정파일들 넣기 위해 new, other XML파일 applicationContext.xml로 이름 → 설정 공식 홈페이지에서 복사 가져오기

클래스들을 빈으로 등록하여 관리

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/d15a2f40-ed80-4d6a-ae52-02de04e7ff14/image.png)

id는 지칭할 이름

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/5a0f55c5-2b89-48d5-981f-f4e1d74419f9/272eea7b-e7ee-4716-9112-c9c47f482cc3/image.png)

GenericXmlApplicationContext(”설정 파일들에 대한 경로”)

context가 가지고 있는 getBean이라는 메서드 동작 ( 반환 타입이 Object → 형변환 )

기본적으로 싱글턴으로 관리