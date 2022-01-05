package com.example.employeewage;

public class EmployeeWage {

    public static void main(String[] args) {
        ObjectOfEmployeeWageBuilder reliance = new ObjectOfEmployeeWageBuilder("Reliance Company", 6,
                28, 120);
        ObjectOfEmployeeWageBuilder dmart = new ObjectOfEmployeeWageBuilder("Dmart Company", 8,
                26, 100);


        dmart.EmployeeWageBuilder();
        System.out.println(dmart);
        reliance.EmployeeWageBuilder();
        System.out.println(reliance);
    }

}
