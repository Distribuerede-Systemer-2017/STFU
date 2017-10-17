package main.server.controllers;

import java.awt.*;
import java.util.ArrayList;

public class EventController {



    //Controller klasse for event. Laver kald til databasen.
    //API forbindes med database.

    //Hedder vores database connector "DBConnector"?
    public ArrayList<Event> getEvent() throws Exception{
        DBConnector db = new DBConnector();
        ArrayList<Event> events = db.getEvents();
        db.close();
        return events;
    }


    //Skal den hedde getEvent eller getEvents?

    public Event getEvent(int id) throws Exception{
        DBConnnector db = new DBConnector();
        Event event = db.getEvent(id);
        db.close();
        return event;

    }

    //Hvilke parametre skal updateEvent indeholde?
    public Boolean updateEvent (int id, String xxx, String xxx) throws Exception{
        DBConnector db = new DBConnector();
        //Indsæt parametre
        boolean updateEvent = db.updateEvent(id, xxx);
        db.close();
        return updateEvent;
    }


}
