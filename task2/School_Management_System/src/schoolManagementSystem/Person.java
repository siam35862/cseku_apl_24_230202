package schoolManagementSystem;

/**
 * The Person class represents an individual in the school management system.
 * It encapsulates personal information such as name, gender, contact details,
 * address, and important dates like date of birth and date of joining.

 * This class adheres to the Single Responsibility Principle (SRP) as it focuses
 * solely on managing information related to a person. All methods and attributes
 * are directly related to the concept of a person, making it cohesive and easy
 * to maintain. Changes related to personal information will only affect this class.
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

    /**
     * Constructor to initialize a Person object with all personal information.
     *
     * @param n  Name of the person
     * @param g  Gender of the person
     * @param ea Email address of the person
     * @param mn Mobile number of the person
     * @param bg Blood group of the person
     * @param ad Address of the person
     * @param dob Date of birth of the person
     * @param doj Date of joining of the person
     */
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

    // Default constructor
    public Person() {
    }

    /**
     * Sets the unique identifier for the person.
     *
     * @param ui The unique ID to be assigned
     */
    public void setUniqueId(String ui) {
        unique_id = ui;
    }

    /**
     * Gets the name of the person.
     *
     * @return Name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the gender of the person.
     *
     * @return Gender of the person
     */
    public String getGender() {
        return gender;
    }

    /**
     * Gets the email address of the person.
     *
     * @return Email address of the person
     */
    public String getEmailAdress() {
        return email_adress;
    }

    /**
     * Gets the mobile number of the person.
     *
     * @return Mobile number of the person
     */
    public String getMobileNumber() {
        return mobile_number;
    }

    /**
     * Gets the blood group of the person.
     *
     * @return Blood group of the person
     */
    public String getBloodGroup() {
        return blood_group;
    }

    /**
     * Gets the unique ID of the person.
     *
     * @return Unique ID of the person
     */
    public String getUniqueId() {
        return unique_id;
    }

    /**
     * Gets the address of the person.
     *
     * @return Address of the person
     */
    public Address getAdress() {
        return address;
    }

    /**
     * Gets the date of birth of the person.
     *
     * @return Date of birth of the person
     */
    public Date getDateOfBirth() {
        return date_of_birth;
    }

    /**
     * Gets the date of joining of the person.
     *
     * @return Date of joining of the person
     */
    public Date getDateOfJoining() {
        return date_of_joining;
    }
}
