package headfirst.designpatterns.전략_패턴;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
