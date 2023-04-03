package headfirst.designpatterns.templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void pourInCup() {
        System.out.println("텁에 따르는 중");
    }

    
}
