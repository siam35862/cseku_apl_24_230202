package schoolManagementSystem;

/**
 * TeacherAppointment class is responsible for managing the appointment details
 * of a teacher, including setting pay scale and allowances based on designation.

 * This class:
 * - Adheres to the Interface Segregation Principle (ISP) by implementing only
 *   specific interfaces related to pay scale and allowance.

 */
public class TeacherAppointment extends EmployeeAppointment implements IPayScale, IAllowance {
    private Teacher teacher;

    /**
     * Constructs a TeacherAppointment with the specified details, initializing
     * a Teacher instance and setting pay scale and allowance based on designation.
     *
     * @param name             the name of the teacher
     * @param designation      the designation of the teacher
     * @param teacher_id       the unique ID for the teacher
     * @param teaching_subject the subject taught by the teacher
     * @param gender           the gender of the teacher
     * @param email_adress     the email address of the teacher
     * @param mobile_number    the mobile number of the teacher
     * @param blood_group      the blood group of the teacher
     * @param address          the address of the teacher
     * @param date_of_birth    the birth date of the teacher
     * @param date_of_joining  the joining date of the teacher
     */
    public TeacherAppointment(String name, String designation, String teacher_id, String teaching_subject,
                              String gender, String email_adress, String mobile_number, String blood_group,
                              Address address, Date date_of_birth, Date date_of_joining) {
        // Initialize the Teacher instance with provided information
        teacher = new Teacher(name, designation, teaching_subject, gender, email_adress, mobile_number,
                blood_group, address, date_of_birth, date_of_joining);

        // Set pay scale and allowance based on designation
        int pay_scale = determinePayScale();
        teacher.setPayScale(pay_scale);

        int allowance = calculateAllowance();
        teacher.setAllowance(allowance);

        // Assign the unique teacher ID
        teacher.setUniqueId(teacher_id);
    }

    /**
     * Determines the pay scale based on the teacher's designation.
     *
     * @return an integer representing the pay scale level
     */
    @Override
    public int determinePayScale() {
        int pay_scale = 0;
        switch (teacher.getPost_name()) {
            case "Head Teacher":
                pay_scale = 1;
                break;
            case "Assistant Head Teacher":
                pay_scale = 2;
                break;
            case "Teacher":
                pay_scale = 3;
                break;
            default:
                pay_scale = 4;
                break;
        }
        return pay_scale;
    }

    /**
     * Calculates the allowance based on the teacher's designation.
     *
     * @return an integer representing the allowance amount
     */
    @Override
    public int calculateAllowance() {
        int allowance = 0;
        switch (teacher.getPost_name()) {
            case "Head Teacher":
                allowance = 10000;
                break;
            case "Assistant Head Teacher":
                allowance = 5000;
                break;
            default:
                allowance = 0;
                break;
        }
        return allowance;
    }

    /**
     * Appoints the teacher by adding them to the teacher list.
     */
    public void appoint() {
        TeacherList teacherList = Controller.getTeacherList();
        teacherList.addTeacher(teacher);
    }
}
