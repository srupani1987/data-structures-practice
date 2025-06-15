package design.patterns.builder;

public class MealBuilderTest {
    public static void main(String[] args) {
        Meal meal = new Meal.MealBuilder()
                .withCost(20.00)
                .withTakeout(true)
                .withMain("Burger")
                .withDrink("Coke")
                .build();

        System.out.println(meal.getCost());
        System.out.println(meal.getTakeout());
        System.out.println(meal.getMain());
        System.out.println(meal.getDrink());
    }
}
