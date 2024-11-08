Lab 3a

The payroll system for Christ University is structured around a base `Employee` class, with specialized subclasses to handle different types of employees and their unique payment structures. The base `Employee` class holds general information like `employeeId`, `employeeName`, and `designation`, and it includes methods to access and update this information. It also contains a `calculateBonus()` method, which is intended to be customized in each subclass to calculate bonuses differently based on employee type.

For hourly employees, represented by the `HourlyEmployee` class, additional attributes include `hourlyRate` and `hoursWorked`. This class calculates the weekly salary by multiplying the hourly rate by the number of hours worked, and it has a `calculateBonus()` method specifically designed for hourly employees. The `displayEmployeeInfo()` method in this class is overridden to show details like weekly salary and bonus, alongside the basic employee information.

The `SalariedEmployee` class is designed for employees who receive a fixed monthly salary. It includes an attribute for `monthlySalary` and calculates weekly salary by dividing the monthly salary by four, assuming a four-week month. It also has a tailored `calculateBonus()` method for salaried employees, and it overrides `displayEmployeeInfo()` to display weekly salary and bonus.

For high-level positions, an `ExecutiveEmployee` class extends `SalariedEmployee`. This class includes a `bonusPercentage` attribute, allowing a customized bonus calculation based on a percentage of the annual salary. In this class, `calculateBonus()` uses the `super` keyword to call the base class bonus calculation, adding an executive bonus on top. This approach keeps the code modular, making it easy to adjust bonuses for executives without rewriting existing logic.

The system incorporates data validation for attributes like `hourlyRate`, `hoursWorked`, `monthlySalary`, and `bonusPercentage` to ensure values are within acceptable ranges. This helps maintain data integrity and prevents errors in payroll calculations. Additionally, each class has a `displayEmployeeInfo()` method tailored to provide detailed, role-specific salary and bonus information, supporting a clear overview of each employee’s earnings. This modular setup not only organizes payroll information effectively but also allows easy expansion to include other employee roles and payment structures if needed.






Lab 3b

The `PayrollTest` Java class is a test driver designed to demonstrate the functionality of a payroll system by creating different types of employee instances, displaying their information, and calculating the total payroll for all employees. This class primarily interacts with the `PayrollSystem` class, which acts as a central management system for employee data and payroll calculations.

The first step in the `PayrollTest` class is to create an instance of `PayrollSystem`. This object is intended to hold and manage a collection of employees, supporting functionality such as adding employees, displaying their details, and calculating the cumulative payroll. The `PayrollSystem` likely maintains an internal data structure (such as a list) to store employee objects, and it offers methods to add employees to this collection and retrieve payroll information.

Next, `PayrollTest` instantiates three different types of employees: `HourlyEmployee`, `SalariedEmployee`, and `ExecutiveEmployee`. Each employee is initialized with sample data such as a unique ID, name, job title, and specific payment details. For example, an `HourlyEmployee` might be created with an hourly wage and hours worked, while a `SalariedEmployee` is created with a monthly salary. The `ExecutiveEmployee` includes a base salary as well as a bonus percentage. Following instantiation, each employee’s `displayInfo()` method is called to print relevant information, assuming each employee type has a method to handle this functionality.

The employees are then added to the `payrollSystem` through calls to its `addEmployee()` method. This step demonstrates the modularity of the payroll system, as it accepts different types of employees regardless of their specific pay structures. This method likely appends each employee to the payroll system’s internal collection, preparing the system to later retrieve and process payroll details across all employee types in a unified manner.

Following this, the `PayrollTest` class calls `payrollSystem.displayAllEmployees()` to print the details of all employees in the system. This method likely iterates through each employee in the internal list and invokes their `displayInfo()` method, providing a comprehensive view of all employee roles, salary structures, and other relevant information. This design ensures that the payroll system can manage and display various employee types in a consistent format.

Finally, the total payroll for all employees is calculated by calling the `payrollSystem.calculateTotalPayroll()` method, which should iterate over each employee, retrieve their specific payroll amounts, and sum them up. This method accommodates the unique payroll calculations of each employee type (such as the hourly wages for `HourlyEmployee`, monthly salary for `SalariedEmployee`, and salary plus bonus for `ExecutiveEmployee`). The result is then displayed as the total payroll, giving a clear summary of the payroll expenses for the organization.

The structure of `PayrollTest` allows for easy modification and testing, enabling developers to add or change employee types and adjust payroll details as needed. The design also supports future expansion, as new employee types could be introduced with minimal adjustments to the existing system. This modular approach demonstrates a clean separation of concerns, with the payroll system handling data management and calculations while each employee type encapsulates its unique payroll logic.
