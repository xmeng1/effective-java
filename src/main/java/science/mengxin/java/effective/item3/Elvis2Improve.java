package science.mengxin.java.effective.item3;

import java.io.Serializable;

/**
 * User:    mengxin
 * Date:    14/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item3
 * Description: Elvis2.
 *
 * @author mengxin
 * @version 1.0
 */

//Singleton with static factory

//One advantage of the factory-method approach is that it gives you the flexibility to change your mind about whether the class should be a singleton without changing its API. The factory method returns the sole instance but could easily be modified to return, say, a unique instance for each thread that invokes it. A second advantage, concerning generic types, is discussed in Item 27. Often neither of these advantages is relevant, and the final-field approach is simpler.
public class Elvis2Improve implements Serializable {

    private static final Elvis2Improve INSTANCE = new Elvis2Improve();

    private Elvis2Improve() {
    }

    public static Elvis2Improve getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Wo,wo Elvis1 leave the building");
    }

    //for deserialization
    //readResolve method to preserve singleton property
    //sf: readResolve is used for replacing the object read from the stream. The only use I've ever seen for this is enforcing singletons; when an object is read, replace it with the singleton instance. This ensures that nobody can create another instance by serializing and deserializing the singleton.
    //https://stackoverflow.com/questions/1168348/java-serialization-readobject-vs-readresolve
    private Object readResolve() {
        //Return the one true Elvis and let the garbage collector
        //take care of the Elvis impersonator.
        return INSTANCE;
    }
}
