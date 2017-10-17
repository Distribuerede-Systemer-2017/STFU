package main.server.controllers;


import com.google.gson.Gson;
import main.server.Utility.DBmanager;
import main.server.models.Student;

public class StudentController {

    public boolean addStudent (String data) throws Exception {

        Student student = Gson.fromjson(data, Student.class);
        String hashedPassword = Digester.hashWithSalt(student.getPassword());
        student.setPassword(hashedPassword);
        return DBmanager.addStudent(student);

    }


}
