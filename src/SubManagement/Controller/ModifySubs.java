package SubManagement.Controller;

import SubManagement.Model.SubPlans;

public class ModifySubs {

    // Method to modify subscriptions
    public void ModifySubs(SubPlans subPlans) {
        addSub(subPlans, true);  // Example to add subscription
        deleteSub(subPlans, false);  // Example to delete subscription
        changeSub(subPlans);  // Example to change subscription
    }

    // Add subscription
    public void addSub(SubPlans subPlans, boolean subStatus) {
        System.out.println("Adding Subscription: " + subPlans.getSubDescription() + " with status: " + subStatus);
    }

    // Delete subscription
    public void deleteSub(SubPlans currentSub, boolean subStatus) {
        System.out.println("Deleting Subscription: " + currentSub.getSubDescription() + " with status: " + subStatus);
    }

    // Change subscription
    public void changeSub(SubPlans subPlans) {
        System.out.println("Changing Subscription to: " + subPlans.getSubDescription());
    }
}
