/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;
import MODEL.Teacher;

/**
 *
 * @author MSI-USER
 */
public class TeacherView {
    public void displayTeacher(Teacher teacher)
    {
        System.out.println(teacher);
    }
    
    public void displayIndex(int index)
    {
        System.out.println(index);
    }
    
    public void displayTotalnumber(int number)
    {
        System.out.println(number);
    }
    
    public void displayAllTeachers(ArrayList<Teacher>teacher)
    {
        for(Teacher t:teacher)
        {
            displayTeacher(t);
        }
    }
}
