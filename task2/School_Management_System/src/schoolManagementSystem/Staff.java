package schoolManagementSystem;

/**
 * The Staff class represents a staff member in the school management system.
 * It extends the Person class and adds attributes specific to staff members,
 * such as designation (post name) and pay scale.

 * This class adheres to the Single Responsibility Principle (SRP) as it focuses
 * solely on managing information and behaviors related to a staff member.
 * All methods and attributes are relevant to the staff role, making the class
 * cohesive and easy to maintain. Any changes regarding staff management will
 * only affect this class.

 * The Staff class also adheres to the Liskov Substitution Principle (LSP) as it
 * extends the Person class and can be substituted for Person in the system without
 * altering the expected behavior. Instances of Staff can be treated as Persons,
 * ensuring correctness in the program's operations.
 */
public class Staff extends Person {
    private String post_name;   // Designation of the staff member
    private int pay_scale;      // Pay scale of the staff member

    /**
     * Constructor to initialize a Staff object with personal and staff-related information.
     *
     * @param name          Name of the staff member
     * @param designation   Designation of the staff member
     * @param gender        Gender of the staff member
     * @param email_adress  Email address of the staff member
     * @param mobile_number  Mobile number of the staff member
     * @param blood_group    Blood group of the staff member
     * @param address       Address of the staff member
     * @param date_of_birth Date of birth of the staff member
     * @param date_of_joining Date of joining of the staff member
     */
    public Staff(String name, String designation, String gender, String email_adress,
                 String mobile_number, String blood_group, Address address, Date date_of_birth,
                 Date date_of_joining) {
        super(name, gender, email_adress, mobile_number, blood_group, address, date_of_birth, date_of_joining);
        post_name = designation;
    }

    /**
     * Sets the pay scale for the staff member.
     *
     * @param ps Pay scale to be assigned
     */
    public void setPayScale(int ps) {
        pay_scale = ps;
    }

    /**
     * Displays the information of the staff member, including personal and staff details.
     */
    public void showInformation() {
        System.out.println("Staff Name: " + name + "\nDesignation: " +
                post_name + "\nPay Scale: " + pay_scale
                + "\n" + address + "Email Adress: " + email_adress +
                "\nMobile Number: " + mobile_number + "\nGender: " + gender +
                "\nBlood Group: " + blood_group + "\nDate Of Birth: " +
                date_of_birth + "Date Of Joining: " + date_of_joining);
    }

    /**
     * Gets the post name of the staff member.
     *
     * @return Designation of the staff member
     */
    public String getPost_name() {
        return post_name;
    }

    /**
     * Gets the pay scale of the staff member.
     *
     * @return Pay scale of the staff member
     */
    public int getPay_scale() {
        return pay_scale;
    }
}
