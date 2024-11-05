package schoolManagementSystem;

// PaymentService class implements both IPayment and IFeeCollection interfaces
public class PaymentService implements IPayment, IFeeCollection {


    /**
     * Processes the payment of a specified amount.
     * @param amount The amount to be paid.
     * @param trxID The transaction ID associated with the payment.
     * This class follows the Dependency Inversion Principle (DIP) by depending on the interface.
     * We invoke collectFee(),payAmount() method from its corresponding interface reference
     */
    public void payAmount(int amount, String trxID) {
        // Logic for payment processing
        System.out.println("Payment Done");
    }

    /**
     * Collects the fee from a student or user.
     * @param amount The fee amount to be collected.
     * @param trxID The transaction ID associated with the fee collection.
     */
    public void collectFee(int amount, String trxID) {
        // Logic for fee collection
        System.out.println("Your fee received. Thanks");
    }
}
