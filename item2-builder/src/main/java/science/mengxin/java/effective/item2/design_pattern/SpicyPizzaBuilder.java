package science.mengxin.java.effective.item2.design_pattern;

/**
 * User:    mengxin
 * Date:    12/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.design_pattern
 * Description: SpicyPizzaBuilder.
 *
 * @author mengxin
 * @version 1.0
 */
public class SpicyPizzaBuilder extends PizzaBuilder{

    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
