
package com.gla.generics-collections;

public class Meal<T extends MealPlan> {
    T plan;

    public Meal(T plan){
        this.plan = plan;
    }
}
