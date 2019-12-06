/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaiserEvents;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Urvashi
 */
public class EventDirectory {
    private ArrayList<Event> eventList;
    
    public ArrayList<Event> getEventDirectory() {
        return eventList;
    }

    public void setEventDirectory(ArrayList<Event> eventDirectory) {
        this.eventList = eventDirectory;
    }

    public EventDirectory() {
        eventList = new ArrayList();
    }
    
    public ArrayList<Event> getOrganizationList() {
        return eventList;
    }
    public void deleteEvent(Event event){
        eventList.remove(event);
    }
    public Event createEvent(String category, Date createDate, String description, String name, UserAccount raisedBy, Double requestAmount, Date targetDate){
        Event event = new Event();
        event.setCategory(name);
        event.setCreateDate(null);
        event.setDescription(name);
        event.setEventName(name);
        event.setRaisedAmt(Double.NaN);
        event.setRaisedBy(name);
        event.setRequestAmt(Double.NaN);
        event.setTargetDate(null);
        eventList.add(event);
        return event;
    }
}
