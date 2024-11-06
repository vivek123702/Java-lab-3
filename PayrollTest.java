public class PayrollTest {
    public static void main(String[] args) {
        // Create PayrollSystem instance
        PayrollSystem payrollSystem = new PayrollSystem();

        // Instantiate and initialize HourlyEmployee
        HourlyEmployee hourlyEmployee = new HourlyEmployee(1, "John Doe", "Lab Assistant", 20.0, 40);
        hourlyEmployee.displayInfo(); // Display information for HourlyEmployee

        // Instantiate and initialize SalariedEmployee
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Jane Smith", "Lecturer", 3000.0);
        salariedEmployee.displayInfo(); // Display information for SalariedEmployee

        // Instantiate and initialize ExecutiveEmployee
        ExecutiveEmployee executiveEmployee = new ExecutiveEmployee(3, "Mike Johnson", "Dean", 5000.0, 15.0);
        executiveEmployee.displayInfo(); // Display information for ExecutiveEmployee

        // Add employees to payroll system
        payrollSystem.addEmployee(hourlyEmployee);
        payrollSystem.addEmployee(salariedEmployee);
        payrollSystem.addEmployee(executiveEmployee);

        // Display all employees' details
        System.out.println("\n=== Employee Information and Payroll Summary ===");
        payrollSystem.displayAllEmployees();

        // Display total payroll
        System.out.println("Total Payroll for All Employees: " + payrollSystem.calculateTotalPayroll());
    }
}
