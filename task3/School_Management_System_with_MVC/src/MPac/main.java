/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MPac;

import MODEL.Teacher; // Importing the Teacher model class
import MODEL.Person;  // Importing the Person model class
import MODEL.Address; // Importing the Address model class
import MODEL.Date;    // Imp
import MODEL.Student; 
import MODEL.Staff; 
import VIEW.view; 
import CONTROLLER.controller;
import java.util.ArrayList;
public class main {
    
    public static void main(String[]args)
    {
        Address ad=new Address("hallroad","2309","khulna");
        Date d1=new Date(7,2,2004);
        Date d2=new Date(16,8,2023);
        Student s1=new Student("masrafi","10","science","male","230207@gmail.com","019..755","B+",ad,d1,d2);
        
        
        
        
        
       
        
    }
    
}
