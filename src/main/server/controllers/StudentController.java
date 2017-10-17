package main.server.controllers;

import com.google.gson.Gson;
import main.server.Utility.DBmanager;

import java.util.ArrayList;

public class StudentController {
    Gson gson;
    DBmanager db = new DBmanager();

    public StudentController() {
        this.gson = new Gson();

    }

    public ArrayList<Student> getStudents() {
        DBmanager db = new DBmanager();
        ArrayList<Student> students = db.getStudents();
        db.close();
        return students;
    }

    public Student getStudents(int id) {
        DBmanager db = new DBmanager();
        Student student = db.getStudents(id);
        db.close();
        return students;
    }

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
