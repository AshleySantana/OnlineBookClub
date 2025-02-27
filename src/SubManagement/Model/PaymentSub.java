package SubManagement.Model;

public class PaymentSub {
    private String paymentType;  // Changed to String
    private int paymentNumberInfo;
    private String paymentFName;
    private String paymentLName;

    // Constructor
    public PaymentSub(String paymentType, int paymentNumberInfo, String paymentFName, String paymentLName) {
        this.paymentType = paymentType;
        this.paymentNumberInfo = paymentNumberInfo;
        this.paymentFName = paymentFName;
        this.paymentLName = paymentLName;
    }

    // Getters and Setters
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
}
