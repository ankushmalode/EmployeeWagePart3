package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int totalHr=0, wagePerHr=20, fullDayHr=8;
        Random num = new Random();
        int Attendance = num.nextInt(2);
        /*Checking employee is
        present or absent
         */
        switch (Attendance) {
            case 1:
                System.out.print("Employee is Present");
                totalHr += fullDayHr;
                break;
            default:
                System.out.print("Employee is Absent");
                totalHr += 0;
                break;
        }
        System.out.println("\nDaily Employee Wage is: " + totalHr);
    }
}
