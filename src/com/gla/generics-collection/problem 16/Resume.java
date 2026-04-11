
package com.gla.generics-collections;

public class Resume<T extends JobRole> {
    T role;

    public Resume(T role){
        this.role = role;
    }
}
