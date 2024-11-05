package schoolManagementSystem;

/**
 * Student class represents a student in the school management system,
 * extending the Person class to inherit common personal attributes.

 * This class adheres to the Single Responsibility Principle (SRP) by focusing
 * on managing only student-specific data and operations.

 * The class also maintains the Liskov Substitution Principle (LSP),
 * as it can replace a Person without affecting program behavior.
 */
public class Student extends Person {
    private String _class;     // Represents the class or grade of the student
    private String section;    // Represents the section within the class
    private String group;      // Represents the study group, applicable for certain grades

    /**
     * Constructs a Student with the specified details.
     *
     * @param name          the name of the student
     * @param _class        the class or grade of the student
     * @param section       the section within the class
     * @param gender        the gender of the student
     * @param email_adress  the email address of the student
     * @param mobile_number the mobile number of the student
     * @param blood_group   the blood group of the student
     * @param adress        the address of the student
     * @param date_of_birth the birth date of the student
     * @param date_of_joining the date the student joined the school
     */
    public Student(String name, String _class, String section, String gender, String email_adress,
                   String mobile_number, String blood_group, Address adress, Date date_of_birth,
                   Date date_of_joining) {
        super(name, gender, email_adress, mobile_number, blood_group, adress, date_of_birth, date_of_joining);
        this._class = _class;
        this.section = section;
    }

    /**
     * Sets the group for the student. Only applicable for certain classes.
     *
     * @param group the group (e.g., "Science", "Commerce", or "Arts") to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Displays the student's complete information, including group information
     * for classes Nine and Ten.
     */
    public void showInformation() {
        System.out.println("Student Name: " + name +
                "\nClass: " + _class +
                "\nSection: " + section);

        if (_class.equals("Nine") || _class.equals("Ten")) {
            System.out.println("Group: " + group);
        }

        System.out.println(address +
                "\nEmail Address: " + email_adress +
                "\nMobile Number: " + mobile_number +
                "\nGender: " + gender +
                "\nBlood Group: " + blood_group +
                "\nDate Of Birth: " + date_of_birth +
                "\nDate Of Admission: " + date_of_joining);
    }

    /**
     * Retrieves the class/grade of the student.
     *
     * @return the student's class
     */
    public String get_class() {
        return _class;
    }
}
