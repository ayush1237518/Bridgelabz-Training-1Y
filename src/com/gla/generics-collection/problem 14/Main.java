
package com.gla.generics-collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> c = new Course<>(new ExamCourse());

        List<CourseType> list = Arrays.asList(new ExamCourse(), new AssignmentCourse());
        for(CourseType ct:list){
            System.out.println(ct.getClass().getSimpleName());
        }
    }
}
