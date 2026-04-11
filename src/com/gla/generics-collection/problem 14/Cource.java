
package com.gla.generics-collections;

public class Course<T extends CourseType> {
    T type;

    public Course(T type){
        this.type = type;
    }
}
