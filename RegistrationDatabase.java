import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationDatabase {

    public static boolean registerStudent(
            String username, String password) {

        String sql = "INSERT INTO students " +
                     "(username, password_hash) VALUES (?, ?)";

        try {
            String hashedPassword =
                PasswordUtil.hashPassword(password);

            Connection con = DatabaseConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, hashedPassword);

            int result = ps.executeUpdate();

            ps.close();
            con.close();

            return result > 0;

        } catch (SQLException e) {
            System.out.println("Registration database error: "
                    + e.getMessage());
            return false;

        } catch (Exception e) {
            System.out.println("Registration error: "
                    + e.getMessage());
            return false;
        }
    }
}