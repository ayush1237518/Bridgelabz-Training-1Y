
package com.gla.arrays;

import java.util.Scanner;

class LargestSecondNumberArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        int maxDigit=10;
        int digits[]=new int[maxDigit];
        int index=0;



        while(n>0)
        {
            if(index==maxDigit)


            {
                maxDigit=maxDigit+10;
                int temp[]=new int[maxDigit];
                for(int i=0;i<digits.length;i++)
                {
                    temp[i]=digits[i];
                }
                digits=temp;
            }

            digits[index]=n%10;
            index++;
            n=n/10;
        }

        int largest=digits[0];
        int second=digits[0];

        for(int i=1;i<index;i++)
        {
            if(digits[i]>largest)
            {
                second=largest;
                largest=digits[i];
            }
            else if(digits[i]>second && digits[i]!=largest)
            {
                second=digits[i];
            }
        }

        System.out.println("Largest digit = "+largest);
        System.out.println("Second largest digit = "+second);
    }

}
