package science.mengxin.java.effective.item2;

/**
 * User:    mengxin
 * Date:    11/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2
 * Description: NutritionFacts.
 *
 * @author mengxin
 * @version 1.0
 */
public class NutritionFactsConstructor {

    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // optional
    private final int fat; // (g) optional
    private final int sodium; // (mg) optional
    private final int carbohydrate; // (g) optional

    public NutritionFactsConstructor(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFactsConstructor(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFactsConstructor(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFactsConstructor(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFactsConstructor(int servingSize, int servings,

            int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;

    }
}
