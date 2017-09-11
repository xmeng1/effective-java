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
public class NutritionFactsBuilder {

    private int servingSize; // (mL) required
    private int servings; // (per container) required
    private int calories; // optional
    private int fat; // (g) optional
    private int sodium; // (mg) optional
    private int carbohydrate; // (g) optional

    public NutritionFactsBuilder() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
