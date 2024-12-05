/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import MODEL.Student;
import MODEL.Address;
import MODEL.Date;


/**
 *
 * @author MSI-USER
 */
public class AdmissionView {
    

    public AdmissionView() {
        
    }
    
    StudentView stv=new StudentView();
    
    public void admissionSuccess(Student student)
    {
        System.out.println("Admission Successful!");
        stv.displayStudent(student);        
    }
    
    
    
    
    
 
}
