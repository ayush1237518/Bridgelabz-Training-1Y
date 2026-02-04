
package com.gla.arrays;

import java.util.Scanner;

class OddEvenArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a natural number");
        int number=sc.nextInt();

        if(number<=0)
        {
            System.out.println("Invalid input");
            return;
        }

        int even[]=new int[number/2+1];
        int odd[]=new int[number/2+1];

        int ei=0;
        int oi=0;

        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                even[ei]=i;
                ei++;
            }
            else
            {
                odd[oi]=i;
                oi++;
            }
        }

        System.out.println("Odd numbers");
        for(int i=0;i<oi;i++)
        {
            System.out.print(odd[i]+" ");
        }

        System.out.println();
        System.out.println("Even numbers");
        for(int i=0;i<ei;i++)
        {
            System.out.print(even[i]+" ");
        }
    }

}
