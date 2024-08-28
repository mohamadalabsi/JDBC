import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {

        String sql = "select emp_id from employee";
        String url = "jdbc:postgresql://localhost:5432/test";
        Demo demo = new Demo();



        Connection con = DriverManager.getConnection(url,demo.username, demo.password);
        Statement stmt = con.createStatement();
        ResultSet rs =  stmt.executeQuery(sql);

        while(rs.next()){
            int emp_id = rs.getInt("emp_id");
            System.out.println(emp_id);
        }
        rs.close();


    }
}