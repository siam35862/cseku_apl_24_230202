package schoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Initialize the Controller which sets up the system
        new Controller();

        // Get the FinancialDepartment instance from the Controller
        FinancialDepartment financialDepartment = Controller.getFinancialDepartment();

        // Get the Admission instance to manage new student admissions
        Admission admission = Controller.getAdmission();
        // Admit a new student with their details
        admission.newAdmission("Md Siam Ahmed", "230202", "Nine", "A", "Science",
                "Male", "230202@ku.ac.bd", "01925935512", "B+",
                new Address("Islam Nagar Road", "9238", "Khulna"), new Date(19, 1, 2004),
                new Date(14, 8, 2023));

        // Get the Appointment instance to manage appointments for teachers and staff
        Appointment appointment = Controller.getAppointment();
        // Appoint a Head Teacher
        appointment.committee(new TeacherAppointment("X", "Head Teacher", "T01", "Physics", "Male",
                "x01@gmail.com", "019**", "O+",
                new Address("st5", "9238", "Khulna"), new Date(10, 11, 1984),
                new Date(19, 12, 2014)));
        // Appoint an Assistant Teacher
        appointment.committee(new TeacherAppointment("A", "Assistant Teacher", "T02", "Chemistry", "Female",
                "a02@gmail.com", "019**", "B+",
                new Address("st5", "9238", "Khulna"), new Date(18, 11, 1984),
                new Date(19, 11, 2014)));
        // Appoint a Staff member
        appointment.committee(new StaffAppointment("Y", "Lab Assistant", "S01", "Male",
                "x01@gmail.com", "019**", "O+",
                new Address("st5", "9238", "Khulna"), new Date(10, 11, 1984),
                new Date(19, 12, 2014)));

        // Retrieve and print the total number of students in the school
        int total_students = Controller.getStudentList().getTotalRunningStudentNumberInSchool();
        System.out.println("Total Students: " + total_students);

        // Retrieve and print the total number of teachers in the school
        int total_teacher = Controller.getTeacherList().getTotalRunningTeacherNumberInSchool();
        System.out.println("Total Teachers: " + total_teacher);

        // Retrieve and print the total number of staff in the school
        int total_staff = Controller.getStaffList().getTotalRunningStaffNumberInSchool();
        System.out.println("Total Staffs: " + total_staff);

        // Find and display information for a teacher by ID
        Teacher teacher = Controller.getTeacherList().findTeacherById("T01");
        if (teacher == null) {
            System.out.println("Teacher does not exist with given teacher id."); // Print message if teacher not found
        } else {
            teacher.showInformation(); // Display the teacher's information
        }

        // Pay the monthly salary to the teacher with ID "T01"
        financialDepartment.payMonthlySalaryToTeacher("T01");

        // Find and display information for a student by ID
        Student student = Controller.getStudentList().findStudentById("230202");
        if (student == null) {
            System.out.println("Student does not exist with given student id."); // Print message if student not found
        } else {
            student.showInformation(); // Display the student's information
        }
        // Pay the stipend to the student with ID "230202"
        financialDepartment.payStipendToStudent("230202");

        // Find and display information for a staff member by ID
        Staff staff = Controller.getStaffList().findStaffById("S02");
        if (staff == null) {
            System.out.println("Staff does not exist with given staff id."); // Print message if staff not found
        } else {
            staff.showInformation(); // Display the staff member's information
        }
        // Pay the monthly salary to the staff member with ID "S01"
        financialDepartment.payMonthlySalaryToStaff("S01");
        // Receive monthly fee from the student with ID "230202"
        financialDepartment.receiveMonthlyFeeFromStudent("230202");
    }
}
