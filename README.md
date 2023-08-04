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

## 4. 팩토리 패턴 (Factory Pattern) & 추상 팩토리 패턴 (Abstract factory)

팩토리 메소드 패턴 (Factory Method)
- 객체를 생성할 때 필요한 인터페이스를 만듭니다.
- 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정합니다.
- 팩토리 메소드를 사용하면 인스턴스를 만드는 일을 서브클래스에 맡길 수 있습니다.

추상 팩토리 패턴
- 구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생성하는 인터페이스를 제공합니다.
- 구상 클래스는 서브클래스에서 만듭니다.

객체지향 원칙
- 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.
- 가능하면 모든것을 추상화 하라

## 5. 싱글턴 패턴 (Singleton Pattern)

싱글턴 패턴
- 클래스 인스턴스를 하나만 만들고, 그 인스턴스를 전역 접근을 제공합니다.

자바에서 싱글톤
- enum을 통해서 만드는게 가장 좋은 방법입니다.

## 6. 커맨드 패턴 (Command Pattern)

커맨드 패턴
-  요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변화할 수 있습니다.
- 요청하는 객체와 요청을 수행하는 객체를 분리하고 싶다면 커맨드 패턴을 사용하면 됩니다.
- 이러면 요청을 큐에 저장하거나 로그로 기록하거나 작업 취소 기능을 사용할 수 있습니다.

## 7. 어댑터 패턴 (Adapter Pattern) & 퍼사드 패턴 (Facade Pattern)

어댑터 패턴
- 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환합니다.
- 인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 도와줍니다.
- 어댑터는 인터페이스를 변환함

퍼사드 패턴
- 서브 시스템에 있는 일련의 인터페이스를 통합 인터페이스로 묶어 줍니다.
- 고수준 인터페이스도 정의하므로 서브 시스템을 더 편리하게 사용할 수 있습니다.
- 퍼사드는 인터페이스를 통합, 단순화함

객체지향 원칙
- 진짜 절친에게만 이야기해야 한다.
  - 최소 결합을 해야한다는 사실을 알려주는 새로운 원칙이 추가됨(최소 지식 원칙)

## 8. 템플릿 메소드 패턴 (Template Method Pattern)

템플릿 메소드 패턴
- 알고리즘의 골격을 정의합니다.
- 템플릿 메소드를 사용하면 알고리즘의 일부 단계를 서브클래스에서 구현할 수 있으며, 알고리즘의 구조는 그대로 유지하면서 알고리즘의 특정 단계를 서브클래스에서 재정의할 수도 있습니다.

객체지향 원칙
- 먼저 연락하지 마세요. 저희가 연락 드리겠습니다.
  - 할리우드에서 배우들과 연락하는 것과 비슷해서 할리우드 원칙이라고 한다.
  - 슈퍼클래스에서 모든 것을 관리하고 필요한 서브클래스를 불러서 써야 한다는 원칙입니다.
  - 저수준의 모듈을 언제 어떻게 호출할지는 고수준 모듈에서 결정하는 것이 좋다.

## 9. 반복자 패턴 (Iterator Pattern) & 컴포지트 패턴 (Composite Pattern)

반복자 패턴
- 컬렉션의 구현 방법을 노출하지 않으면서 집합체 내의 모든 항목에 접근하는 방법을 제공합니다.

컴포지트 패턴
- 객체를 트리구조로 구성해서 부분-전체 계층구조를 구현합니다.
- 컴포지트 패턴을 사용하면 클라이언트에서 개별 객체와 복합 객체를 똑같은 방법으로 다룰 수 있습니다.

객체지향 원칙
- 어떤 클래스가 바뀌는 이유는 하나뿐이어야 한다. (단일 역할 원칙)


## 10. 상태 패턴 (State Pattern)

상태 패턴
- 객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바뀔 수 있도록 해 줍니다.
마치 객체의 클래스가 바뀌는 것과 같은 결과를 얻을 수 있습니다.