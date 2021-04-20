package org.studentdbapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private static int tuitionBalance;
    private static int id = 600;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student lat name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.print(firstName + " " + lastName + " " + gradeYear +  " " + studentID);

    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

}
