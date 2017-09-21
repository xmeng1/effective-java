package science.mengxin.java.effective.item2.dp.builder;

/**
 * User:    mengxin
 * Date:    12/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item2.design_pattern
 * Description: Pizza.
 * <p>
 *      x§
 *
 * </p>
 * @author mengxin
 * @version 1.0
 */

public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough)     { this.dough = dough; }
    public void setSauce(String sauce)     { this.sauce = sauce; }
    public void setTopping(String topping) { this.topping = topping; }

    @Override
    public String toString() {
        return "Pizza with" + " dough:" + dough + " sauce:" + sauce + " topping:" + topping;
    }
}
