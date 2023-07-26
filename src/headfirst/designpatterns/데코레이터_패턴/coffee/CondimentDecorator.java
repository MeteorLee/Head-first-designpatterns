package headfirst.designpatterns.데코레이터_패턴.coffee;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
