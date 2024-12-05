/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.ArrayList;



/**
 *
 * @author MSI-USER
 */
public class StaffModel {
    private ArrayList<Staff>staffs=new ArrayList<Staff>();

    public StaffModel() {
    }
    
     public void addStaff(Staff staff) {
        staffs.add(staff); 
    }

    public Staff findStaff(String staff_id) {
        for (Staff staff : staffs) {
            if (staff_id.equals(staff.getUnique_id())) {
                return staff; 
            }
        }
        return null; 
    }

    public int getIndexOfStaff(Staff staff) {
        int index=staffs.indexOf(staff); 
        return index;
    }

    public void removeStaff(Staff staff) {
        int index = getIndexOfStaff(staff); 
        if (index != -1) {
            staffs.remove(index); 
        }
    }

    public int getTotalRunningStaff() {
        return staffs.size(); 
    }

    
    public ArrayList<Staff> getAllStaffs() {
        return staffs; 
    }
    
    
    
}
