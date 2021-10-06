package com.bridgelabz;

import java.util.*;

/**
 * Employee Wage Program By Using ops Concept day-9
 *
 * @author : Ankush Malode
 * @version : 16.0
 * @since : 02/10/2021
 */
public class EmployeeWage {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        wageCalculation("cognizant", 500, 20,100);
        wageCalculation("capgemini", 800, 10,90);
    }

    public static void wageCalculation(String company, int empRatePerHr, int workingDayPerMonth, int maxPerHrMonth) {
        int totalHr = 0, totalWorkingDay=0, fullDayHr = 8, partTimeHr = 4, totalEmpWage;        //calculating wage for a month
        while (totalHr<=maxPerHrMonth && totalWorkingDay<workingDayPerMonth){
            totalWorkingDay++;
            Random num = new Random();
            int Attendance = num.nextInt(3);//        Checking employee is present or absent
                switch (Attendance) {
                    case isFullTime:
                        totalHr += fullDayHr;
                        if (totalHr > 100)
                            totalHr -= fullDayHr;
                        break;
                    case isPartTime:
                        totalHr += partTimeHr;
                        if (totalHr > 100)
                            totalHr -= partTimeHr;
                        break;
                    default:
                        totalHr += 0;
                        totalWorkingDay--;/*if employee is absent the then
                         * day also not to be count.
                         */
                        break;
                }
            }
        System.out.println("\nMonthly Employee Wage is: " + totalHr);
        totalEmpWage=totalHr*empRatePerHr;
        System.out.println("In "+company+" per month employee wage is "+totalEmpWage);
    }
}