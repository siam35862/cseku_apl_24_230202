/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
import CONTROLLER.controller;
public class StaffAppoint {
    private Staff staff;
    
   controller ct=new controller();


    public StaffAppoint(String name, String designation, String staff_id, String gender, String email_adress,
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

    public void appoint() {
        ct.add_staff_by_ctrl(staff);
    }
}
