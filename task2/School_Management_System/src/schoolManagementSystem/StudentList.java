package schoolManagementSystem;

import java.util.ArrayList;

/**
 * The StudentList class manages a list of students in the school management system.
 * It provides methods to add, find, remove, and retrieve student members.
 */
public class StudentList {
    // An ArrayList to hold the student members
    ArrayList<Student> studentArrayList = new ArrayList<Student>();

    /**
     * Constructor to initialize the StudentList.
     */
    public StudentList() {}

    /**
     * Adds a student to the student list.
     *
     * @param student The student to be added
     */
    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    /**
     * Adds a student to the student list with a specified group.
     *
     * @param student The student to be added
     * @param group   The group to be assigned to the student
     */
    public void addStudent(Student student, String group) {
        student.setGroup(group); // Set the group for the student
        studentArrayList.add(student); // Add the student to the list
    }

    /**
     * Finds a student by their unique identifier.
     *
     * @param student_id The unique ID of the student to find
     * @return The Student object if found, otherwise null
     */
    public Student findStudentById(String student_id) {
        int n = studentArrayList.size();
        for (int i = 0; i < n; i++) {
            if (student_id.equals(studentArrayList.get(i).getUniqueId())) {
                return studentArrayList.get(i); // Return the found student
            }
        }
        return null; // Return null if not found
    }

    /**
     * Gets the index of a student in the list.
     *
     * @param student The student whose index is to be found
     * @return The index of the student, or -1 if not found
     */
    public int getIndexOfStudent(Student student) {
        if (studentArrayList.isEmpty()) return -1; // Return -1 if the list is empty
        int n = studentArrayList.size();
        for (int i = 0; i < n; i++) {
            if (student.getUniqueId().equals(studentArrayList.get(i).getUniqueId())) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    /**
     * Removes a student from the student list.
     *
     * @param student The student to be removed
     */
    public void removeStudent(Student student) {
        int index = getIndexOfStudent(student);
        if (index != -1) {
            studentArrayList.remove(index); // Remove the student if found
        }
    }

    /**
     * Gets the total number of currently running students in the school.
     *
     * @return The number of students
     */
    public int getTotalRunningStudentNumberInSchool() {
        return studentArrayList.size(); // Return the size of the list
    }
}
