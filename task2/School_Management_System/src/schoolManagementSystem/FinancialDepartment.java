package schoolManagementSystem;

public class FinancialDepartment {
    // Interfaces for payment and fee collection services
    IPayment ipayment;
    IFeeCollection ifeeCollection;

    // Constructor initializes the payment and fee collection services

    public FinancialDepartment() {
        ipayment = new PaymentService();
        ifeeCollection = new PaymentService();
    }

    // Method to pay monthly salary to a teacher
    public void payMonthlySalaryToTeacher(String teacher_id) {
        // Retrieve teacher details using their ID
        Teacher teacher = Controller.getTeacherList().findTeacherById(teacher_id);

        // Calculate pay amount based on teacher's allowance and pay scale
        int pay_amount = teacher.getAllowance() + (10 - teacher.getPay_scale()) * 10000;

        // Process the payment (actual account details are hidden with "****")

        ipayment.payAmount(pay_amount, "****");
    }

    // Method to pay monthly salary to a staff member
    public void payMonthlySalaryToStaff(String staff_id) {
        // Retrieve staff details using their ID
        Staff staff = Controller.getStaffList().findStaffById(staff_id);

        // Calculate pay amount based on staff's pay scale
        int pay_amount = (10 - staff.getPay_scale()) * 10000;

        // Process the payment (actual account details are hidden with "****")
        ipayment.payAmount(pay_amount, "****");
    }

    // Method to pay stipend to a student based on their class
    public void payStipendToStudent(String student_id) {
        int pay_amount = 0;

        // Retrieve student details using their ID
        Student student = Controller.getStudentList().findStudentById(student_id);

        // Determine stipend amount based on student's class
        if (student.get_class().equals("Six")) pay_amount = 500 * 6;
        if (student.get_class().equals("Seven")) pay_amount = 500 * 7;
        if (student.get_class().equals("Eight")) pay_amount = 500 * 8;
        if (student.get_class().equals("Nine")) pay_amount = 500 * 9;
        if (student.get_class().equals("Ten")) pay_amount = 500 * 10;

        // Process the stipend payment (actual account details are hidden with "****")
        ipayment.payAmount(pay_amount, "****");
    }

    // Method to collect monthly fees from a student
    public void receiveMonthlyFeeFromStudent(String student_id) {
        int fee_amount = 0;

        // Retrieve student details using their ID
        Student student = Controller.getStudentList().findStudentById(student_id);

        // Determine fee amount based on student's class
        if (student.get_class().equals("Six")) fee_amount = 500 * 6;
        if (student.get_class().equals("Seven")) fee_amount = 500 * 7;
        if (student.get_class().equals("Eight")) fee_amount = 500 * 8;
        if (student.get_class().equals("Nine")) fee_amount = 500 * 9;
        if (student.get_class().equals("Ten")) fee_amount = 500 * 10;

        // Process the fee collection (actual account details are hidden with "***")
        ifeeCollection.collectFee(fee_amount, "***");
    }
}
