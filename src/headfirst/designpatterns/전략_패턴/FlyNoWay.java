package headfirst.designpatterns.전략_패턴;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날지 못해요");
    }
}
