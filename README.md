Lab 3a

The payroll system for Christ University is structured around a base `Employee` class, with specialized subclasses to handle different types of employees and their unique payment structures. The base `Employee` class holds general information like `employeeId`, `employeeName`, and `designation`, and it includes methods to access and update this information. It also contains a `calculateBonus()` method, which is intended to be customized in each subclass to calculate bonuses differently based on employee type.

For hourly employees, represented by the `HourlyEmployee` class, additional attributes include `hourlyRate` and `hoursWorked`. This class calculates the weekly salary by multiplying the hourly rate by the number of hours worked, and it has a `calculateBonus()` method specifically designed for hourly employees. The `displayEmployeeInfo()` method in this class is overridden to show details like weekly salary and bonus, alongside the basic employee information.

The `SalariedEmployee` class is designed for employees who receive a fixed monthly salary. It includes an attribute for `monthlySalary` and calculates weekly salary by dividing the monthly salary by four, assuming a four-week month. It also has a tailored `calculateBonus()` method for salaried employees, and it overrides `displayEmployeeInfo()` to display weekly salary and bonus.

For high-level positions, an `ExecutiveEmployee` class extends `SalariedEmployee`. This class includes a `bonusPercentage` attribute, allowing a customized bonus calculation based on a percentage of the annual salary. In this class, `calculateBonus()` uses the `super` keyword to call the base class bonus calculation, adding an executive bonus on top. This approach keeps the code modular, making it easy to adjust bonuses for executives without rewriting existing logic.

The system incorporates data validation for attributes like `hourlyRate`, `hoursWorked`, `monthlySalary`, and `bonusPercentage` to ensure values are within acceptable ranges. This helps maintain data integrity and prevents errors in payroll calculations. Additionally, each class has a `displayEmployeeInfo()` method tailored to provide detailed, role-specific salary and bonus information, supporting a clear overview of each employee’s earnings. This modular setup not only organizes payroll information effectively but also allows easy expansion to include other employee roles and payment structures if needed.


Lab 3b

