/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import CONTROLLER.controller;
public class TeacherAppoint extends EmployApointment  implements IPayScale, IAllowance  {
    
    private   Teacher teacher;

    public TeacherAppoint(String name, String designation, String teacher_id, String teaching_subject,
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

 
    @Override
    public int determinePayScale() {
        int pay_scale = 0;
        switch (teacher.getPostName()){
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


    @Override
    public int calculateAllowance() {
        int allowance = 0;
        switch (teacher.getPostName()){
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

    controller ct1=new controller();
    
    public void appoint() {
        ct1.add_teacher_by_ctrl(teacher);
    }
    
}
