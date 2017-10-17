package main.server.Utility;

import main.server.models.Event;
import main.server.models.Student;

import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBmanager {

    private static Connection connection;

    private static String getWorkingDir() {
        return System.getProperty("user.dir");
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://"
                            + System.getenv("DATABASE_HOST") + ":"
                            + System.getenv("DATABASE_PORT") + "/"
                            + System.getenv("DATABASE_NAME") + "?useSSL=false&serverTimezone=GMT",
                    System.getenv("DATABASE_USER"),
                    System.getenv("DATABASE_PASSWORD"));
        } catch (SQLException sqlException) {
            System.out.print(sqlException.getMessage());
            sqlException.printStackTrace();

            //?useSSL=false&serverTimezone=GMT er taget fra Db-utility.
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    private static void deleteDatabase() {
        try {
            PreparedStatement deleteStatement = getConnection()
                    .prepareStatement("DROP DATABASE " + System.getenv("DATABASE_NAME") + ";");
            deleteStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void createDatabase() {
        try {
            PreparedStatement createStatement = getConnection()
                    .prepareStatement("CREATE DATABASE " + System.getenv("DATABASE_NAME") + ";");
            createStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeSql(String sqlFilePath) {
        try (InputStreamReader file = new InputStreamReader(new FileInputStream(sqlFilePath))) {
            ScriptRunner runner = new ScriptRunner(getConnection());
            runner.runScript(file);
            runner.closeConnection();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void resetDatabase() {
        deleteDatabase();
        System.out.println("Database has been deleted ... ");
        createDatabase();
        System.out.println("Database has been created ... ");
        String sqlFilePath = getWorkingDir() + "/src/main/server/Utility/sql.sql";
        executeSql(sqlFilePath);
        System.out.println("SQL Script done!");

    }

    public static void main(String[] args) {
        resetDatabase();
    }

    public static Connection getConnection() {

        return connection;
    }
//SKAL IKKE LIGGE HERINDE - RYK TIL EVENTCONTROLLER
    public boolean addEvent(Event event) throws SQLException {
        PreparedStatement addEventStatement =
                connection.prepareStatement("INSERT INTO Events (idEvent, EventName, StudentId, Location, Price, Date, Description, Pictures) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

        try {
            addEventStatement.setInt(1, event.getIdEvent());
            addEventStatement.setString(2, event.getEventName());
            addEventStatement.setInt(3, event.getStudentId());
            addEventStatement.setString(4, event.getLocation());
            addEventStatement.setInt(5, event.getPrice());
            addEventStatement.setTimestamp(6, event.getDate());
            addEventStatement.setString(7, event.getDescription());
            addEventStatement.setString(8, event.getPictures());

            int rowsAffected = addEventStatement.executeUpdate();
  
// SKAL IKKE LIGGE HERINDE RYK TIL STUDENT CONTROLLER
    //Adding a Student to the database. Receiving a Student object
    public boolean addStudent (Student student) throws Exception {

        PreparedStatement addStudentStatement =
                connection.prepareStatement("INSERT INTO Students (idStudent, FirstName, LastName, Password) VALUES (?, ?, ?, ?)");

        try {
            addStudentStatement.setInt(1, student.getIdStudent());
            addStudentStatement.setString(2, student.getFirstName());
            addStudentStatement.setString(3, student.getLastName());
            addStudentStatement.setString(4, student.getPassword());

            int rowsAffected = addStudentStatement.executeUpdate();
            if (rowsAffected == 1) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


        return true;

    }


    }



}



