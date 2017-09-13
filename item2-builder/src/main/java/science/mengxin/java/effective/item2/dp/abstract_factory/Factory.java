package science.mengxin.java.effective.item2.dp.abstract_factory;

/**
 * User:    mengxin
 * Date:    13/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.dp.abstract_factory
 * Description: Factory.
 *
 * @author mengxin
 * @version 1.0
 */
public abstract class Factory {
    protected Expression prototype = null;
    public Expression makePhrase()
    {
        return prototype.cloan();
    }
    public abstract Expression makeCompromise();
    public abstract Expression makeGrade();
}
