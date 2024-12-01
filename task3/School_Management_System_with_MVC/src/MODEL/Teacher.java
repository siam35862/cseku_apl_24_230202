package MODEL;


public class Teacher extends Person {
    private String postName;           // The designation of the teacher (e.g., "Math Teacher")
    private String teachingSubject;    // The subject that the teacher teaches
    private int allowance = 0;         // The allowance granted to the teacher
    private int payScale;    
    
    Date d=new Date();
    

    
    public Teacher(String name, String designation, String teachingSubject, String gender, String emailAddress,
                   String mobileNumber, String bloodGroup, Address address, Date dateOfBirth,
                   Date dateOfJoining) {
        super(name, gender, emailAddress, mobileNumber, bloodGroup, address, dateOfBirth, dateOfJoining);
        this.postName = designation; // Set the teacher's designation
        this.teachingSubject = teachingSubject; // Set the subject taught by the teacher
    }


    public void setAllowance(int allowance) {
        this.allowance = allowance; // Set the allowance
    }


    public void setPayScale(int payScale) {
        this.payScale = payScale; // Set the pay scale
    }


    public String getPostName() {
        return postName; // Return the designation of the teacher
    }

    public int getAllowance() {
        return allowance; // Return the allowance of the teacher
    }

    public int getPayScale() {
        return payScale; // Return the pay scale of the teacher
    }
    
    
public String toString() {
    return "Teacher{" +  
            super.toString()+"\npost_name: " + postName +"\nteaching_subject: " + teachingSubject +"\nallowance: " + allowance +"\npay_scale: " + payScale +
            "\ndate of birth:"+date_of_birth+"\ndate of joining:"+date_of_joining+"\naddress:" + address ;                
}
  
}