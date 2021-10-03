package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int totalHr = 0, wagePerHr = 20, fullDayHr = 8, partTimeHr = 4, dayPerMonth = 20;
        /*
        calculating wage for a month
         */
        for (int i = 0; i < dayPerMonth; i++) {
            Random num = new Random();
            int Attendance = num.nextInt(3);
        /*Checking employee is
        present or absent
         */
            switch (Attendance) {
                case 1:
//                    System.out.print("Employee is Present");
                    totalHr += fullDayHr;
                    break;
                case 2:
//                    System.out.print("Employee is Present but only half-day");
                    totalHr += partTimeHr;
                    break;
                default:
//                    System.out.print("Employee is Absent");
                    totalHr += 0;
                    break;
            }
        }
        System.out.println("\nMonthly Employee Wage is: " + totalHr);
    }
}