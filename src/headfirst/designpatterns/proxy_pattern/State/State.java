package headfirst.designpatterns.proxy_pattern.State;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
