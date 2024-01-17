package jdbc;

import java.sql.*;

public class Insert {
    public static void main(String[] args) {
        //------------------------------using prepared statment storing dynamiclly from user out side of query-------------------------------------------------------------------------------
        try {
            System.out.println("wellcome to jdbc");

            String url = "jdbc:mysql://localhost:3306/nihal";
            String username = "root";
            String password = "root";

            int snlno=10;
            String lastname="gade";
            String firstname="rajalingam";
            int agee=90;



            String query="insert into familydeatiles values(?,?,?,?);" ;

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");

            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,snlno);
            st.setString(2,lastname);
            st.setString(3,firstname);
            st.setInt(4,agee);

            System.out.println("created statment and excuted query");

            int count = st.executeUpdate();


            System.out.println("Here we are inserted "+ count + " records sucessfully  in familydeatiles table");

            con.close();


            System.out.println("connection closed");

            System.out.println("Thank you for your responce");
        }
        catch (Exception e) {
            System.out.println(" soory for the responce ...Here some other classes are loaded plese check the problem " + e);
        }


    }
    //-----------------------------using statment only inserting one value-----------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        try {
//
//            System.out.println("wellcome to jdbc");
//
//            String url = "jdbc:mysql://localhost:3306/nihal";
//            String username = "root";
//            String password = "admin";
//
//
//            //  String query="select firstname from familydeatiles where age=57 ";
//            String query="insert into familydeatiles values(6,'gade','lachanna',75);" ;
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded");
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("connection established");
//
//            Statement st = con.createStatement();
//
//            System.out.println("created statment and excuted query");
//
//            int count = st.executeUpdate(query);
//
//
//            System.out.println("Here we are inserted "+ count + " records sucessfully  in familydeatiles table");
//
//            con.close();
//
//
//            System.out.println("connection closed");
//
//            System.out.println("Thank you for your responce");
//        }
//        catch (Exception e) {
//            System.out.println(" soory for the responce ...Here some other classes are loaded plese check the problem " + e);
//        }
//
//
//    }
}
