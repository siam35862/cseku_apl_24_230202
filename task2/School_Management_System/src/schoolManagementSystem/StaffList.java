package schoolManagementSystem;

import java.util.ArrayList;

/**
 * The StaffList class manages a list of staff members in the school management system.
 * It provides methods to add, find, remove, and retrieve staff members.
 */
public class StaffList {
    // An ArrayList to hold the staff members
    ArrayList<Staff> staffArrayList = new ArrayList<Staff>();

    /**
     * Constructor to initialize the StaffList.
     */
    public StaffList() {}

    /**
     * Adds a staff member to the staff list.
     *
     * @param staff The staff member to be added
     */
    public void addStaff(Staff staff) {
        staffArrayList.add(staff);
    }

    /**
     * Finds a staff member by their unique identifier.
     *
     * @param staff_id The unique ID of the staff member to find
     * @return The Staff object if found, otherwise null
     */
    public Staff findStaffById(String staff_id) {
        int n = staffArrayList.size();
        for (int i = 0; i < n; i++) {
            if (staff_id.equals(staffArrayList.get(i).getUniqueId())) {
                return staffArrayList.get(i); // Return the found staff member
            }
        }
        return null; // Return null if not found
    }

    /**
     * Gets the index of a staff member in the list.
     *
     * @param staff The staff member whose index is to be found
     * @return The index of the staff member, or -1 if not found
     */
    public int getIndexOfStaff(Staff staff) {
        if (staffArrayList.isEmpty()) return -1; // Return -1 if the list is empty
        int n = staffArrayList.size();
        for (int i = 0; i < n; i++) {
            if (staff.getUniqueId().equals(staffArrayList.get(i).getUniqueId())) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    /**
     * Removes a staff member from the staff list.
     *
     * @param staff The staff member to be removed
     */
    public void removeStaff(Staff staff) {
        int index = getIndexOfStaff(staff);
        if (index != -1) {
            staffArrayList.remove(index); // Remove the staff member if found
        }
    }

    /**
     * Gets the total number of currently running staff members in the school.
     *
     * @return The number of staff members
     */
    public int getTotalRunningStaffNumberInSchool() {
        return staffArrayList.size(); // Return the size of the list
    }
}
