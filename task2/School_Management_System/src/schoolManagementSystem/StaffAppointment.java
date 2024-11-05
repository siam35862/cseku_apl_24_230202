package schoolManagementSystem;

/**
 * The StaffAppointment class is responsible for managing the appointment of staff members
 * in the school management system. It extends the EmployeeAppointment class and implements
 * the IPayScale interface to determine the pay scale for staff members.

 * This class adheres to the Interface Segregation Principle (ISP) by only implementing
 * the interfaces that are relevant to its functionality. It avoids unnecessary dependencies
 * on methods that are not applicable to its operations, promoting a more modular design.
 */
public class StaffAppointment extends EmployeeAppointment implements IPayScale {
    private Staff staff;  // The staff member being appointed

    /**
     * Constructor to initialize a StaffAppointment object with personal and staff-related information.
     *
     * @param name          Name of the staff member
     * @param designation   Designation of the staff member
     * @param staff_id      Unique identifier for the staff member
     * @param gender        Gender of the staff member
     * @param email_adress  Email address of the staff member
     * @param mobile_number  Mobile number of the staff member
     * @param blood_group    Blood group of the staff member
     * @param address       Address of the staff member
     * @param date_of_birth Date of birth of the staff member
     * @param date_of_joining Date of joining of the staff member
     */
    public StaffAppointment(String name, String designation, String staff_id, String gender, String email_adress,
                            String mobile_number, String blood_group, Address address, Date date_of_birth,
                            Date date_of_joining) {
        // Initialize the staff member using the provided information
        staff = new Staff(name, designation, gender, email_adress, mobile_number, blood_group, address, date_of_birth, date_of_joining);

        // Determine the pay scale for the staff member and set it
        int pay_scale = determinePayScale();
        staff.setPayScale(pay_scale);

        // Set the unique ID for the staff member
        staff.setUniqueId(staff_id);
    }

    /**
     * Determines the pay scale for the staff member based on their designation.
     *
     * @return The pay scale of the staff member
     */
    public int determinePayScale() {
        int pay_scale = 0;  // Default pay scale
        if (staff.getPost_name().equals("Head Teacher")) {
            pay_scale = 1;  // Pay scale for Head Teacher
        } else if (staff.getPost_name().equals("Assistant Head Teacher")) {
            pay_scale = 2;  // Pay scale for Assistant Head Teacher
        } else if (staff.getPost_name().equals("Teacher")) {
            pay_scale = 3;  // Pay scale for Teacher
        } else {
            pay_scale = 4;  // Default pay scale for other staff
        }
        return pay_scale;  // Return the determined pay scale
    }

    /**
     * Appoints the staff member by adding them to the staff list.
     */
    public void appoint() {
        StaffList staffList = Controller.getStaffList();  // Get the staff list
        staffList.addStaff(staff);  // Add the staff member to the list
    }
}
