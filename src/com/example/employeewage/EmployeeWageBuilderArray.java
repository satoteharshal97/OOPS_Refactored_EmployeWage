package com.example.employeewage;

public class EmployeeWageBuilderArray implements InterfaceForEmployeeWageBuilder {

    private int numberOfCompany = 0;
    private CompanyEmployeeWage[] companyEmployeeWageArray;

    public EmployeeWageBuilderArray() {
        companyEmployeeWageArray = new CompanyEmployeeWage[5];
    }



    public void addCompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours) {
        companyEmployeeWageArray[numberOfCompany] = new CompanyEmployeeWage(company, wagePerHour, numberOfWorkingDays, maxHours);
        numberOfCompany++;
    }


    public void computeEmployeeWage() {
        for (int i = 0; i < numberOfCompany; i++) {
            companyEmployeeWageArray[i].setTotalEmpWage(this.computeEmployeeWage(companyEmployeeWageArray[i]));
            System.out.println(companyEmployeeWageArray[i]);
        }
    }

    private int computeEmployeeWage( CompanyEmployeeWage companyEmployeeWage) {
        int totalEmpHours = 0, totalWorkingDays = 0, empHours;
        while (totalEmpHours <= companyEmployeeWage.maxHours && totalWorkingDays < companyEmployeeWage.numberOfWorkingDays) {
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
        return totalEmpHours * companyEmployeeWage.wagePerHour;
    }


    public static void main(String[] args) {
        EmployeeWageBuilderArray  employeeWageBuilderArray = new EmployeeWageBuilderArray();
        employeeWageBuilderArray.addCompanyEmployeeWage("D-mart", 6, 26, 20  );
        employeeWageBuilderArray.addCompanyEmployeeWage("Reliance", 10,4,20 );
        employeeWageBuilderArray.computeEmployeeWage();
    }


}
