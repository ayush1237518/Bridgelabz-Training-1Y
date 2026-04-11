
package com.gla.generics-collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r = new Resume<>(new SoftwareEngineer());

        List<JobRole> list = Arrays.asList(new SoftwareEngineer());
        ResumeUtil.process(list);
    }
}
