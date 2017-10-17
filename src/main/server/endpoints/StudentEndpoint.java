package main.server.endpoints;

import javax.annotation.PostConstruct;
import javax.xml.ws.Response;

import model.Student;


public class StudentEndpoint {


    @POST
    @Produces("Application./json")
    public Response create(String data) throws Exception {

        Gson gson = new Gson();
        Student student = gson.fromJson(jsonUser, Student.class);

        if (controller.addStudent(data)) {
            return Response
                    .status(200)
                    .entity("{message\":\"Succes! Student added\"}")
                    .build();
        }
    else return Response.status(400).entity("{\"message\":\"failed\"}").build();
    }
}
