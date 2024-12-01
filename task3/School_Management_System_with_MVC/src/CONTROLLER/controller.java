/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import VIEW.view;
import MODEL.Teacher; // Importing the Teacher model class
import MODEL.Person;  // Importing the Person model class
import MODEL.Address; // Importing the Address model class
import MODEL.Date;    // Imp
import MODEL.Student; 
import MODEL.Staff; 
import java.util.ArrayList;

public class controller {
    
    public controller()
    {
        
    }
    
    view v=new view();
   
    ArrayList<Teacher>T1=new ArrayList();
    ArrayList<Student>S1=new ArrayList();
    ArrayList<Staff>St1=new ArrayList();
    
    
    
    public void add_teacher_by_ctrl(Teacher t)
    {
        T1.add(t);
    }
    
     public void add_student_by_ctrl(Student s)
    {
        S1.add(s);
    }
     
      public void add_student_by_ctrl(Student s,String grp)
    {
        s.setGroup(grp);
        S1.add(s);
    }
     
     public void add_staff_by_ctrl(Staff st)
     {
         St1.add(st);
     }
     
      public Student findStudentById_by_ctrl(String student_id) {
        int n = S1.size();
        for (int i = 0; i < n; i++) {
            if (student_id.equals(S1.get(i).getUniqueId())) {
                 v.showInfo_student((S1.get(i)));
                 return S1.get(i);
            }
        }
        v.undefined();
        return null;
        // Return null if not found
    }
      
       public Teacher findTeacherById_by_ctrl(String teacher_id) {
        int n = T1.size();
        for (int i = 0; i < n; i++) {
            // Compare the unique ID of the teacher with the provided ID
            if (teacher_id.equals(T1.get(i).getUniqueId())) {
                v.showInfo_teacher((T1.get(i))); 
                 return T1.get(i);
            }
        }
        v.undefined(); // Return null if no teacher is found with the provided ID
        return null;
    }
       
           public Staff findStaffById_by_ctrl(String staff_id) {
        int n = St1.size();
        for (int i = 0; i < n; i++) {
            if (staff_id.equals(St1.get(i).getUniqueId())) {
                v.showInfo_staff((St1.get(i)));
                return St1.get(i);// Return the found staff member
            }
        }
        v.undefined(); // Return null if not found
        return null;
    }
       
        public int getIndexOfStudent_by_ctrl(Student student) {
        if (S1.isEmpty())
        {
            v.undefined(); 
            return -1;
        }
        int n = S1.size();
        for (int i = 0; i < n; i++) {
            if (student.getUniqueId().equals(S1.get(i).getUniqueId())) {
                v.print_value(i); 
                return i;
            }
        }
        v.undefined(); 
        return -1;
    }
        
        
         public int getIndexOfTeacher_by_ctrl(Teacher teacher) {
         if (T1.isEmpty())
        {
            v.undefined(); 
            return -1;
        }
        int n = T1.size();
        for (int i = 0; i < n; i++) {
            if (teacher.getUniqueId().equals(T1.get(i).getUniqueId())) {
                v.print_value(i); 
                return i; // Return the index if found
            }
        }
        v.undefined(); 
        return -1; // Return -1 if the teacher is not found
    }
         
         
         
         
         
          public int getIndexOfStaff_by_ctrl(Staff staff) {
        if (St1.isEmpty())
        {
            v.undefined(); 
            return -1;
        }
        int n = St1.size();
        for (int i = 0; i < n; i++) {
            if (staff.getUniqueId().equals(St1.get(i).getUniqueId())) {
                 v.print_value(i); 
                return i; // Return the index if found
            }
        }
        v.undefined();
        return -1; // Return -1 if not found
    }
          
          
          
        
//            public void removeStudent_by_ctrl(Student student) {
//        int index = getIndexOfStudent_by_ctrl(student);
//        if (index != -1) {
//            S1.remove(index); // Remove the student if found
//        }
//    }
          
          
            public void removeMember_by_ctrl(Object obj) {
                Person p2=(Person)obj;
                if(p2 instanceof Student)
                {
                    Student s=(Student)obj;
                    int index = getIndexOfStudent_by_ctrl(s);
                    if (index != -1) {
                    S1.remove(index); // Remove the student if found
                  }
                    return ;
                }
                
                if(p2 instanceof Teacher)
                {
                    Teacher t=(Teacher)obj;
                    int index = getIndexOfTeacher_by_ctrl(t);
                    if (index != -1) {
                    T1.remove(index); // Remove the student if found
                  }
                    return ;
                }
                
                if(p2 instanceof Staff)
                {
                    Staff s=(Staff)obj;
                    int index = getIndexOfStaff_by_ctrl(s);
                    if (index != -1) {
                    St1.remove(index); // Remove the student if found
                  }                    
                }
        
              }
            
           
            public int getTotalRunningStudentNumberInSchool_by_ctrl() {
                v.print_value(S1.size());
            return S1.size(); // Return the size of the list
    }
            
             public int getTotalRunningTeacherNumberInSchool_by_ctrl() {
                v.print_value(T1.size());
            return T1.size(); // Return the size of the list
    }
             
              public int getTotalRunningStaffNumberInSchool_by_ctrl() {
                v.print_value(St1.size());
            return St1.size(); // Return the size of the list
    }
              
              
              public void print_totalStudentDetails_by_ctrl()
              {
                  v.print_totalStudent(S1);
              }
              
              public void print_totalStaffDetails_by_ctrl()
              {
                  v.print_totalStaff(St1);
              }
              
              public void print_totalTeacherDetails_by_ctrl()
              {
                  v.print_totalTeacher(T1);
              }
              
              
              //admission done
              
              
             
              
              public void print_transaction_info(char ch)
              {
                  if(ch=='-')
                  v.print_pay_info();
                  else v.print_fee_info();
              }
              
      
        
}
