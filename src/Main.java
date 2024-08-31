import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {

//        String sql = "select first_name from employee";
        String sql = "select price from car";
        String url = "jdbc:postgresql://localhost:5432/people";
        Demo demo = new Demo();



        Connection con = DriverManager.getConnection(url,demo.username, demo.password);
        Statement stmt = con.createStatement();
        ResultSet rs =  stmt.executeQuery(sql);

        while(rs.next()){
            String price = rs.getString("price");
            System.out.println(price);
        }
        rs.close();






    }
}