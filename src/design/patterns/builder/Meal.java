package design.patterns.builder;

/**
 * Immutable Meal	        -> Thread-safe, easier to reason about
 * No setters exposed	    -> Encapsulation is preserved
 * Inner builder class	    -> Keeps builder logic scoped to Meal
 * Fluent naming (withX)    -> More expressive and readable
 * Separation of concerns	-> Builder handles construction only
 */
public class Meal {
    private final double cost;
    private final boolean takeOut;
    private final String main;
    private final String drink;

    private Meal(MealBuilder builder) {
        this.cost = builder.cost;
        this.takeOut = builder.takeOut;
        this.main = builder.main;
        this.drink = builder.drink;
    }

    public double getCost() {
        return cost;
    }

    public boolean getTakeout() {
        return takeOut;
    }

    public String getMain() {
        return main;
    }

    public String getDrink() {
        return drink;
    }
    public static class MealBuilder {
        private double cost;
        private boolean takeOut;
        private String main;
        private String drink;

        public MealBuilder withCost(double cost) {
            this.cost = cost;
            return this;
        }

        public MealBuilder withTakeout(boolean takeOut) {
            this.takeOut = takeOut;
            return this;
        }

        public MealBuilder withMain(String main) {
            this.main = main;
            return this;
        }

        public MealBuilder withDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
