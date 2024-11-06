public class ExecutiveEmployee extends SalariedEmployee {
    private double bonusPercentage;

    public ExecutiveEmployee(int employeeId, String employeeName, String designation, double monthlySalary,
            double bonusPercentage) {
        super(employeeId, employeeName, designation, monthlySalary);
        setBonusPercentage(bonusPercentage);
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        if (bonusPercentage >= 0 && bonusPercentage <= 100)
            this.bonusPercentage = bonusPercentage;
        else
            System.out.println("Invalid bonus percentage");
    }

    @Override
    public double calculateBonus() {
        double annualSalary = getMonthlySalary() * 12;
        return super.calculateBonus() + (bonusPercentage / 100) * annualSalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus Percentage: " + bonusPercentage);
        System.out.println("Bonus: " + calculateBonus());
    }
}
