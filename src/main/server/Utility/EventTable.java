package main.server.Utility;

import main.server.models.Event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EventTable extends DBmanager{

    Connection connection = null;
    Statement statement = null;

    //Henter alle events


    //Tilføjer et event til databasen.
    public boolean addEvent(Event event) throws Exception {

        PreparedStatement addEventStatement =
                connection.prepareStatement("INSERT INTO Events (Event_Name, Location, Description, Pictures, date) VALUES(?, ?, ?, ?, ?)");

        try {
            addEventStatement.setString(1, event.getEventName());
            addEventStatement.setString(2, event.getLocation());
            addEventStatement.setString(3, event.getDescription());
            addEventStatement.setString(4, event.getPictures());
            addEventStatement.setTimestamp(5, event.getDate());

            addEventStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
