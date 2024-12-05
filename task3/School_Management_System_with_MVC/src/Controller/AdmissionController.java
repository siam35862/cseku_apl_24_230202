/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;




import MODEL.Admission;
import View.AdmissionView;
import MODEL.Student;

/**
 *
 * @author MSI-USER
 */

public class AdmissionController {
    private Admission model;
    private AdmissionView view;
    
    public AdmissionController()
    {
        this.model=new Admission();
        this.view=new AdmissionView();
    }
    
    public void studentAdmission(Student student)
    {
        model.addmitStudent(student);
        view.admissionSuccess(student);
    }
    
}
