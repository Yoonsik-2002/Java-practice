# Java_practice
**1. 자바의 특징**
- 플랫폼 독립성
  - 하드웨어, 운영체제 등 플렛폼에 종속되지 않음.
  - 자바 가상 기계만 있으면 하드웨어/운영체제를 막론하고 실행 가능.

- 객체 지향 
  - 자바는 객체 지향(C는 절차지향) 언어로서 캡슐화, 상속, 다형성을 지원함.
  - 객체지향 프로그램은 해결할 과제를 객체 간의 상호관계로 모델링하여 인간의 사고와 가깝게 표현함.

- 클래스로 캡슐화 
  - 변수나 메소드는 반드시 클래스 내에 구현하도록 한다. (클래스에 속하지 않은 변수나 메소드는 있을 수 없음)
  - 자바는 클래스 안에 새로운 클래스, 즉 내부 클래스를 만들 수 있다.

- 소스와 클래스 파일
  - 클래스 파일에는 반드시 하나의 자바 클래스만 들어있다.
  - 하나의 자바소스 파일에 작성된 클래스 중 오직 한 클래스만 public으로 선언할 수 있다.
  - 소스 파일내에 public으로 선언된 클래스의 이름으로 자바소스 파일을 저장해야 한다.

- 패키지
  - 서로 관련있는 클래스는 패키지로 묶어 관리한다. 패키지는 파일 시스템의 폴더와 같은 개념이다.

**2. 자바 프로그램의 구조**

- 클래스 만들기
  - 클래스를 만들고, 그 안에 변수, 상수, 함수(메소드) 등 모든 프로그램 요소를 작성한다.
  - 클래서 바깥에 어떤 것도 작성해서는 안된다.
 
```Java
public class Hello {
  ...
}
```

- main() 메소드
  - 자바 프로그램은 다음과 같은 형식의 main() 메소드에서부터 실행을 시작한다.
  - main()은 반드시 public, static, void 타입으로 선언되어야 한다.
  - 한 클래스에 2개 이상의 main()을 작성하면 안된다.
 
```Java
public class Hello {
  public static void main(String[] args) {
    ...
}
```

- 메소드 
  - 클래스의 멤버 함수를 자바에서는 메소드(method)라고 부른다.
  - 메소드의 이름은 개발자가 지정, 개수의 제한은 없다. 메소드의 작성과 호출방법은 기본적으로 C/C++의 함수와 같다.
  
```java
public static int sum(int n, int m) {
  return n + m; // n과 m의 합 리턴
}

다음은 메소드 sum()을 호출하는 코드이다.

```java
int i = 20;
s = sum (i < 10); // n에 20, m에 10 부여, sum함수를 이용하여 둘을 더한 값을 s에 저장.
```  

- 화면 출력
   - 프로그램에서 사용하는 데이터를 화면에 출력하기 위해서는 System.out.println()이나 System.out.print()를 이용하면 된다.
   - System.out.println() = 출력후, 다음행 이동
   - System.out.print() = 다음줄로 넘어가지 않음

```java
System.out.println("Hello");
System.out.print(3);
```

**3. 자바에서 키 입력**

- System.in
  - System.in은 키보드 장치를 직접 제어하고 키 입력을 받는 표준 입력 스트림 객체이다. 
  - System.in은 입력된 키를 단순한 바이트 정보로 응용프로그램에게 제공한다. -> 응용 프로그램은 받은 바이트 정보를 문자나 숫자로 변환해야 함.
  - Scanner 클래스를 사용하여 키보드에서 입력된 문자나 정수, 실수 문자열들을 사용자가 원하는 타입으로 변환해 주어야 함.

- Scanner를 이용한 키 입력

  Scanner는 응용프로그램이 키 입력을 쉽게 받을 수 있도록 자바 패키지에서 제공하는 클래스이다.
  
  - Scanner 객체 생성
    - 다음과 같이 Scanner 객체를 생성한다.

      ```java
      Scanner scanner = new Scanner(System.in); // 객체를 생성할 때는 new 태그를 사용한다.
      ```
      
  - import 문 사용
    - Scanner를 사용하기 위해서는 프로그램의 맨 앞줄에 다음 import 문이 필요하다.

      ```java
      import java.util.Scanner;
      ```
    
    - Scanner클래스는 자바에서 제공되는 java.util패키지에 있으므로, 이 import문을 통해 Scanner의 경로명이 java.Util.Scanner 임을 나타낸다.
      
  - Scanner 클래스로 키 입력받기
    - Scanner 클래스는 사용자가 입력하는 키 값을 공백 문자(' ', '\t', '\n')를 기준으로 분리하여 **토큰 단위**로 읽는다.

  - Scanner 객체 닫기
    - scanner 객체의 사용을 종료하려면 다음과 같이 닫아 준다. 
    
    ```java
    scanner.close();
    ```
    
- scanner 클래스의 주요 메소드 
  - String next() : 다음 토큰을 문자열로 리턴
  - byte nextByte() : 다음 토큰을 byte 타입으로 리턴
  - short nextShort() :  다음 토큰을 short 타입으로 리턴
  - int nextInt() : 다음 토큰을 int 타입으로 리턴
  - long nextlong() : 다음 토큰을 long 타입으로 리턴
  - flat nextFloat() : 다음 토큰을 float 타입으로 리턴
  - double nextDouble() : 다음 토큰을 double 타입으로 리턴
  - boolean nextBoolean() :  다음 토큰을 boolean 타입으로 리턴

**반복문 for**
- for문의 특이한 형태 
  - 무한반복
    
    ```java
    for (초기작업; true; 반복 후 작업) {   // 반복 조건이 true이면 무한반복
      ...
    }
    ```
    
    ```java
    for (초기작업; ;반복 후 작업) {   // 반복조건이 비어있으면 true로 간주, 무한반복
      ...
    }
    ```
    
   - 여러 문장 나열
   
   ```java
   for (i = 0, i < 10; i++, System.out.println(i)) {
      ...
   }
   ```
   
  - for문 내에 변수 선언
  
  ```java
  for (int i = 0; i < 10; i++) {
      ...
  }
  ```

 
 

