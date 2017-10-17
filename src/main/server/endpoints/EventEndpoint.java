package main.server.endpoints;

import com.google.gson.Gson;
import main.server.Utility.DBmanager;
import main.server.models.Event;
import main.server.models.StudentHasEvent;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/events")
public class EventEndpoint {

    //Har udkommenteret mange linjer kode for at det ikke fejler

    //eventTable skal skiftes til rigtigt variable navn
//    EventTable eventTable = EventTable.getInstance();
//    ArrayList<Event> events = evenTable.getEvents();

    @GET
    public Response getEvents() throws Exception {

        //kald en metode der henter alle brugere fra databasen (gemmer dem i en ArrayList??)

        if (EventController.getAllEvents() != null) {
            return Response
                    .status(200)
                    .type("application/json")
                    .entity(new Gson().toJson(EventController.getAllEvents()))
                    .build();
        } else {
            return Response
                    .status(400)
                    .type("application/json")
                    .entity("{\"getEvents\":\"failed\"}")
                    .build();
        }
    }

    @GET
    @Path("{id}/events")
    public Response getEventsById(@PathParam("id") String idEvent) {

        // kald en metode der henter en specifik bruger, på id, fra databasen

        // EventTable eventTable = EventTable.getInstance();
        // Event foundEvent = eventTable.getEventById(idEvent);

        return Response
                .status(200)
                .type("application/json")
                //        .entity(new Gson().toJson(foundEvent))
                .build();
    }

    @POST
    public Response createEvent(String jsonEvent) throws Exception {

        // Kald en metode fra en controller der opretter et event og tilføjer det til databasen

        Event newEvent = new Gson().fromJson(jsonEvent, Event.class);

        if (EventController.createEvent(jsonEvent)) {
            return Response
                    .status(200)
                    .type("application/json")
                    .entity("{\"eventCreated\":\"true\"}")
                    .build();
        } else {
            return Response
                    .status(400)
                    .type("application/json")
                    .entity("{\"eventCreated\":\"failed\"}")
                    .build();
        }


    }

    @POST
    @Path("/attend")
    public Response attendEvent(String jsonEvent) {
        StudentHasEvent newStudent = new Gson().fromJson(jsonEvent, StudentHasEvent.class);

        //MAngler at kalde en metode fra en controller som sørger for at Student bliver tilmedldt et event

        // f.eks. mainController.joinEvent(newStudent);

        return Response
                .status(200)
                .type("application/json")
                .entity("{\"eventAttended\":\"true\"}")
                .build();

    }

    @DELETE
    @Path("{id}/events")
    public Response deleteEvent(String jsonEvent) {

        // kald en metode der tager et specifikt event og sletter der fra databasen


        return Response
                .status(200)
                .type("application/json")
                .entity("{\"eventDeleted\":\"true\"}")
                .build();

    }

    @POST
    public Response updateEvent(String jsonEvent) {

        //kald en metode der finder et specifikt event og derefter giver muligt for at ændre dets indhold


        // EventController.updateEvent(jsonEvent);

        return Response
                .status(200)
                .type("application/json")
                .entity("{\"eventUpdated\":\"true\"}")
                .build();
    }

    @POST
    public Response getAttendingStudents() {

        //kald en metode der


    }

}
