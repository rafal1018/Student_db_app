package org.studentdbapp;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.showInfo());

        Student stu2 = new Student();
        stu2.enroll();
        stu2.payTuition();
        System.out.println(stu2.showInfo());

        Student stu3 = new Student();
        stu3.enroll();
        stu3.payTuition();
        System.out.println(stu3.showInfo());
    }
}
