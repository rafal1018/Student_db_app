package org.studentdbapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student lat name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.print(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enrololl() {
        do {
            System.out.println("Enter course to enroll(Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("Enroll id;" + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    }

    public void viewBalance() {
        System.out.println("Your balance is: $");
    }

    public void payTuition() {
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Than for your payment of $" + payment);
        viewBalance();
    }

}
