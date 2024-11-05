package schoolManagementSystem;

/**
 * IPayment interface defines a contract for processing payments.
 * This interface adheres to the Interface Segregation Principle (ISP)
 * by focusing only on payment processing functionality, ensuring that
 * implementing classes are not required to implement unrelated methods.
 */
public interface IPayment {
    /**
     * Processes a specified payment amount for a given payment ID.
     *
     * @param amount      the amount to be paid
     * @param payment_id  the identifier for the specific payment
     */
    void payAmount(int amount, String payment_id);
}
