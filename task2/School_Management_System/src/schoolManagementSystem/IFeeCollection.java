package schoolManagementSystem;

/**
 * IFeeCollection interface defines a contract for collecting fees.
 * This interface adheres to the Interface Segregation Principle (ISP)
 * by focusing solely on fee collection functionality, ensuring that
 * implementing classes are only required to implement this specific
 * fee collection behavior.
 */
public interface IFeeCollection {
    /**
     * Collects a specified fee for a given fee ID.
     *
     * @param fee  the amount of the fee to be collected
     * @param feeId  the identifier for the specific fee
     */
    void collectFee(int fee, String feeId);
}
