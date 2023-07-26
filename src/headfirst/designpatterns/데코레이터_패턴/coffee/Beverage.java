package headfirst.designpatterns.데코레이터_패턴.coffee;

public abstract class Beverage {

    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
