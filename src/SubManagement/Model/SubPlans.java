package SubManagement.Model;

public class SubPlans {
    private String subStatus;  // Changed to String
    private String subDescription;
    private SubPlans currentSub;

    // Constructor
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
}
