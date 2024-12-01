/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;



import MODEL.Teacher; // Importing the Teacher model class
import MODEL.Person;  // Importing the Person model class
import MODEL.Address; // Importing the Address model class
import MODEL.Date;    // Imp
import MODEL.Student; 
import MODEL.Staff; 
import java.util.ArrayList;
import CONTROLLER.controller;

public class view {
    
    public view()
    {
        
    }
    
    public void showInfo_teacher(Teacher teacher)
    {
        System.out.println(teacher);
    }
    
    public void showInfo_student(Student student)
    {
        System.out.println(student);
    }
    
     public void showInfo_staff(Staff staff)
    {
        System.out.println(staff);
    }
     
     public void undefined()
     {
         System.out.println("object not found!");
     }
     public void print_value(int ind)
     {
         System.out.println(ind);
     }
     
     public void print_totalStudent(ArrayList<Student>S)
     {
         for(Student s:S)
         {
             System.out.println(s);
         }
     }

     
     public void print_totalTeacher(ArrayList<Teacher>T)
     {
         for(Teacher t:T)
         {
             System.out.println(t);
         }
     }

     public void print_totalStaff(ArrayList<Staff>St)
     {
         for(Staff st:St)
         {
             System.out.println(st);
         }
     }
     
     public void print_pay_info()
     {
         System.out.println("Payemnt is done");
     }

     public void print_fee_info()
     {
         System.out.println("received fee. Thank you!");
     }
    
}
