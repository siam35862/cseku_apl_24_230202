package schoolManagementSystem;

import java.util.ArrayList;

/**
 * The TeacherList class manages a collection of Teacher objects.
 * It provides methods to add, remove, find, and count teachers.
 */
public class TeacherList {
    private ArrayList<Teacher> teacherArrayList = new ArrayList<Teacher>(); // List to hold Teacher objects

    // Constructor to initialize TeacherList
    public TeacherList() {}

    /**
     * Adds a teacher to the list.
     *
     * @param teacher The Teacher object to be added
     */
    public void addTeacher(Teacher teacher) {
        teacherArrayList.add(teacher); // Add the teacher to the list
    }

    /**
     * Finds a teacher by their unique ID.
     *
     * @param teacher_id The unique ID of the teacher to be found
     * @return The Teacher object if found, otherwise null
     */
    public Teacher findTeacherById(String teacher_id) {
        int n = teacherArrayList.size();
        for (int i = 0; i < n; i++) {
            // Compare the unique ID of the teacher with the provided ID
            if (teacher_id.equals(teacherArrayList.get(i).getUniqueId())) {
                return teacherArrayList.get(i); // Return the found teacher
            }
        }
        return null; // Return null if no teacher is found with the provided ID
    }

    /**
     * Gets the index of a specific teacher in the list.
     *
     * @param teacher The Teacher object to find the index for
     * @return The index of the teacher if found, otherwise -1
     */
    public int getIndexOfTeacher(Teacher teacher) {
        if (teacherArrayList.isEmpty()) return -1; // Return -1 if the list is empty
        int n = teacherArrayList.size();
        for (int i = 0; i < n; i++) {
            // Compare the unique ID of the provided teacher with those in the list
            if (teacher.getUniqueId().equals(teacherArrayList.get(i).getUniqueId())) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the teacher is not found
    }

    /**
     * Removes a specific teacher from the list.
     *
     * @param teacher The Teacher object to be removed
     */
    public void removeTeacher(Teacher teacher) {
        int index = getIndexOfTeacher(teacher); // Get the index of the teacher
        if (index != -1) {
            teacherArrayList.remove(index); // Remove the teacher if found
        }
    }

    /**
     * Returns the total number of teachers currently in the school.
     *
     * @return The total count of teachers
     */
    public int getTotalRunningTeacherNumberInSchool() {
        return teacherArrayList.size(); // Return the size of the list
    }
}
