package science.mengxin.java.effective.item2.dp.builder;

/**
 * User:    mengxin
 * Date:    12/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item2.design_pattern
 * Description: HawaiianPizzaBuilder.
 * <p>
 *     The concrete builder which need to extend the abstract builder and implement the abstract
 *     methods that build parts.
 * </p>
 * @author mengxin
 * @version 1.0
 */
public class HawaiianPizzaBuilder extends PizzaBuilder{

    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
