/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import MODEL.Staff;


/**
 *
 * @author MSI-USER
 */
public class StaffAppointmentView {

    public StaffAppointmentView() {
    }
    
    StaffView stfv=new  StaffView() ;
    public void appointmentSuccess(Staff staff)
    {
        System.out.println("Appointment Successful!");
        stfv.displayStaff(staff);
    }
    
}
