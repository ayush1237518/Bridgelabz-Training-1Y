
package com.gla.arrays;

import java.util.Scanner;
class BMI
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of persons");
        int n=sc.nextInt();

        double weight[]=new double[n];
        double height[]=new double[n];
        double bmi[]=new double[n];
        String status[]=new String[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter weight of person "+(i+1));
            weight[i]=sc.nextDouble();
            System.out.println("Enter height of person "+(i+1));
            height[i]=sc.nextDouble();
        }

        for(int i=0;i<n;i++)
        {
            bmi[i]=weight[i]/(height[i]*height[i]);

            if(bmi[i]<18.5)
            {
                status[i]="Underweight";
            }
            else if(bmi[i]<25)
            {
                status[i]="Normal";
            }
            else if(bmi[i]<30)
            {
                status[i]="Overweight";
            }
            else
            {
                status[i]="Obese";
            }
        }

        System.out.println("Height  Weight  BMI  Status");
        for(int i=0;i<n;i++)
        {
            System.out.println(height[i]+"  "+weight[i]+"  "+bmi[i]+"  "+status[i]);
        }
        
    }

}
