package com.example.employeewage;
import java.util.ArrayList;

public class EmployWageBuilderArrayList implements InterfaceForEmployeeWageBuilder {

    private int numberOfCompany = 0;
    ArrayList<CompanyEmployeeWage> arrayList ;


    public EmployWageBuilderArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addCompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours){
        arrayList.add(numberOfCompany, new CompanyEmployeeWage(company, wagePerHour, numberOfWorkingDays, maxHours));
        numberOfCompany++;
    }
    public void computeEmployeeWage() {
        for (int i = 0; i < numberOfCompany; i++) {
            arrayList.get(i).setTotalEmpWage(this.computeEmployeeWage(arrayList.get(i)));
            System.out.println(arrayList.get(i));
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
            totalEmpHours = totalEmpHours + empHours;
            System.out.println(" Days#: " + totalWorkingDays + " Emp Hour: " + empHours);
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