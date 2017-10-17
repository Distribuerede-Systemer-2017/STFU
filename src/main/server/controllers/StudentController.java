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

}
