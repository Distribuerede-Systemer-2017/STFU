package main.server.endpoints;


import com.google.gson.Gson;
import main.server.controllers.EventController;
import main.server.models.Event;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import main.server.controllers.EventController;

import javax.xml.ws.Response;
import java.awt.*;
import java.sql.SQLException;

@Path("/events")
public class EventEndpoint {

    @POST
    @Produces("application/json")
    public Response create(String data) throws SQLException {
        Event event = new Gson().fromJson(data, Event.class);

        if (EventController.addEvent(event)) {

            return Response
                    .status(200)
                    .entity("{\"message\":\"Success! Event created\"}")
                    .build();

        } else return Response
                .status(400)
                .entity("{\"message\":\"Failed.\"}")
                .build();

    }

}


