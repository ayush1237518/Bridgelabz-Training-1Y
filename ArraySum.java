package com.gla.arrays;

import java.util.Scanner;
class ArraySum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        double numbers[]=new double[10];
        double total=0;
        int index=0;

        while(true)
        {
            System.out.println("Enter a number");
            double value=sc.nextDouble();

            if(value<=0)
            {
                break;
            }

            if(index==10)
            {
                break;
            }

            numbers[index]=value;
            index++;
        }

        System.out.println("Entered numbers");
        for(int i=0;i<index;i++)
        {
            System.out.println(numbers[i]);
            total=total+numbers[i];
        }

        System.out.println("Total sum : "+total);
    }
}