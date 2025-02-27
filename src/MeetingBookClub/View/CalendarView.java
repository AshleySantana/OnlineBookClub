package MeetingBookClub.View;

import MeetingBookClub.Controller.MeetingListViewController;
import MeetingBookClub.Controller.MeetingsCalendarController;
import MeetingBookClub.Model.Meeting;
import MeetingBookClub.Model.MeetingsList;

public class CalendarView {
    /**
     * This will be the display of the calendar
     */

    public MeetingsCalendarController calendarController;

    public MeetingsCalendarController getCalendarController() {
        return calendarController;
    }

    public void setCalendarController(MeetingsCalendarController calendarController) {
        this.calendarController = calendarController;
    }

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


}
