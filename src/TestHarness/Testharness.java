package TestHarness;

import SubManagement.Controller.AddPaymentInfo;
import SubManagement.Controller.ModifySubs;
import SubManagement.Model.PaymentSub;
import SubManagement.Model.SubPlans;
import SubManagement.View.ViewPayment;
import SubManagement.View.ViewSubPlans;

public class Testharness {

    public static void main(String[] args) {
        Testharness testHarness = new Testharness();

        /** Test the SubManagement
         * add the payment info - add or change payment details
         * modify subscriptions - add, delete, and change subscription plans
         * view payment - display payment details
         * view subscription plans - display subscription plan details
        */
        testHarness.testAddPaymentInfo();
        testHarness.testModifySubscription();
        testHarness.testViewPaymentDetails();
        testHarness.testViewSubPlans();
    }

    // Test AddPaymentInfo
    public void testAddPaymentInfo() {
        System.out.println("Testing AddPaymentInfo...");

        AddPaymentInfo.addPaymentFullName("John", "Doe");
        AddPaymentInfo.addPaymentType("Credit Card");
        AddPaymentInfo.addPaymentInfo(123456789);

        AddPaymentInfo.changePaymentFullName("Jane", "Smith");
        AddPaymentInfo.changePaymentType("Debit Card");
        AddPaymentInfo.changePaymentInfo(987654321);

        System.out.println("AddPaymentInfo Test Completed\n");
    }

    // Test ModifySubs
    public void testModifySubscription() {
        System.out.println("Testing ModifySubs...");

        SubPlans basicPlan = new SubPlans("active", "Basic Plan");
        SubPlans premiumPlan = new SubPlans("inactive", "Premium Plan");

        ModifySubs modifySubs = new ModifySubs();
        modifySubs.modifySubscription(basicPlan);
        modifySubs.modifySubscription(premiumPlan);

        System.out.println("ModifySubs Test Completed\n");
    }

    // Test ViewPayment
    public void testViewPaymentDetails() {
        System.out.println("Testing ViewPayment...");

        PaymentSub paymentSub = new PaymentSub("Credit Card", 123456789, "John", "Doe");
        ViewPayment viewPayment = new ViewPayment();
        viewPayment.displayPaymentDetails(paymentSub);

        System.out.println("ViewPayment Test Completed\n");
    }

    // Test ViewSubPlans
    public void testViewSubPlans() {
        System.out.println("Testing ViewSubPlans...");

        SubPlans basicPlan = new SubPlans("active", "Basic Plan");
        SubPlans premiumPlan = new SubPlans("inactive", "Premium Plan");

        ViewSubPlans viewSubPlans = new ViewSubPlans();
        viewSubPlans.displaySubscriptionDetails(basicPlan);
        viewSubPlans.displaySubscriptionDetails(premiumPlan);

        System.out.println("ViewSubPlans Test Completed\n");
    }
}
