package main.server.endpoints;

import main.server.controllers.EventController;

import javax.xml.ws.Response;
import java.awt.*;
import java.sql.SQLException;

@Path("/events")
public class EventEndpoint {

    @POST
    @Produces("application/json")
    public Response create(String data) throws SQLException {
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






}
