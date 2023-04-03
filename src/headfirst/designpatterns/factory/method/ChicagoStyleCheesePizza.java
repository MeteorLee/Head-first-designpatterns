package headfirst.designpatterns.factory.method;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "시카코 스타일 딥 디쉬 치즈 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "틀럼토마토 소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");

    }

    @Override
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}