package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class pratice {


    public static void main(String[] args)  throws  Exception{

        System.out.println("wellcome to jdbc");

        String url="Jdbc:mysql://localhost:3306/nihal";
        String username="root";
        String password="admin";

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        Connection con= DriverManager.getConnection(url,username,password);
        System.out.println("connection established");

        Statement st= con.createStatement();
        System.out.println("created statment and excuted query");

        ResultSet rs=st.executeQuery("select * from familydeatiles");

        System.out.println("result:-");

        while (rs.next()){
           System.out.println("|"+ "slno:- "+rs.getInt(1) +"  |"+"first_name:- "+rs.getString(2)+"  |"+"last_name:- "+rs.getString(3)+"  |"+"age:- "+rs.getInt(4)+"  |");  // here iam getting output
 //          System.out.println("|"+ "slno:- "+rs.getString(1) +"  |"+"first_name:- "+rs.getString(2)+"  |"+"last_name:- "+rs.getString(3)+"  |"+"age:- "+rs.getString(4)+"  |");  // here iam getting output
 //          System.out.println("|"+ "slno:- "+rs.getInt("snlno") +"  |"+"first_name:- "+rs.getString("firstname")+"  |"+"last_name:- "+rs.getString("lastname")+"  |"+"age:- "+rs.getInt("age")+"  |"); //here iam getting output
  //          System.out.println("|"+ "slno:- "+rs.getString("snlno") +"  |"+"first_name:- "+rs.getString("firstname")+"  |"+"last_name:- "+rs.getString("lastname")+"  |"+"age:- "+rs.getString("age")+"  |"); //here iam getting output
//            System.out.println("|"+ "slno:- "+rs.getInt("snlno") +"  |"+"first_name:- "+rs.getInt("firstname")+"  |"+"last_name:- "+rs.getInt("lastname")+"  |"+"age:- "+rs.getInt("age")+"  |"); // when iam using int but not getting output
        }
        con.close();
        System.out.println("connection closed");

        System.out.println("Thank you for your responce");



    }



//    public static void main(String[] args) {
//        try {
//
//            System.out.println("wellcome to jdbc");
//
//            String url = "jdbc:mysql://localhost:3306/nihal";
//            String username = "root";
//            String password = "admin";
//
//           String query="select * from familydeatiles";
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded");
//
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("connection established");
//
//            Statement st = con.createStatement();
//            System.out.println("created statment and excuted query");
//
//          ResultSet rs = st.executeQuery(query);
//
//
//            System.out.println("result:-");
//
//            while (rs.next()) {
//                System.out.println("|" + "slno:- " + rs.getInt(1) + "  |" + "first_name:- " + rs.getString(2) + "  |" + "last_name:- " + rs.getString(3) + "  |" + "age:- " + rs.getInt(4) + "  |");
//            }
//            con.close();
//            System.out.println("connection closed");
//
//            System.out.println("Thank you for your responce");
//        }
//        catch (Exception e){
//            System.out.println(" soory for the responce ...Here some other classes are loaded plese check the problem ");
//        }
//
//
//
//    }
}
