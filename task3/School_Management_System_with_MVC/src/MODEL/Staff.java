/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
public class Staff extends Person{
    private String post_name;   // Designation of the staff member
    private int pay_scale;  

    public Staff(String post_name, int pay_scale, String name, String gender, String email_address, String mobile_number, String unique_id, String blood_group, Address address, Date date_of_birth, Date date_of_joining) {
        super(name, gender, email_address, mobile_number, unique_id, blood_group, address, date_of_birth, date_of_joining);
        this.post_name = post_name;
        this.pay_scale = pay_scale;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public void setPay_scale(int pay_scale) {
        this.pay_scale = pay_scale;
    }

    public String getPost_name() {
        return post_name;
    }

    public int getPay_scale() {
        return pay_scale;
    }

    @Override
    public String toString() {
        return "Staff{" +super.toString() +"post_name=" + post_name + ", pay_scale=" + pay_scale + '}';
    }
    
    
    
    
    
    
}
