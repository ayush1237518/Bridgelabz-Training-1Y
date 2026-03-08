
package com.school.data;

public class Student {

    String name;
    int m1,m2,m3;

    public Student(String name,int m1,int m2,int m3){
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    public String toString(){
        return name+" Marks:"+m1+","+m2+","+m3;
    }

    public int total(){
        return m1+m2+m3;
    }
}
