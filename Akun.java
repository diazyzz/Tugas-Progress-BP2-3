import java.util.ArrayList;
import java.util.Scanner;

public class Akun {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<String> usernameUser = new ArrayList<>();
    ArrayList<String> passwordUser = new ArrayList<>();

    public void buatAkun() {
        System.out.println("LOGIN");
        System.out.println("Masukkan username : ");
        String usernameBuat = scanner.next();
        System.out.println("Masukkan password : ");
        String passwordBuat = scanner.next();
        usernameUser.add(usernameBuat);
        passwordUser.add(passwordBuat);
    }
}
