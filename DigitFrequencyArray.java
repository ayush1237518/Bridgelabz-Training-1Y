
package com.gla.arrays;

import java.util.Scanner;

class DigitFrequencyArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();


        int temp=n;
        int count=0;


        while(temp>0)
        {
            count++;
            temp=temp/10;
        }

        int digits[]=new int[count];
        int index=0;

        while(n>0)
        {
            digits[index]=n%10;
            index++;
            n=n/10;
        }

        int freq[]=new int[10];

        for(int i=0;i<digits.length;i++)
        {
            freq[digits[i]]++;
        }

        System.out.println("Digit Frequency");
        for(int i=0;i<10;i++)
        {
            if(freq[i]>0)
            {
                System.out.println(i+" = "+freq[i]);
            }

        }

    }

}
