package schoolManagementSystem;

/**
 * The Appointment class is responsible for managing appointments of employees.
 * It provides a method to handle committee appointments for any subclass of EmployeeAppointment.

 * This class adheres to the Open/Closed Principle (OCP) as it allows for extension
 * by accepting different types of EmployeeAppointment without requiring modification
 * of its existing code. New employee appointment types can be added without changing
 * this class.
 */
public class Appointment {

    /**
     * Default constructor for the Appointment class.
     */
    public Appointment() {
    }

    /**
     * Accepts an EmployeeAppointment object and calls its appoint method.
     *
     * @param empapt an instance of EmployeeAppointment (or its subclass)
     */
    public void committee(EmployeeAppointment empapt) {
        // Calls the appoint method of the passed EmployeeAppointment instance
        empapt.appoint();
    }
}
