import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("config.json");
            Scanner scanner = new Scanner(file);
            System.out.println("Config loaded");
            scanner.close();
        } catch (Exception e) {
            System.err.println("Failed to load config");
        }
    }
}
