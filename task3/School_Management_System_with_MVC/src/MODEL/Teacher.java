/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
public class Teacher extends Person {
    private String post_name;           // The designation of the teacher (e.g., "Math Teacher")
    private String teaching_subject;     // The subject that the teacher teaches
    private int allowance = 0;          // The allowance granted to the teacher
    private int pay_scale;  

    
    
    
    
    public Teacher(String name, String designation, String teaching_subject, String gender, String email_adress,String unique_id,
                   String mobile_number, String blood_group, Address address, Date date_of_birth,
                   Date date_of_joining) {
        super(name, gender, email_adress, mobile_number,unique_id, blood_group, address, date_of_birth, date_of_joining);
        post_name = designation; // Set the teacher's designation
        this.teaching_subject = teaching_subject; // Set the subject taught by the teacher
    }
    public Teacher()
    {
        
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public void setTeaching_subject(String teaching_subject) {
        this.teaching_subject = teaching_subject;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public void setPay_scale(int pay_scale) {
        this.pay_scale = pay_scale;
    }

    public String getPost_name() {
        return post_name;
    }

    public String getTeaching_subject() {
        return teaching_subject;
    }

    public int getAllowance() {
        return allowance;
    }

    public int getPay_scale() {
        return pay_scale;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+ "post_name=" + post_name + ", teaching_subject=" + teaching_subject + ", allowance=" + allowance + ", pay_scale=" + pay_scale + '}';
    }
    
    
    
    
        
    
}
