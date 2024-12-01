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
public class Admission {
    
  public Admission()
  {
      
  }
  
     controller ct=new controller();
     public void admitStudent(String name, String student_id, String _class, String section,
                             String gender, String email_adress, String mobile_number, String blood_group,
                             Address address, Date date_of_birth, Date date_of_admission)
    {
        Student student = new Student(name, _class, section, gender, email_adress, mobile_number,
                blood_group, address, date_of_birth, date_of_admission);
        student.setUniqueId(student_id);
        
        ct.add_student_by_ctrl(student);      
    }
     
     
     
     public void admitStudent_by_ctrl(String name, String student_id, String _class, String section, String group,
                             String gender, String email_adress, String mobile_number, String blood_group,
                             Address address, Date date_of_birth, Date date_of_admission)
    {
        Student student = new Student(name, _class, section, gender, email_adress, mobile_number,
                blood_group, address, date_of_birth, date_of_admission);
        student.setUniqueId(student_id);
        
        student.setGroup(group);
        ct.add_student_by_ctrl(student);
    }
              
     
     
    
}
