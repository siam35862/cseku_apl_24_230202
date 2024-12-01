/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
import CONTROLLER.controller;
public class FinancialDepartment {
    ITransaction itransaction;
    
    public FinancialDepartment ()
    {
        itransaction=new PaymentService();
    }
    
    controller ct=new controller();
    
    
    // pay monthly salary to teachers
        public void payMonthlySalaryToTeacher(String teacher_id) {
        // Retrieve teacher details using their ID
        Teacher teacher = ct.findTeacherById_by_ctrl(teacher_id);

        // Calculate pay amount based on teacher's allowance and pay scale
        int x=teacher.getPayScale();
        int amount = teacher.getAllowance() + (10 -x ) * 10000;

        // Process the payment (actual account details are hidden with "****")

        itransaction.payAmount(amount, "****",'-');
    }
        
        
        
        // pay monthly salary to staffs
         public void payMonthlySalaryToStaff(String staff_id) {
        // Retrieve staff details using their ID
        Staff staff=ct.findStaffById_by_ctrl(staff_id);

        // Calculate pay amount based on staff's pay scale
        int pay_amount = (10 - staff.getPay_scale()) * 10000;

        // Process the payment (actual account details are hidden with "****")
        itransaction.payAmount(pay_amount, "****",'-');
    }
         
         
         
         
         
         
         // distributing stipend to the students
         public void payStipendToStudent(String student_id) {
        int pay_amount = 0;

        // Retrieve student details using their ID
        Student student = ct.findStudentById_by_ctrl(student_id);

        // Determine stipend amount based on student's class
        if (student.get_class().equals("Six")) pay_amount = 500 * 6;
        if (student.get_class().equals("Seven")) pay_amount = 500 * 7;
        if (student.get_class().equals("Eight")) pay_amount = 500 * 8;
        if (student.get_class().equals("Nine")) pay_amount = 500 * 9;
        if (student.get_class().equals("Ten")) pay_amount = 500 * 10;

        // Process the stipend payment (actual account details are hidden with "****")
        itransaction.payAmount(pay_amount, "****",'-');
    }
         
         
         
         // collecting monthly fees from the studebts
         public void receiveMonthlyFeeFromStudent(String student_id) {
        int fee_amount = 0;

        // Retrieve student details using their ID
        Student student = ct.findStudentById_by_ctrl(student_id);

        // Determine fee amount based on student's class
        if (student.get_class().equals("Six")) fee_amount = 100 * 6;
        if (student.get_class().equals("Seven")) fee_amount = 100 * 7;
        if (student.get_class().equals("Eight")) fee_amount = 100 * 8;
        if (student.get_class().equals("Nine")) fee_amount = 100 * 9;
        if (student.get_class().equals("Ten")) fee_amount = 100 * 10;

        // Process the fee collection (actual account details are hidden with "***")
        itransaction.payAmount(fee_amount, "***",'+');
    }

}
