import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalPayroll() {
        double totalPayroll = 0.0;
        for (Employee employee : employees) {
            if (employee instanceof HourlyEmployee) {
                totalPayroll += ((HourlyEmployee) employee).calculateWeeklySalary();
            } else if (employee instanceof SalariedEmployee) {
                totalPayroll += ((SalariedEmployee) employee).calculateWeeklySalary();
            }
        }
        return totalPayroll;
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("Annual Earnings: " + calculateAnnualEarnings(employee));
            System.out.println("====================================");
        }
    }

    public double calculateAnnualEarnings(Employee employee) {
        if (employee instanceof HourlyEmployee) {
            return ((HourlyEmployee) employee).calculateWeeklySalary() * 52;
        } else if (employee instanceof SalariedEmployee) {
            return ((SalariedEmployee) employee).getMonthlySalary() * 12;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(1, "John Doe", "Lab Assistant", 20.0, 40);
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Jane Smith", "Lecturer", 3000.0);
        ExecutiveEmployee executiveEmployee = new ExecutiveEmployee(3, "Mike Johnson", "Dean", 5000.0, 15.0);

        payrollSystem.addEmployee(hourlyEmployee);
        payrollSystem.addEmployee(salariedEmployee);
        payrollSystem.addEmployee(executiveEmployee);

        payrollSystem.displayAllEmployees();
        System.out.println("Total Payroll: " + payrollSystem.calculateTotalPayroll());
    }
}
