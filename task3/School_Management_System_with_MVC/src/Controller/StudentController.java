/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import MODEL.StudentModel;
import View.StudentView;
import MODEL.Student;
import MODEL.Teacher;


/**
 *
 * @author MSI-USER
 */
public class StudentController {
    
    private StudentModel model;
    private StudentView view;
    
    public StudentController(StudentModel model,StudentView view)
    {
        this.model=model;
        this.view=view;
    }
    
     public void addStudent(Student student)
    {
        model.addStudent(student);
    }
    
    public void findStudent(String st_id)
    {
        Student student= model.findStudentById(st_id);
        view.displayStudent(student);
    }
    
    public void findIndexOfStudent(Student student)
    {
        int index= model.getIndexOfStudent(student);
        view.displayIndex(index);
    }
    
    public void removeTeacher(Student student)
    {
        model.removeStudent(student);
    }
    
    public void findTotalNumberOfRunningStudent()
    {
        int total_student= model.getTotalRunningStudent();
        view.displayTotalStudent(total_student);
    }
    
    public void showTeachers()
    {
        ArrayList<Student>student=model.getAllStudents();
        view.displayAllStudents(student);
    }
   
    
}
