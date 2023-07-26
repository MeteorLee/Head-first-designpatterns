package headfirst.designpatterns.전략_패턴;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다.");
    }
}
