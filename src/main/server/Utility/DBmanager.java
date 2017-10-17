package main.server.Utility;

import javax.xml.transform.Result;
import java.sql.*;

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

    public ArrayList getStudents() throws IllegalArgumentException {
        ArrayList results ) new ArrayList();
        ResultSet resultSet = null;

        try {
            PreparedStatement getStudents = connection.prepareStatement("SELECT * FROM Students WHERE Deleted != 1");
            resultSet = getStudents.executeQuery();

            while (resultSet.next()) {
                try {

                    Student students = new Student {
                        resultSet.getInt("UserID")
                    };

                    results.add(students);
                } catch (Exception e) {

                }
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return results;
    }
}
