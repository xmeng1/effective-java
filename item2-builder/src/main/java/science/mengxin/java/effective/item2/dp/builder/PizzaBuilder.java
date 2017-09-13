package science.mengxin.java.effective.item2.dp.builder;

/**
 * User:    mengxin
 * Date:    12/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.design_pattern
 * Description: PizzaBuilder.
 * <p>
 *     this class is the Abstract Builder. For this class we need have 2 method and 1 property at least.
 *     <ul>
 *         <li>Product object</li>
 *         <li>Product object getter</li>
 *         <li>Product instance creation method</li>
 *     </ul>
 * </p>
 * <p>Then it can add other abstract method to build parts for the product.</p>
 * @author mengxin
 * @version 1.0
 */
public abstract class PizzaBuilder {
    //1.
    protected Pizza pizza;
    //2.
    public Pizza getPizza() {
        return pizza;
    }
    //3/
    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    //build parts abstract methods
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
