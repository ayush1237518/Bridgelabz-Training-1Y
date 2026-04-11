
package com.gla.generics-collections;

import java.util.*;

public class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    public void addVehicle(T v){
        fleet.add(v);
    }

    public void showFleet(){
        for(T v:fleet){
            System.out.println(v.getClass().getSimpleName());
        }
    }
}
