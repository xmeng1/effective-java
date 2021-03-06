package science.mengxin.java.effective.item16;

import java.util.Arrays;
import org.junit.Test;
import science.mengxin.java.effective.item16.inheritance.InstrumentedHashSet;

/**
 * User:    mengxin
 * Date:    21/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16
 * Description: Item16Test.
 *
 * @author mengxin
 * @version 1.0
 */
public class Item16Test {
    @Test
    public void inheritanceTest() {
        InstrumentedHashSet<String> s =
                new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        // s.getAddCount() should be 3
        assert s.getAddCount() == 6;
        // you will find the output :
        // addAll invoke and addCount: 3
        // add invoke and addCount: 4
        // add invoke and addCount: 5
        // add invoke and addCount: 6

        // The reason for this is that the addAll() will invoke the add(),
        // we also override the add() method, so the add() is also invoked.
    }
}
