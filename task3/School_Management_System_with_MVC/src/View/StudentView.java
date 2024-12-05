/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import MODEL.Teacher;
import java.util.ArrayList;
import MODEL.Student;

/**
 *
 * @author MSI-USER
 */
public class StudentView {
    
    public StudentView()
    {
        
    }
    
    public void displayStudent(Student student)
    {
        System.out.println(student);
        System.out.println();
        System.out.println();
    }
    
    public void displayIndex(int index)
    {
        System.out.println(index);
    }
    
    public void displayTotalStudent(int total_student)
    {
        System.out.println(total_student);
    }
    
    
    public void displayAllStudents(ArrayList<Student>student)
    {
        for(Student std:student)
        {
            displayStudent(std);
        }
    }
    
    
    
    
}
