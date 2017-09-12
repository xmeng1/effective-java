package science.mengxin.java.effective.item2.design_pattern;

/**
 * User:    mengxin
 * Date:    12/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.design_pattern
 * Description: Pizza.
 * <p>
 *     This class is "Product", the target we need to build.
 *     There is no constructor for the class. we can set several setter for the properties.
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
