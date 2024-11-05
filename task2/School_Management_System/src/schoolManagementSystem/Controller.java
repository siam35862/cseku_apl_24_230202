package schoolManagementSystem;

/**
 * The Controller class acts as a central point of access for various
 * management components of the school system, including student, teacher,
 * staff lists, admissions, appointments, and the financial department.

 */
public class Controller {
    private static StudentList studentList;        // List of students
    private static TeacherList teacherList;        // List of teachers
    private static StaffList staffList;            // List of staff
    private static Admission admission;             // Admission handling
    private static Appointment appointment;         // Appointment management
    private static FinancialDepartment financialDepartment; // Financial operations

    /**
     * Default constructor that initializes all management components.
     */
    public Controller() {
        studentList = new StudentList();           // Initialize student list
        teacherList = new TeacherList();           // Initialize teacher list
        staffList = new StaffList();               // Initialize staff list
        admission = new Admission();                // Initialize admission management
        appointment = new Appointment();            // Initialize appointment management
        financialDepartment = new FinancialDepartment(); // Initialize financial department
    }

    /**
     * Retrieves the StudentList instance.
     *
     * @return the current StudentList
     */
    public static StudentList getStudentList() {
        return studentList;
    }

    /**
     * Retrieves the StaffList instance.
     *
     * @return the current StaffList
     */
    public static StaffList getStaffList() {
        return staffList;
    }

    /**
     * Retrieves the TeacherList instance.
     *
     * @return the current TeacherList
     */
    public static TeacherList getTeacherList() {
        return teacherList;
    }

    /**
     * Retrieves the Admission instance.
     *
     * @return the current Admission management object
     */
    public static Admission getAdmission() {
        return admission;
    }

    /**
     * Retrieves the Appointment instance.
     *
     * @return the current Appointment management object
     */
    public static Appointment getAppointment() {
        return appointment;
    }

    /**
     * Retrieves the FinancialDepartment instance.
     *
     * @return the current FinancialDepartment object
     */
    public static FinancialDepartment getFinancialDepartment() {
        return financialDepartment;
    }
}
