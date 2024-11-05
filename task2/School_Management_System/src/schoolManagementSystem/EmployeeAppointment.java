package schoolManagementSystem;

/**
 * The EmployeeAppointment abstract class serves as a base for all employee appointment types.
 * It defines an abstract method `appoint()` that must be implemented by any subclass.

 * This class adheres to the Open/Closed Principle (OCP) as it allows for new types of employee
 * appointments to be added through subclassing without modifying the existing class.
 * This design encourages code reusability and flexibility in the system.
 */
public abstract class EmployeeAppointment {

    /**
     * Abstract method for appointing an employee.
     * Subclasses must provide their own implementation of this method.
     */
    public abstract void appoint();
}
