package com.example.employeewage;

public class ObjectOfEmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int wagePerHour;
    private final int numberOfWorkingDays;
    private final int maxHours;
    private int totalEmpWage;



    public ObjectOfEmployeeWageBuilder(String company, int wagePerHour, int numberOfWorkingDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHours = maxHours;



    }
    public void EmployeeWageBuilder( ) {
        int totalEmpHours = 0, totalWorkingDays = 0,  empHours = 0;
        while (totalEmpHours <= maxHours && totalWorkingDays < numberOfWorkingDays) {
            int empChecker = (int) Math.floor(Math.random() * 10) % 3;
            totalWorkingDays++;
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
            System.out.println(" Days#: " + totalWorkingDays + " Emp Hour: " + empHours);
        }
        totalEmpWage = totalEmpHours * wagePerHour;
    }
    @Override
    public String toString() {
        return "Total employwage for " + company +  ":" +totalEmpWage ;
    }

}
