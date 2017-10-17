package main.server.endpoints;

import com.google.gson.Gson;
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
    public Response getEvents(){

        //eventTable skiftes ud med rigtige variablenavne
  //      ArrayList<Event> events = evenTable.getEvents();
  //      String jsonResponse = new Gson().toJson(events);

        return Response
                .status(200)
                .type("application/json")
   //             .entity(jsonResponse)
                .build();
    }

    @GET
    @Path("{id}/events")
    public Response getEventsById(@PathParam("id") String idEvent){

       // EventTable eventTable = EventTable.getInstance();
       // Event foundEvent = eventTable.getEventById(idEvent);

        return Response
                .status(200)
                .type("application/json")
        //        .entity(new Gson().toJson(foundEvent))
                .build();
    }

    @POST
    public Response createEvent(String jsonEvent){
        Event newEvent = new Gson().fromJson(jsonEvent, Event.class);
        //eventTable skal skiftes til rigtigt variable navn
      //  eventTable.addEvent(newEvent);

       return Response
           .status(200)
           .type("application/json")
           .entity("{\"eventCreated\":\"true\"}")
           .build();
    }

    @POST
    @Path("/attend")
    public Response attendEvent(String jsonEvent){
        StudentHasEvent newStudent = new Gson().fromJson(jsonEvent, StudentHasEvent.class);

        return Response
                .status(200)
                .type("application/json")
                .entity("{\"eventAttended\":\"true\"}")
                .build();

    }



}
