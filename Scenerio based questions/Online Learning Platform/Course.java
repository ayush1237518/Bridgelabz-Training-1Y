
package com.gla;
class Course {

    int courseId;
    String courseName;
    double price;

    static String platformName = "SkillLearn";

    Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
    }

    double getFinalPrice() {
        return price;
    }

    String formatTitleCase() {

        String[] words = courseName.split(" ");
        String result = "";

        for (String w : words) {
            result += w.substring(0,1).toUpperCase() +
                    w.substring(1).toLowerCase() + " ";
        }

        return result.trim();
    }
}
