/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaiserEvents;

import java.util.ArrayList;

/**
 *
 * @author Urvashi
 */
public class EventDirectory {
    private ArrayList<Event> eventDirectory;
    
    public ArrayList<Event> getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(ArrayList<Event> eventDirectory) {
        this.eventDirectory = eventDirectory;
    }

    public EventDirectory() {
        eventDirectory = new ArrayList();
    }
    
    public ArrayList<Event> getOrganizationList() {
        return eventDirectory;
    }
    public void deleteEvent(Event event){
        eventDirectory.remove(event);
    }
}
