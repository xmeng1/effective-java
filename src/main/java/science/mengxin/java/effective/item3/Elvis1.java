package science.mengxin.java.effective.item3;

/**
 * User:    mengxin
 * Date:    14/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item3
 * Description: Elvis.
 *
 * @author mengxin
 * @version 1.0
 */

//Singleton with public final field
//  The main advantage of the public field approach is that the declarations make it clear that the class is a singleton: the public static field is final, so it will always contain the same object reference.
// There is no longer any performance advantage to the public field approach: modern Java virtual machine (JVM) implementations are almost certain to inline the call to the static factory method.

public class Elvis1 {
    //This it the first method to implement the singleton
    public static final Elvis1 INSTANCE = new Elvis1();

    private Elvis1() {
    }

    public void leaveTheBuilding() {
        System.out.println("Wo,wo Elvis1 leave the building");
    }
}
