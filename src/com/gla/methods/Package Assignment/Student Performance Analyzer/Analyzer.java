
package com.school.util;

import com.school.data.Student;

public class Analyzer {

    public double calculateAverage(Student s){
        return s.total()/3.0;
    }

    public String findGrade(double avg){

        if(avg>=80) return "A";
        if(avg>=60) return "B";
        return "C";
    }
}
