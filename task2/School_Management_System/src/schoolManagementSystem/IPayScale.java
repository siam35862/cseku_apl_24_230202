package schoolManagementSystem;

/**
 * IPayScale interface defines a contract for determining pay scales.
 * This interface adheres to the Interface Segregation Principle (ISP)
 * by focusing solely on pay scale determination, ensuring that implementing
 * classes are only required to implement this specific functionality.
 */
public interface IPayScale {
    /**
     * Determines the pay scale for an implementing class.
     *
     * @return the determined pay scale as an integer
     */
    int determinePayScale();
}
