/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
public class Date {
    private int day;   // Day of the month
    private int month; // Month of the year
    private int year;  // Year


    
    public Date()
    {
        
    }
    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }


    public int getDay() {
        return day;
    }


    public int getMonth() {
        return month;
    }


    public int getYear() {
        return year;
    }

    public String toString() {
        return "date:"+day + "-" + month + "-" + year + "\n";
    }
}
