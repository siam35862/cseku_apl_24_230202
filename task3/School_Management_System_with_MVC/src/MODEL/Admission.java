/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;



/**
 *
 * @author MSI-USER
 */
public class Admission {
//    private StudentModel student;
    
    
    public Admission() {
    }
    
    StudentModel student=new StudentModel();
    
    public void addmitStudent(Student s)
    {
        student.addStudent(s);
    }
    
}
