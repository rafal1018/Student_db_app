package org.studentdbapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numeOfStudents = in.nextInt();
        Student[] students = new Student[numeOfStudents];

        for (int n = 0; n < numeOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numeOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
