package main.server.controllers;


import main.server.models.Student;

public class StudentController {

    public addStudent (String data) throws Exception {

        Student student = Gson.fromjson(data, Student.class);
        String hashedPassword = Digester.hashWithSalt(student.getPassword());
        student.setPassword(hashedPassword);
        return db.addStudent(student);

    }


}
