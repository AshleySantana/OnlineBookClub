package MeetingBookClub.Controller;


import MeetingBookClub.Model.Meeting;
import MeetingBookClub.Model.MeetingsList;
import MeetingBookClub.View.MeetingListView;

public class MeetingListViewController {


    /**
     * Meeting variables to control
     */

    private final MeetingsList model;
    private final MeetingListView view;


    public MeetingListViewController(MeetingsList model, MeetingListView view) {
       this.model=model;
       this.view=view;
    }


    /**
     * getters and setters
     * @return
     */


    /*
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


     */



}
