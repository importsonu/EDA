import java.lang.*;
import java.util.*;
import java.sql.*;
public class Cosine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theta");
        int x = sc.nextInt();
        double cosx = Math.cos(x);
        System.out.println("Cos(x) = "+cosx);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
            System.out.println("Successful connection");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO Cos VALUES("+x+","+cosx+");";
            System.out.println(sql);
            stmt.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        sc.close();
    }
}