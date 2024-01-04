
//a program that takes in the score of a student in a test and outputs

import java.util.Scanner;

public class StudentsScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("************************************** ");
        System.out.println("INSERT THE STUDENT'S TEST SCORES: ");
        System.out.println("************************************** ");
        int score = input.nextInt();
        char grades;
        if (score >= 90) {
            grades = 'A';
        } else if (score >= 80) {
            grades = 'B';
        } else if (score >= 70) {
            grades = 'C';
        } else if (score >= 60) {
            grades = 'D';
        } else {
            grades = 'F';
        }
        System.out.println("************************************** ");
        System.out.println("THE STUDENT TEST SCORE : " + grades + ".");
        System.out.println("************************************** ");
    }
}   