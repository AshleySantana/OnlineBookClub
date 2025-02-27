package SubManagement.View;

import SubManagement.Model.SubPlans;

public class ViewSubPlans {

    public void displaySubscriptionDetails(SubPlans subPlans) {
        displaySubPlans(subPlans);
        displaySubDescription(subPlans.getSubDescription());
        displayCurrentSub(subPlans.getCurrentSub() != null ? subPlans.getCurrentSub().getSubStatus() : "No Current Subscription");
    }

    public void displaySubPlans(SubPlans subPlans) {
        System.out.println("Subscription Status: " + subPlans.getSubStatus());
    }

    public void displaySubDescription(String subDescription) {
        System.out.println("Subscription Description: " + subDescription);
    }

    public void displayCurrentSub(String currentSub) {
        System.out.println("Current Subscription: " + currentSub);
    }
}
