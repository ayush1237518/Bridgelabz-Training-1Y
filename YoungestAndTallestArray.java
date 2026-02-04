
package com.gla.arrays;

import java.util.Scanner;

class YoungestAndTallestArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String friends[]={"Amar","Akbar","Anthony"};
        int age[]=new int[3];
        double height[]=new double[3];

        for(int i=0;i<3;i++)
        {
            System.out.println("Enter details for "+friends[i]);
            System.out.println("Age");
            age[i]=sc.nextInt();
            System.out.println("Height");
            height[i]=sc.nextDouble();
        }

        int young=0;
        int tall=0;

        for(int i=1;i<3;i++)
        {
            if(age[i]<age[young])
            {
                young=i;
            }
            if(height[i]>height[tall])
            {
                tall=i;
            }
        }

        System.out.println("Youngest Friend : "+friends[young]+" Age : "+age[young]);
        System.out.println("Tallest Friend : "+friends[tall]+" Height : "+height[tall]);
    }

}
