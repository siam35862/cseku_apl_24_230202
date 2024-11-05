package schoolManagementSystem;

/**
 * The Teacher class represents a teacher in the school management system.
 * It extends the Person class and includes additional attributes and methods
 * specific to teachers, such as designation, teaching subject, allowance,
 * and pay scale.
 */
public class Teacher extends Person {
    private String post_name;           // The designation of the teacher (e.g., "Math Teacher")
    private String teaching_subject;     // The subject that the teacher teaches
    private int allowance = 0;          // The allowance granted to the teacher
    private int pay_scale;               // The pay scale of the teacher

    /**
     * Constructor to create a new Teacher object with the given parameters.
     *
     * @param name              The name of the teacher
     * @param designation       The designation of the teacher
     * @param teaching_subject   The subject that the teacher teaches
     * @param gender            The gender of the teacher
     * @param email_adress      The email address of the teacher
     * @param mobile_number      The mobile number of the teacher
     * @param blood_group       The blood group of the teacher
     * @param address           The address of the teacher
     * @param date_of_birth     The date of birth of the teacher
     * @param date_of_joining   The date the teacher joined the institution
     */
    public Teacher(String name, String designation, String teaching_subject, String gender, String email_adress,
                   String mobile_number, String blood_group, Address address, Date date_of_birth,
                   Date date_of_joining) {
        super(name, gender, email_adress, mobile_number, blood_group, address, date_of_birth, date_of_joining);
        post_name = designation; // Set the teacher's designation
        this.teaching_subject = teaching_subject; // Set the subject taught by the teacher
    }

    /**
     * Sets the allowance for the teacher.
     *
     * @param alw The amount of allowance to set
     */
    public void setAllowance(int alw) {
        allowance = alw; // Set the allowance
    }

    /**
     * Sets the pay scale for the teacher.
     *
     * @param ps The pay scale to set
     */
    public void setPayScale(int ps) {
        pay_scale = ps; // Set the pay scale
    }

    /**
     * Displays the information of the teacher, including personal details,
     * designation, subject, allowance, and pay scale.
     */
    public void showInformation() {
        System.out.println("Teacher Name: " + name + "\nTeacher Id: " + unique_id
                + "\nDesignation: " + post_name + "\nTeaching Subject: " +
                teaching_subject + "\nAllowance: " + allowance + "\nPay Scale: "
                + pay_scale + "\n" + address + "Email Adress: " + email_adress +
                "\nMobile Number: " + mobile_number + "\nGender: " + gender +
                "\nBlood Group: " + blood_group + "\nDate Of Birth: " +
                date_of_birth + "Date Of Joining: " + date_of_joining);
    }

    public String getPost_name() {
        return post_name; // Return the designation of the teacher
    }

    public int getAllowance() {
        return allowance; // Return the allowance of the teacher
    }

    public int getPay_scale() {
        return pay_scale; // Return the pay scale of the teacher
    }
}
