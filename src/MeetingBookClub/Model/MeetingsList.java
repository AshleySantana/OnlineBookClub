package MeetingBookClub.Model;

import java.util.List;

public class MeetingsList  {

    /**
     * List of meetings
     */
    private List<MeetingInterface> meetingList;


    /**
     * Constructor
     * @param meetingList
     */

    public MeetingsList(List meetingList) {
        this.meetingList = meetingList;
    }


    public void addToList (MeetingInterface meeting){
        meetingList.add(meeting);
    }


    /**
     * Getters and setters
     * @return
     */



    public List getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(List meetingList) {
        this.meetingList = meetingList;
    }


    /**
     * adding to meeting list
     */


    public void addMeetingList (){

    }

    /**
     * deleting
     */

   public void deleteMeetingList(){

   }




}
