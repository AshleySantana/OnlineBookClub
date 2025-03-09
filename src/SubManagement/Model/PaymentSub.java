package SubManagement.Model;

/**
 * This class represents the payment info for a user and contains fields for:
 * - payment type
 * - payment identification number
 * - user's first and last name
 *
 * Since the methods are tightly related to handling payment info, the measure for the class is expected to be low.
 * All the fields are closely related in the context of managing a user's payment data, with all methods in this class
 * interacting with the payment-related fields and exhibiting high cohesion, meaning the class is well-focused on its primary
 * responsibility.
 */

public class PaymentSub {
    private String paymentType;  // Current payment type
    private int paymentNumberInfo;  // Current payment number
    private String paymentFName;  // Current first name
    private String paymentLName;  // Current last name

    private String paymentTypeNew;  // New payment type (for updates)
    private int paymentNumberInfoNew;  // New payment number (for updates)
    private String paymentFNameNew;  // New first name (for updates)
    private String paymentLNameNew;  // New last name (for updates)

    // Constructor to initialize current payment info
    public PaymentSub(String paymentType, int paymentNumberInfo, String paymentFName, String paymentLName) {
        this.paymentType = paymentType;
        this.paymentNumberInfo = paymentNumberInfo;
        this.paymentFName = paymentFName;
        this.paymentLName = paymentLName;
    }

    // Getters and Setters for current payment info
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getPaymentNumberInfo() {
        return paymentNumberInfo;
    }

    public void setPaymentNumberInfo(int paymentNumberInfo) {
        this.paymentNumberInfo = paymentNumberInfo;
    }

    public String getPaymentFName() {
        return paymentFName;
    }

    public void setPaymentFName(String paymentFName) {
        this.paymentFName = paymentFName;
    }

    public String getPaymentLName() {
        return paymentLName;
    }

    public void setPaymentLName(String paymentLName) {
        this.paymentLName = paymentLName;
    }

    // Methods to handle changes to payment information

    public void changePaymentType(String newPaymentType) {
        this.paymentTypeNew = newPaymentType;
        System.out.println("Payment type updated to: " + newPaymentType);
    }

    public void changePaymentNumberInfo(int newPaymentNumber) {
        this.paymentNumberInfoNew = newPaymentNumber;
        System.out.println("Payment number updated to: " + newPaymentNumber);
    }

    public void changePaymentFullName(String newFName, String newLName) {
        this.paymentFNameNew = newFName;
        this.paymentLNameNew = newLName;
        System.out.println("Full name updated to: " + newFName + " " + newLName);
    }

    // Getter and setter methods for new payment info (in case you want to keep track of updates separately)
    public String getPaymentTypeNew() {
        return paymentTypeNew;
    }

    public void setPaymentTypeNew(String paymentTypeNew) {
        this.paymentTypeNew = paymentTypeNew;
    }

    public int getPaymentNumberInfoNew() {
        return paymentNumberInfoNew;
    }

    public void setPaymentNumberInfoNew(int paymentNumberInfoNew) {
        this.paymentNumberInfoNew = paymentNumberInfoNew;
    }

    public String getPaymentFNameNew() {
        return paymentFNameNew;
    }

    public void setPaymentFNameNew(String paymentFNameNew) {
        this.paymentFNameNew = paymentFNameNew;
    }

    public String getPaymentLNameNew() {
        return paymentLNameNew;
    }

    public void setPaymentLNameNew(String paymentLNameNew) {
        this.paymentLNameNew = paymentLNameNew;
    }
}
