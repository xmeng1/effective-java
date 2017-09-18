package item3;

/**
 * User:    mengxin
 * Date:    18/09/2017
 * Project: effective-java
 * Package: item3
 * Description: Elvis3.
 *
 * @author mengxin
 * @version 1.0
 */
// Enum singleton - the prefered approach
public enum Elvis3 {
    INSTANCE;

    Elvis3() {
    }

    public void leaveTheBuilding() { System.out.println("Wo,wo Elvis1 leave the building"); }
}
