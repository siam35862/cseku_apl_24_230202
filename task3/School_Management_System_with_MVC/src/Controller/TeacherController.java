/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import MODEL.TeacherModel;
import View.TeacherView;
import MODEL.Teacher;

/**
 *
 * @author MSI-USER
 */
public class TeacherController {
    private TeacherModel model;
    private TeacherView view;
    
    public TeacherController(TeacherModel model, TeacherView view)
    {
        this.model=model;
        this.view=view;
    }
    
    public void addTeacher(Teacher t)
    {
        model.addTeacher((t));
    }
    
    public void findTeacher(String t_id)
    {
        Teacher teacher= model.findTeacherById(t_id);
        view.displayTeacher(teacher);
    }
    
    public void findIndexOfTeacher(Teacher t)
    {
        int index= model.getIndexOfTeacher(t);
        view.displayIndex(index);
    }
    
    public void removeTeacher(Teacher t)
    {
        model.removeTeacher(t);
    }
    
    public void findTotalNumberOfRunningTeacher()
    {
        int total_teacher= model.getTotalRunningTeacher();
        view.displayTotalnumber(total_teacher);
    }
    
    public void showTeachers()
    {
        ArrayList<Teacher>teacher=model.getAllTeachers();
        view.displayAllTeachers(teacher);
    }
            
}
