package main.server.endpoints;

<<<<<<< HEAD

import com.google.gson.Gson;
import main.server.controllers.EventController;
import main.server.models.Event;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
=======
import main.server.controllers.EventController;

import javax.xml.ws.Response;
>>>>>>> 1bcaecf15533c9af30afeba867c08edc647f5f99
import java.awt.*;
import java.sql.SQLException;

@Path("/events")
public class EventEndpoint {

    @POST
    @Produces("application/json")
    public Response create(String data) throws SQLException {
<<<<<<< HEAD
        Event event = new Gson().fromJson(data, Event.class);

        if (EventController.addEvent (event)) {

            return Response
                    .status(200)
                    .entity("{\"message\":\"Success! Event created\"}")
                    .build();

        } else return Response
                .status(400)
                .entity("{\"message\":\"Failed.\"}")
                .build();

    }
=======
        String s = new Gson().fromJson(data.String.class);

        if (EventController.addEvent()){

            return Response;
                    .status(200)
                    .entity("{\message\":Succes! Event created\"}")
                    .build();

        }
else return Response
        .status(400)
        .entity ("{\message\":\Failed.\"}")
        .build();

    }





>>>>>>> 1bcaecf15533c9af30afeba867c08edc647f5f99

}

