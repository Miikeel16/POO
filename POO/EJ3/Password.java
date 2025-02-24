package POO.EJ3;
import java.util.Random;

public class Password {
    int longitud = 8;
    String contraseña;

    /////////CONTRUCTORES
    
    public Password(int plongitud){
        this.longitud=plongitud;
        this.contraseña=generarPassword(plongitud);
    }

    public String generarPassword(int plongitud){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String contraseña = "";

        for (int i = 0; i < plongitud; i++) {
            contraseña += caracteres.charAt(random.nextInt(caracteres.length()));
        }

        return contraseña;
    }
}


