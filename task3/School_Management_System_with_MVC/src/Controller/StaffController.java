/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import MODEL.Staff;
import MODEL.StaffModel;
import View.StaffView;
import java.util.ArrayList;

/**
 *
 * @author MSI-USER
 */
public class StaffController {
    private StaffModel model;
    private StaffView view;
    
    public StaffController(StaffModel model, StaffView view)
    {
        this.model=model;
        this.view=view;
    }
    
    public void addStaff(Staff staff)
    {
        model.addStaff(staff);
    }
    
    public void findStaff(String staff_id)
    {
        Staff staff= model.findStaff(staff_id);
        view.displayStaff(staff);
    }
    
    public void findIndexOfStaff(Staff staff)
    {
        int index= model.getIndexOfStaff(staff);
        view.displayIndex(index);
    }
    
    public void removeStaff(Staff staff)
    {
        model.removeStaff(staff);
    }
    
    public void findTotalNumberOfRunningStaff()
    {
        int total_staff= model.getTotalRunningStaff();
        view.displayTotalstaff(total_staff);
    }
    
    public void showAllStaffs()
    {
        ArrayList<Staff>staff=model.getAllStaffs();
        view.displayAllStaffs(staff);
    }
    
}
