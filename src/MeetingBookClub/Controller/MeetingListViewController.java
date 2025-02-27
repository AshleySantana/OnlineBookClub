package MeetingBookClub.Controller;

import MeetingBookClub.Model.Meeting;
import MeetingBookClub.Model.MeetingsList;

public class MeetingListViewController {


    /**
     * Meeting variables to control
     */

    public Meeting meeting;
    public MeetingsList meetingsList;

    /**
     * Constructor
     * @param meeting
     * @param meetingsList
     */
    public MeetingListViewController(Meeting meeting, MeetingsList meetingsList) {
        this.meeting = meeting;
        this.meetingsList = meetingsList;
    }


    /**
     * getters and setters
     * @return
     */

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public MeetingsList getMeetingsList() {
        return meetingsList;
    }

    public void setMeetingsList(MeetingsList meetingsList) {
        this.meetingsList = meetingsList;
    }




}
