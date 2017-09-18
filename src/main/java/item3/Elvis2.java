package item3;

import java.io.Serializable;

/**
 * User:    mengxin
 * Date:    14/09/2017
 * Project: effective-java
 * Package: item3
 * Description: Elvis2.
 *
 * @author mengxin
 * @version 1.0
 */

//Singleton with static factory

//One advantage of the factory-method approach is that it gives you the flexibility to change your mind about whether the class should be a singleton without changing its API. The factory method returns the sole instance but could easily be modified to return, say, a unique instance for each thread that invokes it. A second advantage, concerning generic types, is discussed in Item 27. Often neither of these advantages is relevant, and the final-field approach is simpler.
public class Elvis2 implements Serializable{
    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {  }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }
    public void leaveTheBuilding() {
        System.out.println("Wo,wo Elvis1 leave the building");
    }
}
