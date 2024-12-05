/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
public class StaffAppointment extends EmployeeAppointment implements IPayScale{
    
    public void appoint(Staff staff)
    {
        int pay_scale = determinePayScale(staff);
        staff.setPay_scale(pay_scale);

        StaffModel stf=new StaffModel();
        stf.addStaff(staff);
    }
    
    
    public int determinePayScale(Staff staff) {
        int pay_scale = 0;
        switch (staff.getPost_name()) {
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
    
}
