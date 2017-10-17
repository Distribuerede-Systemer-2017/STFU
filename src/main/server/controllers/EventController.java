package main.server.controllers;

import main.server.Utility.DBmanager;

import java.awt.*;
import java.util.ArrayList;

public class EventController {



    //Controller klasse for event. Laver kald til databasen.
    //API forbindes med database.

    //Hedder vores database connector "DBmanager"?
    public ArrayList<Event> getEvent() throws Exception{
        DBmanager db = new DBmanager();
        ArrayList<Event> events = db.getEvents();
        db.close();
        return events;
    }


    //Skal den hedde getEvent eller getEvents?

    public Event getEvent(int id) throws Exception{
        DBmanager db = new DBmanager();
        Event event = db.getEvent(id);
        db.close();
        return event;

    }

    //Hvilke parametre skal updateEvent indeholde? Data?
    public Boolean updateEvent (int id, String xxx, String xxx) throws Exception{
        DBmanager db = new DBmanager();
        //Indsæt parametre
        boolean updateEvent = db.updateEvent(id, xxx);
        db.close();
        return updateEvent;
    }


}
