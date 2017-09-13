package science.mengxin.java.effective.item2.dp.abstract_factory;

/**
 * User:    mengxin
 * Date:    13/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.dp.abstract_factory
 * Description: PCFactory.
 *
 * @author mengxin
 * @version 1.0
 */
public class PCFactory extends Factory
{
    public PCFactory()
    {
        prototype = new PCPhrase();
    }
    public Expression makeCompromise()
    {
        return new Expression("\"do it your way, any way, or no way\"");
    }
    public Expression makeGrade()
    {
        return new Expression("\"you pass, self-esteem intact\"");
    }
}
