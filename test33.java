import java.sql.*;
public class test33 {

	public static void main(String[] args) throws Exception{
		String id="1007";
		String pwd="abcd";
		String newpwd="Prabha";
		//step1 : loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2: getting the connection
		String address="jdbc:mysql://localhost:3306/4cse2userdb";
		Connection connection=DriverManager.getConnection(address,"root","root");
		Statement stmt = connection.createStatement();  
        // Updating database
        String String;
		String q1 = "UPDATE user set pwd = '" + newpwd +
                "' WHERE id = '" +id+ "' AND pwd = '" + pwd + "'";
        //String q1=("Update user set pwd='abcd' where fullname='pavan'");

      //step4 passing the query to prompt
      		int n=stmt.executeUpdate(q1);
      		//step5 get the response
      	    System.out.println(n+" Updated");

	}

}