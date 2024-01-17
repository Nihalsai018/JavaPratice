package jdbc;

import java.sql.*;

public class Update {
    public static void main(String[] args) {
        try{
        System.out.println("wellcome to jdbc");

            String url = "jdbc:mysql://localhost:3306/nihal";
            String username = "root";
            String password = "admin";


            //  String query="select firstname from familydeatiles where age=57 ";
            String query=" update familydeatiles set lastname='gade',firstname='laxmi' where snlno=5;" ;

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");

            Statement st = con.createStatement();

            System.out.println("created statment and excuted query");

            int count = st.executeUpdate(query);


            System.out.println("Here we are updated "+ count + " records sucessfully  in familydeatiles table");

            con.close();


            System.out.println("connection closed");

            System.out.println("Thank you for your responce");
        }
        catch (Exception e) {
            System.out.println(" soory for the responce ...Here some other classes are loaded plese check the problem " + e);
        }
    }
}
