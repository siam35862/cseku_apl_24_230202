/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
public class Student extends Person{
    private String _class;     // Represents the class or grade of the student
    private String section;    // Represents the section within the class
    private String group;      // Represents the study group, applicable for certain grades

    
    public Student(String name, String _class, String section,String group, String gender, String email_adress,String unique_id,
                   String mobile_number, String blood_group, Address adress, Date date_of_birth,
                   Date date_of_joining) {
        super(name, gender, email_adress, mobile_number, unique_id ,blood_group, adress, date_of_birth, date_of_joining);
        this._class = _class;
        this.section = section;
        this.group=group;
    }

    public void setClass(String _class) {
        this._class = _class;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String get_Class() {
        return _class;
    }

    public String getSection() {
        return section;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student details are:" +super.toString() +"_class=" + _class + ", section=" + section + ", group=" + group;
    }
    
    
    
    
    

}
