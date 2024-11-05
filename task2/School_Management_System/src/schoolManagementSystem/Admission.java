package schoolManagementSystem;

/**
 * The Admission class handles the process of admitting new students.
 * It currently has two overloaded methods to admit students with or without
 * a specified group.
 *
 */
public class Admission {

    /**
     * Default constructor for the Admission class.
     */
    public Admission() {
    }

    /**
     * Admits a new student with a specified group.
     *
     * @param name              the name of the student
     * @param student_id        the unique ID for the student
     * @param _class            the class or grade of the student
     * @param section           the section within the class
     * @param group             the study group (e.g., "Science") of the student
     * @param gender            the gender of the student
     * @param email_adress      the email address of the student
     * @param mobile_number     the mobile number of the student
     * @param blood_group       the blood group of the student
     * @param address           the address of the student
     * @param date_of_birth     the birth date of the student
     * @param date_of_admission the admission date of the student
     */
    public void newAdmission(String name, String student_id, String _class, String section, String group,
                             String gender, String email_adress, String mobile_number, String blood_group,
                             Address address, Date date_of_birth, Date date_of_admission) {

        // Creates a new Student instance and sets up student details
        Student student = new Student(name, _class, section, gender, email_adress, mobile_number,
                blood_group, address, date_of_birth, date_of_admission);

        // Retrieves the StudentList and adds the student with a group
        StudentList studentList = Controller.getStudentList();
        student.setUniqueId(student_id);
        studentList.addStudent(student, group);
    }

    /**
     * Admits a new student without specifying a group.
     *
     * @param name              the name of the student
     * @param student_id        the unique ID for the student
     * @param _class            the class or grade of the student
     * @param section           the section within the class
     * @param gender            the gender of the student
     * @param email_adress      the email address of the student
     * @param mobile_number     the mobile number of the student
     * @param blood_group       the blood group of the student
     * @param address           the address of the student
     * @param date_of_birth     the birth date of the student
     * @param date_of_admission the admission date of the student
     */
    public void newAdmission(String name, String student_id, String _class, String section,
                             String gender, String email_adress, String mobile_number,
                             String blood_group, Address address, Date date_of_birth,
                             Date date_of_admission) {

        // Creates a new Student instance and sets up student details
        Student student = new Student(name, _class, section, gender, email_adress, mobile_number,
                blood_group, address, date_of_birth, date_of_admission);

        // Retrieves the StudentList and adds the student without a group
        StudentList studentList = Controller.getStudentList();
        student.setUniqueId(student_id);
        studentList.addStudent(student);
    }
}
