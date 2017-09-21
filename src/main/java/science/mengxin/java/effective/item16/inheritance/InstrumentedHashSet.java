package science.mengxin.java.effective.item16.inheritance;

import java.util.Collection;
import java.util.HashSet;

/**
 * User:    mengxin
 * Date:    21/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16.inheritance
 * Description: InstrumentedHashSet.
 *
 * @author mengxin
 * @version 1.0
 */
// Broken - Inappropriate use of inheritance!
public class InstrumentedHashSet<E> extends HashSet<E> {

    // The number of attempted element insertions
    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        System.out.println("add invoke and addCount: " + addCount);
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        System.out.println("addAll invoke and addCount: " + addCount);
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}



