/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import MODEL.StaffAppointment;
import View.StaffAppointmentView;
import MODEL.Staff;

/**
 *
 * @author MSI-USER
 */
public class StaffAppointmentController {
    
    private StaffAppointment model;
    private StaffAppointmentView view;

    public StaffAppointmentController() {
        this.model=new StaffAppointment();
        this.view=new StaffAppointmentView();
    }
    
     public void staffAppointment(Staff staff)
    {
        model.appoint(staff);
        view.appointmentSuccess(staff);
    }
    
}
