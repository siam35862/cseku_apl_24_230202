#include<stdio.h>
struct Student_list
{
    char student_name[30],CN[30],student_id[6],grade[2];
    int CTA1,CTA2,CTB1,CTB2;
    int AM,FEM,TM;

};
int best_count(int a,int b);
int avg(int a,int b);
void grade_calculation(int m);

int main()
{
    int i,n,ctA,ctB,ct;
    printf("Enter total student number: ");
    scanf("%d",&n);
     struct Student_list cn,s[n];
    char ch[10];
    gets(ch);
    printf("Enter the course no: ");
    gets(cn.CN);
   
    for(i=0;i<n;i++)
    {
       
        printf("Enter the student id  of student %d: ",i+1);
        gets(s[i].student_id);
        printf("Enter the name of student id %s: ",s[i].student_id);
        gets(s[i].student_name);
        printf("Enter class test 1 mark of section A of student id %s: ",s[i].student_id);
        scanf("%d",&s[i].CTA1);
        printf("Enter class test 2 mark of section A of student id %s: ",s[i].student_id);
        scanf("%d",&s[i].CTA2);
        printf("Enter class test 1 mark of section B of student id %s: ",s[i].student_id);
        scanf("%d",&s[i].CTB1);
        printf("Enter class test 2 mark of section B of student id %s: ",s[i].student_id);
        scanf("%d",&s[i].CTB2);
        printf("Enter attendence mark of student id %s: ",s[i].student_id);
        scanf("%d",&s[i].AM);
        printf("Enter final exam marks mark of student id %s: ",s[i].student_id);
        scanf("%d",&s[i].FEM);
         gets(ch);

        

    }
    printf("\n\nTotal marks and grade of %d students for course no %s.\n\n",n,cn.CN);
    for(i=0;i<n;i++)
    {
        
        ctA=best_count(s[i].CTA1,s[i].CTA2);
         ctB=best_count(s[i].CTB1,s[i].CTB2);
         ct=avg(ctA,ctB);
         s[i].TM=ct+s[i].AM+s[i].FEM;
         printf("Student Id : %s\n",s[i].student_id);
         printf("Student Name : %s\n",s[i].student_name);
         printf("Total  marks: %d\n",s[i].TM);
         grade_calculation(s[i].TM);
         printf("\n\n");
    }

}
int best_count(int a,int b)
{
    if(a>b)return a;
    else return b;
}
int avg(int a,int b)
{
    return (a+b)/2.0;
}
void grade_calculation(int m)
{
    if(m>=80)
    {
        printf("Grade point: 4.00 \nGrade : A+\n");
    }
    else if(m>=75)
    {
        printf("Grade point: 3.75 \nGrade : A\n");
    }
    else if(m>=70)
    {
        printf("Grade point: 3.50 \nGrade : A-\n");
    }else if(m>=65)
    {
        printf("Grade point: 3.25 \nGrade : B+\n");
    }else if(m>=60)
    {
        printf("Grade point: 3.00 \nGrade : B\n");
    }else if(m>=55)
    {
        printf("Grade point: 2.75 \nGrade : B-\n");
    }else if(m>=50)
    {
        printf("Grade point: 2.50 \nGrade : C+\n");
    }else if(m>=45)
    {
        printf("Grade point: 2.25 \nGrade : C\n");
    }else if(m>=40)
    {
        printf("Grade point: 2.00 \nGrade : D\n");
    }
    else
    {
        printf("Grade point: 0.00 \nGrade : F\n");
    }
}