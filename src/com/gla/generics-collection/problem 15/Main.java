
package com.gla.generics-collections;

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> meal = new Meal<>(new VegetarianMeal());
        System.out.println("Meal created");
    }
}
