/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import MODEL.Staff;
import java.util.ArrayList;

/**
 *
 * @author MSI-USER
 */
public class StaffView {
    public void displayStaff(Staff staff)
    {
        System.out.println(staff);
    }
    
    public void displayIndex(int index)
    {
        System.out.println(index);
    }
    
    public void displayTotalstaff(int number)
    {
        System.out.println(number);
    }
    
    public void displayAllStaffs(ArrayList<Staff>staff)
    {
        for(Staff stf:staff)
        {
            displayStaff(stf);
        }
    }
}
