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

    //step 1: change member properties
    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // optional
    private final int fat; // (g) optional
    private final int sodium; // (mg) optional
    private final int carbohydrate; // (g) optional

    @Override
    public String toString() {
        return new StringBuilder()
                .append(" servingSize: ").append(servingSize)
                .append(" servings: ").append(servings)
                .append(" calories: ").append(calories)
                .append(" fat: ").append(fat)
                .append(" sodium: ").append(sodium)
                .append(" carbohydrate: ").append(carbohydrate).toString();
    }

    //step 3: create the corresponding constructor to use builder inner class object to make target class object
    public NutritionFactsBuilder(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    //step 2: create inner static class for transfer information as builder
    public static class Builder {

        //step2-1: required parameters are final
        private final int servingSize; // (mL) required
        private final int servings; // (per container) required

        //step2-2: optional paramters are not final
        private int calories; // optional
        private int fat; // (g) optional
        private int sodium; // (mg) optional
        private int carbohydrate; // (g) optional

        //step2-3: create constructor to initial the final properties (The Intellij will automatically choose the two parameters.)
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        //step2-4: create method to set the other optional properties, these method should return this, which is the builder itself which used for chain operation.
        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        //step2-5: we can also make some predefined method
        public Builder preTrainingSet() {
            calories = 1000;
            fat = 50;
            carbohydrate = 40;
            sodium = 10;
            return this;
        }

        //step2-6: create public build method to return the target class by using this builder

        public NutritionFactsBuilder build(){
            return new NutritionFactsBuilder(this);
        }

    }


}
