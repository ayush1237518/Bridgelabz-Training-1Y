
package com.gla;
class CourseTest {

    public static void main(String[] args) {

        Course c1 = new RecordedCourse(1, "java programming", 2000);
        Course c2 = new LiveCourse(2, "data structures", 3000);

        System.out.println(c1.formatTitleCase() + " Price: " + c1.getFinalPrice());
        System.out.println(c2.formatTitleCase() + " Price: " + c2.getFinalPrice());
    }
}
