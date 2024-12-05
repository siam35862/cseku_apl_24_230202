package MODEL;

public class Date {
    private int day;   // Day of the month
    private int month; // Month of the year
    private int year;  // Year

    public Date() {
    }

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    

    public void setDay(int day) {
        this.day = day;
    }
    
    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
     public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    
    

   
    @Override
    public String toString() {
        return  day +" " + month +" " + year + "\n";
    }
}