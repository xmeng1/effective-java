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
public class Elvis1Improve {
    //This it the first method to implement the singleton
    public static Elvis1Improve INSTANCE = null;

    static {
        try {
            INSTANCE = new Elvis1Improve();
        } catch (Elvis1ImproveException e) {
            e.printStackTrace();
        }
    }

    private Elvis1Improve() throws Elvis1ImproveException {
        if (INSTANCE!=null){
            throw new Elvis1ImproveException("You cannot invoke this method at any time.");
        }
    }

    public void leaveTheBuilding() {
        System.out.println("Wo,wo Elvis1 leave the building");
    }
}

