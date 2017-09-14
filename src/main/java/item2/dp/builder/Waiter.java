package item2.dp.builder;

/**
 * User:    mengxin
 * Date:    12/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.design_pattern
 * Description: Waiter.
 * <p>
 *     This class is Director which use the builder to build the product. This class is decouple the
 *     concrete builder by dependencies on the abstract builder.
 *
 *     There are 3 methods and 1 property at least
 *
 *     <ul>
 *         <li>abstract builder object</li>
 *         <li>abstract builder setter, which can be set with concrete builder</li>
 *         <li>method to get the product by builder, use the get product method in the abstract builder</li>
 *         <li>the process to construct the products by using the create parts methods
 *         in abstract builder that need to implemented in concrete builder.</li>
 *     </ul>
 *
 * </p>
 * @author mengxin
 * @version 1.0
 */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return this.pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
