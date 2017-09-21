package science.mengxin.java.effective.item2.dp.builder;

/**
 * User:    mengxin
 * Date:    12/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item2.design_pattern
 * Description: BuilderExample.
 *
 * @author mengxin
 * @version 1.0
 */
public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        // someone ask for the hawaiian pizza.
        // waiter take out of the hawaiian pizza builder
        waiter.setPizzaBuilder( hawaiianPizzaBuilder );
        // waiter use the builder to construct the pizza.
        waiter.constructPizza();
        // get the pizza from the waiter
        Pizza pizza = waiter.getPizza();
        System.out.println("HawaiianPizza: " + pizza);

        // someone ask for the spicy pizza.
        // waiter take out of the spicy pizza builder
        waiter.setPizzaBuilder( spicyPizzaBuilder );
        // waiter use the builder to construct the pizza.
        waiter.constructPizza();
        // get the pizza from the waiter
        Pizza spicyPizza = waiter.getPizza();
        System.out.println("SpicyPizza: " + spicyPizza);

    }
}
