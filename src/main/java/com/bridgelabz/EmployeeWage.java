package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int TotalHr=0,FullDayHr=1;
        Random num = new Random();
        int Attendance = num.nextInt(2);
        /*Checking employee is
        present or absent
         */
        switch (Attendance) {
            case 1:
                System.out.println("Employee is Present");
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}
