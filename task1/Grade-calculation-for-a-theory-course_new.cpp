#include<stdio.h>
#include<math.h>

// Structure to store student information
struct Student {
    char student_name[30]; // Student name
    char course_code[30];  // Course Code No
    char student_id[6];    // Student ID
    char grade[2];         // Grade
    int ctA1, ctA2;        // Marks of Class Test 1 and Class Test 2 for Section A
    int ctB1, ctB2;        // Marks of Class Test 1 and Class Test 2 for Section B
    int attendance_mark;   // Attendance Marks
    int final_exam_mark;   // Final Exam Marks
    int total_marks;       // Total Marks (including class tests, attendance, and final exam)
};

// Function prototypes
int get_best_ct_score(int a, int b);  
// Function to get the best score between two class tests

int calculate_average(int a, int b);  
// Function to calculate average of two numbers

void calculate_grade(int total_marks);  
// Function to calculate grade based on total marks

int main() {
    int i;
    int  student_count;
    int  best_ctA; // best marks of two class test in section A 
    int  best_ctB;// best marks of two class test in section B
    int average_ct;// average marks of section A and B
    
    // Input the number of students
    printf("Enter total student number: ");
    scanf("%d", &student_count);
    
    // Array of Student structures
    struct Student course, students[student_count];
    char temp[10]; // Temporary buffer to handle newline
    
    // Input the course code
    getchar(); // To consume any leftover newline character
    printf("Enter the course code: ");
    gets(course.course_code);
   
    // Loop to input student details
    for(i = 0; i < student_count; i++) {
        printf("Enter the student id of student %d: ", i + 1);
        gets(students[i].student_id);
        
        printf("Enter the name of student id %s: ", students[i].student_id);
        gets(students[i].student_name);
        
        // Input class test marks for section A
        printf("Enter Class Test 1 mark(out of 300 of Section A for student id %s: ", students[i].student_id);
        scanf("%d", &students[i].ctA1);
        printf("Enter Class Test 2 mark(out of 30) of Section A for student id %s: ", students[i].student_id);
        scanf("%d", &students[i].ctA2);
        
        // Input class test marks for section B
        printf("Enter Class Test 1 mark(out of 30) of Section B for student id %s: ", students[i].student_id);
        scanf("%d", &students[i].ctB1);
        printf("Enter Class Test 2 mark(out of 30) of Section B for student id %s: ", students[i].student_id);
        scanf("%d", &students[i].ctB2);
        
        // Input attendance and final exam marks
        printf("Enter attendance mark(out of 10) for student id %s: ", students[i].student_id);
        scanf("%d", &students[i].attendance_mark);
        printf("Enter final exam mark(out of 60) for student id %s: ", students[i].student_id);
        scanf("%d", &students[i].final_exam_mark);
        
        getchar(); // To consume any leftover newline
    }

    // Output the total marks and grade for each student
    printf("\n\nTotal marks and grade of %d students for course %s.\n\n", student_count, course.course_code);
    
    for(i = 0; i < student_count; i++) {
        // Calculate best class test marks for Section A and B
        best_ctA = get_best_ct_score(students[i].ctA1, students[i].ctA2);
        best_ctB = get_best_ct_score(students[i].ctB1, students[i].ctB2);
        
        // Calculate average of best class tests
        average_ct = calculate_average(best_ctA, best_ctB);
        
        // Calculate total marks
        students[i].total_marks = average_ct + students[i].attendance_mark + students[i].final_exam_mark;
        
        // Print student information
        printf("Student ID: %s\n", students[i].student_id);
        printf("Student Name: %s\n", students[i].student_name);
        printf("Total Marks: %d\n", students[i].total_marks);
        
        // Calculate and display the grade
        calculate_grade(students[i].total_marks);
        printf("\n");
    }
    
    return 0;
}

// Function to get the best score between two class tests
int get_best_ct_score(int a, int b) {
    return (a > b) ? a : b;
}

// Function to calculate the average of two numbers
int calculate_average(int a, int b) {
    return ceil((a + b) / 2.0); // Using ceil to handle floating point average
}

// Function to calculate and print the grade based on total marks
void calculate_grade(int total_marks) {
    if(total_marks >= 80) {
        printf("Grade point: 4.00 \nGrade: A+\n");
    } else if(total_marks >= 75) {
        printf("Grade point: 3.75 \nGrade: A\n");
    } else if(total_marks >= 70) {
        printf("Grade point: 3.50 \nGrade: A-\n");
    } else if(total_marks >= 65) {
        printf("Grade point: 3.25 \nGrade: B+\n");
    } else if(total_marks >= 60) {
        printf("Grade point: 3.00 \nGrade: B\n");
    } else if(total_marks >= 55) {
        printf("Grade point: 2.75 \nGrade: B-\n");
    } else if(total_marks >= 50) {
        printf("Grade point: 2.50 \nGrade: C+\n");
    } else if(total_marks >= 45) {
        printf("Grade point: 2.25 \nGrade: C\n");
    } else if(total_marks >= 40) {
        printf("Grade point: 2.00 \nGrade: D\n");
    } else {
        printf("Grade point: 0.00 \nGrade: F\n");
    }
}
