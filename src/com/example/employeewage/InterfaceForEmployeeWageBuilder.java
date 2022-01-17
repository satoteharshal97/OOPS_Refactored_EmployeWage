package com.example.employeewage;

public interface InterfaceForEmployeeWageBuilder {
    // by default public static final
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;

    //by default methods are  public
    void addCompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours);
    void computeEmployeeWage();
}
