package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
    public static void main(String[] args) {
        try{
            System.out.println("wellcome to jdbc");

            String url = "jdbc:mysql://localhost:3306/nihal";
            String username = "root";
            String password = "admin";


            //  String query="select firstname from familydeatiles where age=57 ";
            String query="delete  from familydeatiles where snlno in (8,9);" ;

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");

//            Statement st = con.createStatement();
            PreparedStatement st=con.prepareStatement(query);

            System.out.println("created statment and excuted query");

           // int count = st.executeUpdate();
            boolean count = st.execute(); //use both acccording to condition


             System.out.println("Here we are deleted "+ count + " records sucessfully  in familydeatiles table");

            con.close();


            System.out.println("connection closed");

            System.out.println("Thank you for your responce");
        }
        catch (Exception e) {
            System.out.println(" soory for the responce ...Here some other classes are loaded plese check the problem " + e);
        }

    }
}
