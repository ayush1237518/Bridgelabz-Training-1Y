
package com.gla.arrays;

import java.util.Scanner;

class StudentGradeArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of students");
        int n=sc.nextInt();

        int physics[]=new int[n];
        int chemistry[]=new int[n];
        int maths[]=new int[n];
        double percentage[]=new double[n];
        char grade[]=new char[n];



        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Physics marks of student "+(i+1));
            physics[i]=sc.nextInt();
            if(physics[i]<0)
            {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }



            System.out.println("Enter Chemistry marks of student "+(i+1));
            chemistry[i]=sc.nextInt();
            if(chemistry[i]<0)
            {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            System.out.println("Enter Maths marks of student "+(i+1));
            maths[i]=sc.nextInt();
            if(maths[i]<0)
            {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            percentage[i]=(physics[i]+chemistry[i]+maths[i])/3.0;

            if(percentage[i]>=80)
            {
                grade[i]='A';
            }
            else if(percentage[i]>=70)
            {
                grade[i]='B';
            }
            else if(percentage[i]>=60)
            {
                grade[i]='C';
            }
            else if(percentage[i]>=50)
            {
                grade[i]='D';
            }
            else if(percentage[i]>=40)
            {
                grade[i]='R';
            }
            else
            {
                grade[i]='E';
            }
        }

        System.out.println("Phy  Chem  Maths  Percentage  Grade");
        for(int i=0;i<n;i++)
        {
            System.out.println(physics[i]+"  "+chemistry[i]+"  "+maths[i]+"  "+percentage[i]+"  "+grade[i]);
        }

    }

}
