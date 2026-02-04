
package com.gla.arrays;

import java.util.Scanner;

public class FizzBuzzArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n<=0)
        {
            System.out.println("Invalid input");
            return;
        }


        String arr[]=new String[n];


        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                arr[i-1]="FizzBuzz";
            }
            else if(i%3==0)
            {
                arr[i-1]="Fizz";
            }
            else if(i%5==0)
            {
                arr[i-1]="Buzz";
            }
            else
            {
                arr[i-1]=String.valueOf(i);
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Position "+(i+1)+" = "+arr[i]);
        }

    }

}
