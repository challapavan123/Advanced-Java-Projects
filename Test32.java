import java.sql.*;
public class Test32 {

	public static void main(String[] args) throws Exception {
		//step1 loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 getting the connection
		String address="jdbc:mysql://localhost:3306/4cse2userdb";
		Connection connection=
				DriverManager.getConnection(address,"root","root");
		//step3 getting the prompt
		Statement st=connection.createStatement();
		String insertquery="insert into user values('1001','tiger','pavan','pavan@gmail.com')";
		//step4 passing the query to prompt
		int n=st.executeUpdate(insertquery);
		//step5
		System.out.println(n +" inserted");
	}


	}


