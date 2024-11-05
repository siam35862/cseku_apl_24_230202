package schoolManagementSystem;

/**
 * IAllowance interface defines a contract for calculating allowances.
 * This interface adheres to the Interface Segregation Principle (ISP)
 * by focusing solely on allowance calculation, ensuring that implementing
 * classes are only required to implement this specific functionality.
 */
public interface IAllowance {
     /**
      * Calculates the allowance for an implementing class.
      *
      * @return the calculated allowance as an integer
      */
     int calculateAllowance();
}
