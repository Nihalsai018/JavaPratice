package jdbc;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Retrive  {
    public static void main(String[] args) throws SQLException {
        try {

            System.out.println("wellcome to jdbc");

            String url = "jdbc:mysql://localhost:3306/nihal";
            String username = "root";
            String password = "root";


         //  String query="select firstname from familydeatiles where age=57 ";
           String query="select * from familydeatiles where snlno=1" ;

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");

            Statement st = con.createStatement();

            System.out.println("created statment and excuted query");

          ResultSet rs = st.executeQuery(query);
          rs.next();

            System.out.println(rs.getInt("age")+"\n"+rs.getString("firstname"));
           // System.out.println(rs.getString("age")+"\n"+rs.getString("firstname"));


//            while(rs.next()) {
//        //   System.out.println(rs.getString("snlno"));
//          //    System.out.println(rs.getInt(1));
//              System.out.println(rs.getInt("age"));
//               System.out.println(rs.getString("age"));
//
//            }



//           System.out.println(rs.getInt(4));
            con.close();


            System.out.println("connection closed");

            System.out.println("Thank you for your responce");
        }
        catch (Exception e){
            System.out.println(" soory for the responce ...Here some other classes are loaded plese check the problem "+e);
        }
    }

}
