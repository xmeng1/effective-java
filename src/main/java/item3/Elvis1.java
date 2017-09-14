package item3;

/**
 * User:    mengxin
 * Date:    14/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item3
 * Description: Elvis.
 *
 * @author mengxin
 * @version 1.0
 */

//Singleton with public final field
public class Elvis1 {
    //This it the first method to implement the singleton
    public static final Elvis1 INSTANCE = new Elvis1();

    private Elvis1() {
    }

    public void leaveTheBuilding() {
        System.out.println("Wo,wo Elvis1 leave the building");
    }
}
