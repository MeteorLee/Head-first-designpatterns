# 헤드 퍼스트 디자인 패턴 시작

## 0. 디자인 패턴
디자인 패턴은 많은 객체지향적 시스템을 구축한 많은 방법들을 모아서 만든 것으로 디자인에 집중하도록 도와준다.

디자인 패턴
- 패턴을 용어로 사용하면 팀원과의 협업에 큰 도움을 준다.
- 패턴을 사용하면 디자인에 더 초점을 맞출 수 있다.
- 디자인 패턴은 프레임 워크나 라이브러리와 더 상위의 개념이다.


## 1. 전략 패턴 (Strategy Pattern)

전략 패턴
- 전략 패턴은 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘 군을 수정해서 쓸 수 있게 해줍니다. 
- 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다.

객체 지향 원칙
- 바뀌는 부분은 캡슐화한다.
- 상속보다는 구성을 활용한다.
- 구현 보다는 인터페이스에 맞춰서 프로그래밍 한다.

## 2. 옵저버 패턴 (Observer Pattern)

옵저버 패턴
- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의합니다.

객체지향 원칙
- 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다.

## 3. 데코레이터 패턴 (Decorator Pattern) 

데코레이터 패턴
- 객체에 추가 요소를 동적으로 더할 수 있습니다.
- 데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있습니다.

객체지향 원칙
- 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다(OCP)

## 4. 팩토리 패턴 (Factory Pattern) 

팩토리 메소드 패턴 (Factory Method)
- 객체를 생성할 때 필요한 인터페이스를 만듭니다.
- 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정합니다.
- 팩토리 메소드를 사용하면 인스턴스를 만드는 일을 서브클래스에 맡길 수 있습니다.

추상 팩토리 패턴 (Abstract factory)
- 구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생성하는 인터페이스를 제공합니다.
- 구상 클래스는 서브클래스에서 만듭니다.

객체지향 원칙
- 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.
- 가능하면 모든것을 추상화 하라




