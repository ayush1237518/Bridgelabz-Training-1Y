
package com.gla.arrays;

import java.util.Scanner;

class BMI2DArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter number of persons");
        int n=sc.nextInt();


        double personData[][]=new double[n][3];
        String weightStatus[]=new String[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter weight of person "+(i+1));
            double w=sc.nextDouble();
            while(w<=0)
            {
                System.out.println("Enter positive weight");
                w=sc.nextDouble();
            }
            personData[i][0]=w;

            System.out.println("Enter height of person "+(i+1));
            double h=sc.nextDouble();
            while(h<=0)
            {
                System.out.println("Enter positive height");
                h=sc.nextDouble();
            }
            personData[i][1]=h;
        }


        for(int i=0;i<n;i++)
        {
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);

            if(personData[i][2]<18.5)
            {
                weightStatus[i]="Underweight";
            }
            else if(personData[i][2]>=18.5 && personData[i][2]<25)
            {
                weightStatus[i]="Normal";
            }
            else if(personData[i][2]>=25 && personData[i][2]<30)
            {
                weightStatus[i]="Overweight";
            }
            else
            {
                weightStatus[i]="Obese";
            }
        }

        System.out.println("Height  Weight  BMI  Status");
        for(int i=0;i<n;i++)
        {
            System.out.println(personData[i][1]+"  "+personData[i][0]+"  "+personData[i][2]+"  "+weightStatus[i]);
        }
        
    }

}
