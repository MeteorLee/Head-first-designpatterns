package headfirst.designpatterns.팩토리_패턴.method;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("준비 중" + name);
        System.out.println("도우 돌리는 중");
        System.out.println("소스 뿌리는 중");
        System.out.println("토핑 올리는 중");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    
    void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }
    void box() {
        System.out.println("피자 박스에 담기");
    }

    public String getName() {
        return name;
    }
}
