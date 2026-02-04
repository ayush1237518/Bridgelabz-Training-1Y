

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;

        System.out.println("Average Marks: " + average);

        char grade;
        char remark;

        if (average >= 80) {
            grade = 'A';
            System.out.println("Remarks : (Level 4, above agency-normalized standards)");

        } else if (average <= 79 || average >= 70) {
            grade = 'B';
            System.out.println("Remarks : (Level 3, at agency-normalized standards)");

        } else if (average <= 69 || average >= 60) {
            grade = 'C';
            System.out.println("Remarks : (Level 2, below  but approaching agency-normalized standards)");

        } else if (average <= 59 || average >= 50) {
            grade = 'D';
            System.out.println("Remarks : (Level 1, well below agency-normalized standards)");

        } else if (average <= 49 || average >= 40) {
            grade = 'R';
            System.out.println("Remarks : (Level 1, too below agency-normalized standards)");

        } else {
            grade = 'E';
            System.out.println("Remarks : (Remedial standards)");

        }

        System.out.println("Grade: " + grade);

    }
    
}
