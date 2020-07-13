
package kapil;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
public class Collegedatabase {
    public static void main(String[] args) {
        // TODO code application logic here
 String url="jdbc:oracle:thin:@localhost:1521:XE";
 String un="manisha";
 String ps="oswald";
 try{
     String qu="select *from student";
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection(url,un,ps);
     Statement st=con.createStatement();
      JOptionPane.showMessageDialog(null,"connection successfull");
     ResultSet rs=st.executeQuery(qu);
     while(rs.next())
     {
        System.out.print(rs.getString(1));
     }
     con.close();
     
 }
 catch(Exception e)
 {
     System.out.println("connection failed");
 }
   
    }
}