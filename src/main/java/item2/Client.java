package item2;

/**
 * User:    mengxin
 * Date:    11/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2
 * Description: Client.
 *
 * @author mengxin
 * @version 1.0
 */
public class Client {
    public static void main(String[] args){
        //how to use the builder to builder object
        NutritionFactsBuilder cocaCola = new NutritionFactsBuilder.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
        NutritionFactsBuilder energyBar = new NutritionFactsBuilder.Builder(240,8).preTrainingSet().build();

        System.out.println(cocaCola.toString());
        System.out.println(energyBar.toString());
    }
}
