import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BancoDeDados {

	public static void main(String[] args) throws ClassNotFoundException, 
												  SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.33:3306/javathin", 
				"javathin", "javathin");
		
		String sql = "insert into funcionario (nome) "
				+ "values ( ? )";
		
		PreparedStatement pst = 
				conn.prepareStatement(sql);
		
		pst.setString(1, "Diego");
		
		pst.execute();
		pst.close();
		
		PreparedStatement select = 
				conn.prepareStatement("select * from funcionario");
		
		ResultSet rs = select.executeQuery();
		
		while (rs.next()) {
			System.out.println("ID: " + rs.getInt("id") +
					" - Nome: " + rs.getString("nome"));
		}
		
		rs.close();
		select.close();
		conn.close();
		
	}

}






