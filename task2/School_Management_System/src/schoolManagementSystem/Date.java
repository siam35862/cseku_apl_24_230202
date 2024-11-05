package schoolManagementSystem;

/**
 * The Date class represents a specific date consisting of day, month, and year.
 * It provides methods to access individual components of the date and to
 * format the date as a string.
 *
 * This class adheres to the Single Responsibility Principle (SRP) as it
 * encapsulates all functionalities related to date management in one
 * cohesive class. Any changes related to date representation would
 * only affect this class.
 */
public class Date {
    private int day;   // Day of the month
    private int month; // Month of the year
    private int year;  // Year

    /**
     * Constructor to initialize the date with day, month, and year.
     *
     * @param d the day of the month
     * @param m the month of the year
     * @param y the year
     */
    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    /**
     * Gets the day of the date.
     *
     * @return the day of the month
     */
    public int getDay() {
        return day;
    }

    /**
     * Gets the month of the date.
     *
     * @return the month of the year
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the year of the date.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the date as a formatted string.
     *
     * @return a string representation of the date in the format "day-month-year"
     */
    public String toString() {
        return day + "-" + month + "-" + year + "\n";
    }
}
