package MeetingBookClub.View;


import MeetingBookClub.Controller.MeetingListViewController;
import MeetingBookClub.Controller.MeetingsCalendarController;
import MeetingBookClub.Model.Meeting;
import MeetingBookClub.Model.MeetingsList;

/**
 * shows list view of all events
 * public MeetingsCalendarController calendarController;
 */

public class ListView {
    public MeetingsCalendarController calendarController;

    public MeetingsList getMeetingsList() {
        return meetingsList;
    }

    public void setMeetingsList(MeetingsList meetingsList) {
        this.meetingsList = meetingsList;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public MeetingListViewController getMeetingListViewController() {
        return meetingListViewController;
    }

    public void setMeetingListViewController(MeetingListViewController meetingListViewController) {
        this.meetingListViewController = meetingListViewController;
    }

    public MeetingsList meetingsList;
    public Meeting meeting;
    public MeetingListViewController meetingListViewController;

    public ListView(MeetingsCalendarController calendarController) {
        this.calendarController = calendarController;
    }




}
