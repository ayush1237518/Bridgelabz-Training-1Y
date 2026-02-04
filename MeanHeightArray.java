
package com.gla.arrays;

import java.util.Scanner;

class MeanHeightArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        double heights[]=new double[11];
        double sum=0;

        for(int i=0;i<heights.length;i++)
        {
            System.out.println("Enter height of player "+(i+1));
            heights[i]=sc.nextDouble();
        }

        for(int i=0;i<heights.length;i++)
        {
            sum=sum+heights[i];
        }

        double mean=sum/heights.length;
        System.out.println("Mean height of the football team: "+mean);
    }

}
