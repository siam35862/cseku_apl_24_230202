/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;
import java.util.ArrayList;
//import MODEL.Student;

/**
 *
 * @author MSI-USER
 */
public class StudentModel {
    private ArrayList<Student>students=new ArrayList<Student>();
    
    public StudentModel()
    {
        
    }
    
    // without group
     public void addStudent(Student student) {
        students.add(student);
    }
     
     
     // with group
      public void addStudent(Student student, String group) {
        student.setGroup(group); // Set the group for the student
        students.add(student); // Add the student to the list
    }
      
      public Student findStudentById(String student_id) {
        for (Student student : students) {
            if (student_id.equals(student.getUnique_id())) {
                return student; 
            }
        }
        return null; 
    }
      
      public int getIndexOfStudent(Student student) {
        int index=students.indexOf(student); 
        return index;
    }
      
       public void removeStudent(Student student) {
        int index = getIndexOfStudent(student); 
        if (index != -1) {
            students.remove(index); 
        }
    }
       
       public int getTotalRunningStudent() {
        return students.size(); 
    }
       
       public ArrayList<Student> getAllStudents() {
        return students; 
    }
       
       
}
