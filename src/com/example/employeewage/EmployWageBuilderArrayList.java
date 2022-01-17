package com.example.employeewage;
import java.util.ArrayList;

import java.util.*;

public class EmployWageBuilderArrayList implements InterfaceForEmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numberOfCompany = 0;
    ArrayList<CompanyEmployeeWage> arrayList ;
    private Map<String, CompanyEmployeeWage> companyHashMap;

    public EmployWageBuilderArrayList() {
        arrayList = new ArrayList<>();
        companyHashMap = new HashMap<>() ;
    }

    public void addCompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours){
        CompanyEmployeeWage computeEmployeeWage = new CompanyEmployeeWage(company, wagePerHour, numberOfWorkingDays, maxHours);
        arrayList.add(computeEmployeeWage);
        companyHashMap.put(company, computeEmployeeWage);
        numberOfCompany++;
    }
    public void computeEmployeeWage() {
        for (int i = 0; i < numberOfCompany; i++) {
            CompanyEmployeeWage computeEmployeeWage = arrayList.get(i);
            computeEmployeeWage.setTotalEmpWage(this.computeEmployeeWage(arrayList.get(i)));
            System.out.println(computeEmployeeWage);
        }
    }

    private int computeEmployeeWage(CompanyEmployeeWage computeEmployeeWage) {
        int totalEmpHours = 0, totalWorkingDays = 0, empHours;
        while (totalEmpHours <= computeEmployeeWage.maxHours && totalWorkingDays < computeEmployeeWage.numberOfWorkingDays) {
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
            int empWage = computeEmployeeWage.wagePerHour * empHours;
            totalEmpHours = totalEmpHours + empHours;
            System.out.println(" Days#: " + totalWorkingDays +  " Emp Hour: " + empHours  + " Daily Employee Wage: " + empWage );

        }
        return totalEmpHours * computeEmployeeWage.wagePerHour;
    }

    public static void main(String[] args) {
        EmployWageBuilderArrayList  employeeWageBuilderArray = new EmployWageBuilderArrayList();
        employeeWageBuilderArray.addCompanyEmployeeWage("D-mart", 6, 26, 40  );
        employeeWageBuilderArray.addCompanyEmployeeWage("Reliance", 10,4,20 );
        employeeWageBuilderArray.computeEmployeeWage();
    }
}