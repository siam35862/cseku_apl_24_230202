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


    public Student(String name, String _class, String section, String gender, String email_adress,
                   String mobile_number, String blood_group, Address adress, Date date_of_birth,
                   Date date_of_joining) {
        super(name, gender, email_adress, mobile_number, blood_group, adress, date_of_birth, date_of_joining);
        this._class = _class;
        this.section = section;
    }

 
    public void setGroup(String group) {
        this.group = group;
    }

    public String get_class() {
        return _class;
    }
    
    Date d1=new Date();
    
    public String toString()
    {
        return super.toString()+"\n_class:"+_class+"\nsection"+section+"\ngroup:"+group+"\ndate of birth:"+date_of_birth+"\ndate of joining:"+date_of_joining+"\naddress:" + address;
    }
}
