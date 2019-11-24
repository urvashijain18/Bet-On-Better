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

    public EventDirectory() {
        eventDirectory = new ArrayList();
    }
    
    public ArrayList<Event> getOrganizationList() {
        return eventDirectory;
    }
}
