package SubManagement.View;

import SubManagement.Model.PaymentSub;


public class ViewPayment {

    public void displayPaymentDetails(PaymentSub paymentSub) {
        displayPaymentType(paymentSub.getPaymentType());
        displayPaymentInfo(paymentSub.getPaymentNumberInfo());
        displayPaymentName(paymentSub.getPaymentFName(), paymentSub.getPaymentLName());
    }

    public void displayPaymentType(String paymentType) {
        System.out.println("Payment Type: " + paymentType);
    }

    public void displayPaymentInfo(int paymentInfo) {
        System.out.println("Payment Info: " + paymentInfo);
    }

    public void displayPaymentName(String paymentFName, String paymentLName) {
        System.out.println("Payment Full Name: " + paymentFName + " " + paymentLName);
    }
}
