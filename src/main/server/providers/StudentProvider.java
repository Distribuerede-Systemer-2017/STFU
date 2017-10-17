package main.server.providers;

import main.server.Utility.DBmanager;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentProvider {

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> allStudents = new ArrayList<>();

        ResultSet resultSet = null;

        try {
            PreparedStatement getAllStudentsStatement = DBmanager.getConnection().
                    prepareStatement("SELECT * FROM students ORDER BY student_id");

            resultSet = getAllStudentsStatement.executeQuery();

            while(resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("student_id"));

                allStudents.add(student);
            }

            resultSet.close();

            getAllStudentsStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allStudents;
    }
}
