package com.example.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;

    public static void main(String[] args) {
        checkAbsentOrPresent();
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
