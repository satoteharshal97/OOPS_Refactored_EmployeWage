package com.example.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    int totalEmpHours = 0, totalWorkingDays = 0, totalEmpWage = 0,  empHours, wagePerHour, numberOfWorkingDays, maxHours;

    public static void main(String[] args) {
        EmployeeWage object = new EmployeeWage();
        System.out.println("For Dmart: " + object.getMonthlyWage(8, 20, 100));
        System.out.println("For Reliance: " + object.getMonthlyWage(6, 30, 150));
        System.out.println("For TCS: " + object.getMonthlyWage(10, 26, 200));
    }

    public int getMonthlyWage(int wagePerHour, int numberOfWorkingDays, int maxHours) {

        while(totalEmpHours <= maxHours && totalWorkingDays < numberOfWorkingDays){
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
        totalEmpHours = totalEmpHours + empHours;
        }
        int totalEmpWage = totalEmpHours * wagePerHour;
        return totalEmpWage;
    }
}
