/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import MODEL.Teacher;


public class TeacherAppointmentView {

    public TeacherAppointmentView() {
    }
    
    
    TeacherView tv=new  TeacherView() ;
    public void appointmentSuccess(Teacher teacher)
    {
        System.out.println("Appointment Successful!");
        tv.displayTeacher(teacher);
    }
}
