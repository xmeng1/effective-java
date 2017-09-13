package science.mengxin.java.effective.item2.dp.abstract_factory;

/**
 * User:    mengxin
 * Date:    13/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.dp.abstract_factory
 * Description: NotPCFactory.
 *
 * @author mengxin
 * @version 1.0
 */
public class NotPCFactory extends Factory
{
    public NotPCFactory()
    {
        prototype = new NotPCPhrase();
    }
    public Expression makeCompromise()
    {
        return new Expression("\"my way, or the highway\"");
    }
    public Expression makeGrade()
    {
        return new Expression("\"take test, deal with the results\"");
    }
}
