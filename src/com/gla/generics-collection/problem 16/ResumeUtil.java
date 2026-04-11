
package com.gla.generics-collections;

import java.util.*;

public class ResumeUtil {
    public static void process(List<? extends JobRole> list){
        for(JobRole r:list){
            System.out.println(r.getClass().getSimpleName());
        }
    }
}
