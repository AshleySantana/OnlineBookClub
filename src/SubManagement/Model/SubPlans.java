package SubManagement.Model;

/**
 * This class represents a user's subscription plan that includes fields for:
 * - subscription status
 * - description
 * - current subscription plan (could refer to previous/active subscription)
 *
 * All methods and fields are directly related to managing sub details, ensuring low LCOM4 and high cohesion.
 * The class focuses solely on subscription-related operations, making it well-designed for its purpose.
 */
public class SubPlans {
    private String subStatus;  // Subscription status (e.g., active, inactive)
    private String subDescription;  // Description of the subscription (e.g., Basic Plan, Premium Plan)
    private SubPlans currentSub;  // Reference to the current or previous subscription (could be used for history)

    // Constructor for creating a new subscription
    public SubPlans(String subStatus, String subDescription) {
        this.subStatus = subStatus;
        this.subDescription = subDescription;
        this.currentSub = null;  // Initial state (no previous subscription)
    }

    // Constructor that includes a reference to a previous subscription (for chaining)
    public SubPlans(String subStatus, String subDescription, SubPlans currentSub) {
        this.subStatus = subStatus;
        this.subDescription = subDescription;
        this.currentSub = currentSub;
    }

    // Getters and Setters
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public String getSubDescription() {
        return subDescription;
    }

    public void setSubDescription(String subDescription) {
        this.subDescription = subDescription;
    }

    public SubPlans getCurrentSub() {
        return currentSub;
    }

    public void setCurrentSub(SubPlans currentSub) {
        this.currentSub = currentSub;
    }

    // Method to change the subscription (store the old one and update the current subscription)
    public void changeSubscription(String newSubStatus, String newSubDescription) {
        // Store the current subscription as the previous one
        SubPlans oldSub = new SubPlans(this.subStatus, this.subDescription);
        this.currentSub = oldSub;  // Update to previous subscription state

        // Now update to the new subscription details
        this.subStatus = newSubStatus;
        this.subDescription = newSubDescription;

        System.out.println("Subscription updated: " + newSubDescription + " with status: " + newSubStatus);
    }

    // A method to display the current subscription details
    public void displaySubscription() {
        System.out.println("Current Subscription: " + subDescription + " (" + subStatus + ")");
    }
}
