/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN;

import java.util.Scanner;
import Controller.AdmissionController;
import Controller.TeacherAppointmentController;
import MODEL.Student;
import MODEL.Address;
import MODEL.Date;
import MODEL.TeacherAppointment;
import MODEL.StaffAppointment;
import MODEL.Teacher;


public class Main {

    public static void main(String[] args) {
        
        
          // student admisson 
        Student student = new Student("masrafi", "10", "A", "Science", "Male", "230207@ku.ac.bd", "230207",
                "019....55", "B+", new Address("Hall Road", "1234", "Khulna"), new Date(7, 2, 2004),
                new Date(16, 8, 2023));

        AdmissionController adc = new AdmissionController();
        adc.studentAdmission(student);
        
        
        
        Teacher teacher=new Teacher("snigdha","Head mistress","Higher Math","Female","230216@ku.ac.bd",
        "230216","019..06","O+",new Address("Nodir Opar","7892","Gaibandha"),new Date(23,5,2005),
        new Date(23,11,2017));
        
        
        TeacherAppointmentController tap=new TeacherAppointmentController();
        tap.teacherAppointment(teacher);
        
        
        
        

    }

}
