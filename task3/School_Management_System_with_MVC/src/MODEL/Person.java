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
    protected Date date_of_joining;     // Date of joining for the person

      public Person()
     {
         
     } 

    public Person(String n, String g, String ea, String mn, String bg, Address ad, Date dob, Date doj) {
        name = n;
        gender = g;
        email_adress = ea;
        mobile_number = mn;
        blood_group = bg;
        address = ad;
        date_of_birth = dob;
        date_of_joining = doj;
    }
    
   
    public void setUniqueId(String ui) {
        unique_id = ui;
    }


    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }

 
    public String getEmailAdress() {
        return email_adress;
    }

  
    public String getMobileNumber() {
        return mobile_number;
    }


    public String getBloodGroup() {
        return blood_group;
    }

 
    public String getUniqueId() {
        return unique_id;
    }

 
    public Address getAdress() {
        return address;
    }

    public Date getDateOfBirth() {
        return date_of_birth;
    }


    public Date getDateOfJoining() {
        return date_of_joining;
    }
    
     public String toString()
    {
        return "\nname:"+name+"\ngender:"+gender+"\nemail_address:"+email_adress+"\nmobile_number"+mobile_number+"\nblood_group:"+blood_group;
    }
   
    
    
    
    
    
}
