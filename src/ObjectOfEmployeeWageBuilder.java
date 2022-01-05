public class ObjectOfEmployeeWageBuilder {



    private final String company;
    private final int  wagePerHour;
    private final int  numberOfWorkingDays;
    private final int  maxHours;
    private int totalEmpWage;

    public ObjectOfEmployeeWageBuilder(String company, int wagePerHour, int numberOfWorkingDays, int maxHours, int totalEmpWage) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHours = maxHours;
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "ObjectOfEmployeeWageBuilder{" +
                "Company='" + company + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", numberOfWorkingDays=" + numberOfWorkingDays +
                ", maxHours=" + maxHours +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}
