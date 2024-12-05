/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import MODEL.TeacherAppointment;
import View.TeacherAppointmentView;
import MODEL.Teacher;

/**
 *
 * @author MSI-USER
 */
public class TeacherAppointmentController {

    private TeacherAppointment model;
    private TeacherAppointmentView view;
    
    
    public TeacherAppointmentController() {
        this.model=new TeacherAppointment();
        this.view=new TeacherAppointmentView();
    }
    
    public void teacherAppointment(Teacher teacher)
    {
        model.appoint(teacher);
        view.appointmentSuccess(teacher);
    }
    
    
}
