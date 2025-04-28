package MeetingBookClub.Controller;


import MeetingBookClub.Model.Meeting;
import MeetingBookClub.Model.MeetingsList;
import MeetingBookClub.View.MeetingListView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Date;

public class MeetingListViewController implements ActionListener {


    /**
     * Meeting variables to control
     */

    private final MeetingsList model;
    private final MeetingListView view;


    public MeetingListViewController(MeetingsList model, MeetingListView view) {
       this.model=model;
       this.view=view;

      addActionListeners();

    }



    //connecting add button to meeting

    private void addActionListeners(){
        view.getAddToList().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == view.getAddToList()){
            addNewMeeting();
        }
    }

    private void addNewMeeting() {
        Date today = new Date();
        Time now = new Time(System.currentTimeMillis());
        String name = JOptionPane.showInputDialog(view.getJPanell(), "Enter Meeting Name:");
        if (name == null || name.isEmpty()) {
            return;
        }

        String link = JOptionPane.showInputDialog(view.getJPanell(), "Enter Meeting Link:");
        if (link == null || link.isEmpty()) {
            return;
        }


        Meeting newMeeting = new Meeting(today, now, name, link);
        model.addMeetingtoList(newMeeting);

    }






}
