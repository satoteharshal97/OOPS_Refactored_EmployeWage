package com.example.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 2;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HOURS_FOR_MONTH = 100;
    int totalEmpHours = 0, totalWorkingDays = 0, empHours;

    public static void main(String[] args) {
        EmployeeWage switchFullOrPart = new EmployeeWage();
        System.out.println("Employee Wage until condition after using class variables :" + switchFullOrPart.getMonthlyWageCondition());

    }
    public int getMonthlyWageCondition(){


        while (totalEmpHours <= MAX_HOURS_FOR_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
            int empChecker = (int)Math.floor(Math.random() * 10) % 3;
            switch(empChecker){
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHours = totalEmpHours + empHours;
        }
        int totalEmpWage = totalEmpHours * EMP_WAGE_PER_HOUR;
        return totalEmpWage;
    }

    public int getMonthlyWage(){
        int empHours, empWage, totalEmpWage = 0;
        for(int day = 1; day <= NUM_OF_WORKING_DAYS;  day++){
            int empChecker = (int)Math.floor(Math.random() * 10) % 3;

            switch(empChecker){
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            empWage = empHours * EMP_WAGE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Employee wage for " + day + " is " + empWage);
        }
        return totalEmpWage;
    }

    public int switchGetFullOrPartTimeWage() {
        int empHours;
        int empChecker = (int) Math.floor(Math.random() * 10) % 3;
        switch (empChecker) {
            case IS_FULL_TIME:
                empHours = 8;
                break;
            case IS_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }
        return empHours * EMP_WAGE_PER_HOUR;
    }

    public  int getFullOrPartTimeWage(){
        int empHours;
        double empChecker = (int)Math.floor(Math.random() * 10) % 3;

        if(empChecker == IS_FULL_TIME) {
            empHours = 8;
        }
        else if(empChecker == IS_PART_TIME){
            empHours = 4;
        }
        else {
            empHours = 0;
        }
        return empHours * EMP_WAGE_PER_HOUR;
    }

    public  int dailyWage(){
        int empHours;
        int empWage;
        double empChecker = (int)Math.floor(Math.random() * 10) % 2;
        if(empChecker == IS_FULL_TIME) {
            empHours = 8;
        }
        else {
            empHours = 0;
        }
        empWage = empHours * EMP_WAGE_PER_HOUR;
        return empWage;
    }

    static void checkAbsentOrPresent(){
        double empChecker = (int)Math.floor(Math.random() * 10) % 2;
        if(empChecker == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
