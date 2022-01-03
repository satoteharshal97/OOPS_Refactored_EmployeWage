package com.example.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        EmployeeWage fullTimeWage = new EmployeeWage();
        System.out.println(fullTimeWage.dailyWage());
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
