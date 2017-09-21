package science.mengxin.java.effective.item2.dp.abstract_factory;

/**
 * User:    mengxin
 * Date:    13/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item2.dp.abstract_factory
 * Description: FactoryFmProto.
 *
 * @author mengxin
 * @version 1.0
 */
public class Client
{


    public static void main(String[] args)
    {
        Factory factory;
        if (args.length > 0)
            factory = new PCFactory();
        else
            factory = new NotPCFactory();
        for (int i = 0; i < 3; i++)
            System.out.print(factory.makePhrase() + "  ");
        System.out.println();
        System.out.println(factory.makeCompromise());
        System.out.println(factory.makeGrade());
    }


}
