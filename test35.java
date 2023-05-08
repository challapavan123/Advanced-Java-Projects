import java.sql.*;
import java.util.Scanner;
public class test35 {

	public static void main(String[] args) throws Exception {
		//step1 loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 getting the connection
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/4cse2userdb","root","root");
		//step3 getting the prompt
		Statement st=c.createStatement();
		ResultSet res=st.executeQuery("select * from user");
				while(res.next()) {
				System.out.print(res.getString(1)+"\t");
				System.out.print(res.getString(1)+"\t");
				System.out.print(res.getString(1)+"\t");
				System.out.print(res.getString(1)+"\t");
				System.out.print(res.getString(1)+"\t");
				System.out.println();
				}
	}
}

