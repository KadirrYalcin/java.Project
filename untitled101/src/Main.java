import javax.lang.model.type.ArrayType;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sahipKullanici = new ArrayList<>();
        ArrayList<String> sahipParola = new ArrayList<>();
        ArrayList<String> veterinerKullanici=new ArrayList<>();
        ArrayList<String> veterinerParola=new ArrayList<>();
        veterinerKullanici.add("admin");
        veterinerParola.add("123456");
        VeterinerAuthentication veterinerAuthentication=new VeterinerAuthentication(veterinerKullanici,veterinerParola);
        OwnerAuthentication ownerAuthentication = new OwnerAuthentication();
        Scanner input = new Scanner(System.in);
        int order = 0;
        Boolean oturumDurumu = false;

        WelcomeScreenFonksiyon.welcomeScreen(veterinerAuthentication, ownerAuthentication, input);

    }
}
