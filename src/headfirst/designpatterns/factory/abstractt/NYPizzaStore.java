package headfirst.designpatterns.factory.abstractt;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(nyIngredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(nyIngredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(nyIngredientFactory);
            pizza.setName("뉴욕 스타일 페페로니 피자");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(nyIngredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        }

        return pizza;
    }
}
