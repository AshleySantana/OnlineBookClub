package SubManagement.View;

import SubManagement.Model.PaymentSub;

/**
 * ViewPayment handles the display of payment details, which includes methods to display:
 * - payment type
 * - payment number
 * - user's full name
 *
 * All methods work together to produce output from 'PaymentSub' data, maintaining high cohesion and low LCOM4.
 */
public class ViewPayment {

    public void displayPaymentDetails(PaymentSub paymentSub) {
        if (paymentSub != null) {
            displayPaymentType(paymentSub.getPaymentType());
            displayPaymentInfo(paymentSub.getPaymentNumberInfo());
            displayPaymentName(paymentSub.getPaymentFName(), paymentSub.getPaymentLName());
        } else {
            System.out.println("Error: Payment details are not available.");
        }
    }

    public void displayPaymentType(String paymentType) {
        System.out.println("Payment Type: " + paymentType);
    }

    public void displayPaymentInfo(int paymentInfo) {
        // Format the payment info to hide sensitive data (e.g., show only the last 4 digits)
        String formattedPaymentInfo = formatPaymentInfo(paymentInfo);
        System.out.println("Payment Info: " + formattedPaymentInfo);
    }

    public void displayPaymentName(String paymentFName, String paymentLName) {
        System.out.println("Payment Full Name: " + paymentFName + " " + paymentLName);
    }

    private String formatPaymentInfo(int paymentInfo) {
        // Example formatting: show only the last 4 digits
        String paymentInfoStr = String.valueOf(paymentInfo);
        if (paymentInfoStr.length() > 4) {
            return "**** **** **** " + paymentInfoStr.substring(paymentInfoStr.length() - 4);
        }
        return paymentInfoStr;  // Return as is if less than 4 digits
    }
}
