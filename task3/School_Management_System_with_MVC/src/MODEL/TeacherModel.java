package MODEL;

import java.util.ArrayList;


public class TeacherModel {
    
    private ArrayList<Teacher>teacher=new ArrayList<Teacher>();

    
    public TeacherModel() {}

    public void addTeacher(Teacher t) {
        teacher.add(t); 
    }

    public Teacher findTeacherById(String teacher_id) {
        for (Teacher teacher : teacher) {
            if (teacher_id.equals(teacher.getUnique_id())) {
                return teacher; 
            }
        }
        return null; 
    }

    public int getIndexOfTeacher(Teacher t) {
        int index=teacher.indexOf(t); 
        return index;
    }

    public void removeTeacher(Teacher t) {
        int index = getIndexOfTeacher(t); 
        if (index != -1) {
            teacher.remove(index); 
        }
    }

    public int getTotalRunningTeacher() {
        return teacher.size(); 
    }

    
    public ArrayList<Teacher> getAllTeachers() {
        return teacher; 
    }
}