package headfirst.designpatterns.프록시_패턴.상태;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
