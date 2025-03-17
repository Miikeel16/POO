package POO.NICO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion {
    

public class testConexionBasica {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/alumno";
        String user = "alumno";
        String password = "alumno";

        try {
            // Conexión a la base de datos
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}
