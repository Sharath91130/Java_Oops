package Kodnest_Java;

// Base Food class
class Food {
    public Food order() {
        System.out.println("Ordering food");
        return this;
    }
}

class Pizza extends Food {
    public Pizza order() {
        System.out.println("Ordering a pizza");
        return this;
    }
}

class Burger extends Food {
    public Burger order() {
        System.out.println("Ordering a burger");
        return this;
    }
}
class Main{


        public static void main(String[] args) {

            Food food = new Food();
            Pizza pizza = new Pizza();
            Burger burger = new Burger();
            Food orderedFood = food.order();
            Pizza orderedPizza = pizza.order();
            Burger orderedBurger = burger.order();
            System.out.println("Ordered food type: " + orderedFood.getClass().getSimpleName());
            System.out.println("Ordered pizza type: " + orderedPizza.getClass().getSimpleName());
            System.out.println("Ordered burger type: " + orderedBurger.getClass().getSimpleName());
        }
    }


