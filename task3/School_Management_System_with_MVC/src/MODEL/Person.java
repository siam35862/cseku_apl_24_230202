/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
public class Person {
    protected String name;               // Name of the person
    protected String gender;             // Gender of the person
    protected String email_adress;       // Email address of the person
    protected String mobile_number;      // Mobile number of the person
    protected String blood_group;        // Blood group of the person
    protected String unique_id;          // Unique identifier for the person
    protected Address address;           // Address of the person
    protected Date date_of_birth;       // Date of birth of the person
    protected Date date_of_joining;     // e
    
   
    public Person(String name,String gender,String email_address,String mobile_number,String unique_id,String blood_group,
            Address address,Date date_of_birth,Date date_of_joining)
    {
        this.name=name;
        this.gender=gender;
        this.email_adress=email_address;
        this.mobile_number=mobile_number;
        this.blood_group=blood_group;
        this.address=address;
        this.date_of_birth=date_of_birth;
        this.date_of_joining=date_of_joining;
        this.unique_id=unique_id;
        
    }
    
    public Person()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setDate_of_joining(Date date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail_adress() {
        return email_adress;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public Date getDate_of_joining() {
        return date_of_joining;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", gender=" + gender + ", email_adress=" + email_adress + ", mobile_number=" + mobile_number + ", blood_group=" + blood_group + ", unique_id=" + unique_id + "\naddress:\n" + address + "date_of_birth:\n" + date_of_birth + "date_of_joining:\n" + date_of_joining;
    }

    void setPay_scale(int pay_scale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
