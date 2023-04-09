package dev.addaboy;


import java.sql.*;

public class Application {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:postgresql://localhost:5432:/postgres";

		try (Connection conn = DriverManager.getConnection(jdbcURL, "postgres", "password")) {
			if(!conn.isValid(0)) {
				System.out.println("Unable to connect to database");
				System.exit(0);
			}

			PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM run");
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				String title = rs.getString("title");
				int miles = rs.getInt("miles");
				System.out.println(title + ": " + miles);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
