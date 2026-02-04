
package com.gla.arrays;

import java.util.Scanner;

class BonusCalculatorArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=10;

        double salary[]=new double[n];
        double service[]=new double[n];
        double bonus[]=new double[n];
        double newSalary[]=new double[n];

        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details for employee "+(i+1));

            System.out.println("Salary");
            salary[i]=sc.nextDouble();

            System.out.println("Years of service");
            service[i]=sc.nextDouble();

            if(salary[i]<=0 || service[i]<0)
            {
                System.out.println("Invalid input enter again");
                i--;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(service[i]>5)
            {
                bonus[i]=salary[i]*0.05;
            }
            else
            {
                bonus[i]=salary[i]*0.02;
            }

            newSalary[i]=salary[i]+bonus[i];

            totalBonus=totalBonus+bonus[i];
            totalOldSalary=totalOldSalary+salary[i];
            totalNewSalary=totalNewSalary+newSalary[i];
        }

        System.out.println("Total Old Salary : "+totalOldSalary);
        System.out.println("Total Bonus : "+totalBonus);
        System.out.println("Total New Salary : "+totalNewSalary);
        
    }
}
