-/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;


public class TeacherAppointment extends EmployeeAppointment implements IPayScale,IAllowance{
    

    
    
    @Override
    public void appoint(Teacher teacher)
    {
        int pay_scale = determinePayScale(teacher);
        teacher.setPay_scale(pay_scale);

        int allowance = calculateAllowance(teacher);
        teacher.setAllowance(allowance);
        
        // now add the teacher to the list in teachermodel class
        
        TeacherModel tm=new TeacherModel();
        tm.addTeacher(teacher);
    }
    
    
    
    @Override
    public int determinePayScale(Teacher teacher) {
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
    
    
    
    @Override
    public int calculateAllowance(Teacher teacher) {
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
}
