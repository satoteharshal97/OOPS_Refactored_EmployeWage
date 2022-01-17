package com.example.employeewage;

public class CompanyEmployeeWage {


    public final String company;
    public final int wagePerHour;
    public final int numberOfWorkingDays;
    public final int maxHours;
    public int totalEmpWage;

    public CompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHours = maxHours;
    }

    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString() {
        return "Total employee wage for " + company +  ":" +totalEmpWage ;
    }

}
