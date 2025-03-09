package SubManagement.Controller;

import UserAuthentication.Model.User;

/**
 * AddPaymentInfo provides methods to add payment-related info:
 * - user's full name on payment method
 * - payment type
 * - payment number
 * ChangePaymentInfo provides methods to change payment-related info:
 * - user's full name on payment method
 * - payment type
 * - payment number
 * The LCOM4 measure is low as all methods are directly related to adding or managing payment info. To ensure the
 * payment details are properly set, the methods work together. There is high cohesion in this class as all
 * methods focused on adding or changing payment-related data.
 *
 */

public class AddPaymentInfo {
    // Methods to add payment info


    public static void addPaymentInfo(User user, String paymentType, int paymentNumberInfo) {
        user.paymentType = paymentType; // Directly modify paymentType of the user
        user.paymentInfo = paymentNumberInfo; // Directly modify paymentInfo of the user
        System.out.println("Payment Info Added for " + user.getUsername() + ": " + paymentType + " - " + paymentNumberInfo);
    }

    // Method to change payment information
    public static void changePaymentInfo(User user, String paymentType, int paymentNumberInfo) {
        user.paymentType = paymentType; // Directly modify paymentType of the user
        user.paymentInfo = paymentNumberInfo; // Directly modify paymentInfo of the user
        System.out.println("Payment Info Changed for " + user.getUsername() + ": " + paymentType + " - " + paymentNumberInfo);
    }
    public static void addPaymentFullName(String paymentFName, String paymentLName) {
        System.out.println("Full Name Added: " + paymentFName + " " + paymentLName);
    }

    public static void addPaymentType(String paymentType) {
        System.out.println("Payment Type Added: " + paymentType);
    }

    public static void addPaymentInfo(int paymentNumberInfo) {
        System.out.println("Payment Info Added: " + paymentNumberInfo);
    }

    // Methods to change payment info
    public static void changePaymentFullName(String paymentFName, String paymentLName) {
        System.out.println("Full Name Changed: " + paymentFName + " " + paymentLName);
    }

    public static void changePaymentType(String paymentType) {
        System.out.println("Payment Type Changed: " + paymentType);
    }

    public static void changePaymentInfo(int paymentNumberInfo) {
        System.out.println("Payment Info Changed: " + paymentNumberInfo);
    }
}
