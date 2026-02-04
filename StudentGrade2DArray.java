
package com.gla.arrays;

import java.util.Scanner;

class StudentGrade2DArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of students");
        int n=sc.nextInt();

        int marks[][]=new int[n][3];
        double percentage[]=new double[n];
        char grade[]=new char[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Physics marks of student "+(i+1));
            marks[i][0]=sc.nextInt();
            if(marks[i][0]<0)
            {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }


            System.out.println("Enter Chemistry marks of student "+(i+1));
            marks[i][1]=sc.nextInt();
            if(marks[i][1]<0)
            {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }


            System.out.println("Enter Maths marks of student "+(i+1));
            marks[i][2]=sc.nextInt();
            if(marks[i][2]<0)
            {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }
        }

        for(int i=0;i<n;i++)
        {
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;

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
            System.out.println(marks[i][0]+"  "+marks[i][1]+"  "+marks[i][2]+"  "+percentage[i]+"  "+grade[i]);
        }

    }

}
