package main.server.providers;

import main.server.Utility.DBmanager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventProvider {

    public ArrayList<Event> getAllEvents() {
        ArrayList<Event> allEvents = new ArrayList<>();

        ResultSet resultSet = null;

        try {
            PreparedStatement getAllEventsStatement = DBmanager.getConnection().prepareStatement
                    ("SELECT * FROM events ORDER BY event_id");

            resultSet = getAllEventsStatement.executeQuery();

            while (resultSet.next()){
                Event event = new Event(
                        resultSet.getInt("event_id"));

                allEvents.add(event);
            }

            resultSet.close();

            getAllEventsStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allEvents;
    }
}