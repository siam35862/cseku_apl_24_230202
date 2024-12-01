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
    private int pay_scale;      // Pay scale of the staff member

    public Staff(String name, String designation, String gender, String email_adress,
                 String mobile_number, String blood_group, Address address, Date date_of_birth,
                 Date date_of_joining) {
        super(name, gender, email_adress, mobile_number, blood_group, address, date_of_birth, date_of_joining);
        post_name = designation;
    }


    public void setPayScale(int ps) {
        pay_scale = ps;
    }

    public String getPost_name() {
        return post_name;
    }

 
    public int getPay_scale() {
        return pay_scale;
    }
    Date d1=new Date();
    
    public String toString()
    {
        return super.toString()+"\ndesignation:"+post_name+"\npay_scale:"+pay_scale+"\ndate of birth:"+date_of_birth+"\ndate of joining:"+date_of_joining
                +"\naddress:" + address;
    }
}
