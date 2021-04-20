package org.studentdbapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student lat name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();
        System.out.print(firstName + " " + lastName + " " + gradeYear);
    }

}
