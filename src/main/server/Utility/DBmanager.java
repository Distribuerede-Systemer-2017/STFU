package main.server.Utility;

import main.server.models.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBmanager {

    private static Connection connection;

    static {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://"+System.getenv("DATABASE_HOST") + ":" + System.getenv("DATABASE_PORT") + "/" + System.getenv("DATABASE_NAME"), System.getenv("DATABASE_USER"), System.getenv("DATABASE_PASSWORD"));
        } catch (SQLException sqlException){
            System.out.print(sqlException.getMessage());
            sqlException.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

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


    }



}
