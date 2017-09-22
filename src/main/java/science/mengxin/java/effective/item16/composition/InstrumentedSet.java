package science.mengxin.java.effective.item16.composition;

import java.util.Collection;
import java.util.Set;

/**
 * User:    mengxin Date:    22/09/2017 Project: effective-java Package:
 * science.mengxin.java.effective.item16.composition Description: InstrumentedSet.
 *
 * @author mengxin
 * @version 1.0
 */
public class InstrumentedSet <E> extends ForwardingSet <E>{

    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
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
