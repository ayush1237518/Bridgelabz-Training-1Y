
package com.gla.arrays;

import java.util.Scanner;
class MultiplicationTableRangeArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int number=sc.nextInt();

        int result[]=new int[4];
        int index=0;

        for(int i=6;i<=9;i++)
        {
            result[index]=number*i;
            index++;
        }

        index=0;
        System.out.println("Multiplication table from 6 to 9");
        for(int i=6;i<=9;i++)
        {
            System.out.println(number+" * "+i+" = "+result[index]);
            index++;
        }
    }

}
