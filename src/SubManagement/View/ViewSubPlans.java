package SubManagement.View;

import SubManagement.Model.SubPlans;

/**
 * ViewSubPlans displays details about the user's subscription plan:
 * - sub status
 * - description
 * - current sub
 *
 * The LCOM4 measure for this class is low as all methods are focused on displaying different aspects of
 * a sub plan. Each method operates on the 'SubPlans' data to ensure high cohesion within the class.
 */
public class ViewSubPlans {

    public void displaySubscriptionDetails(SubPlans subPlans) {
        if (subPlans != null) {
            displaySubStatus(subPlans);
            displaySubDescription(subPlans.getSubDescription());
            displayCurrentSub(subPlans.getCurrentSub() != null ? subPlans.getCurrentSub().getSubStatus() : "No Current Subscription");
        } else {
            System.out.println("Error: No subscription details available.");
        }
    }

    public void displaySubStatus(SubPlans subPlans) {
        String status = subPlans.getSubStatus() != null ? subPlans.getSubStatus() : "No status available";
        System.out.println("Subscription Status: " + status);
    }

    public void displaySubDescription(String subDescription) {
        String description = subDescription != null && !subDescription.isEmpty() ? subDescription : "No description available";
        System.out.println("Subscription Description: " + description);
    }

    public void displayCurrentSub(String currentSub) {
        System.out.println("Current Subscription: " + currentSub);
    }
}
