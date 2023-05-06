import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Gimme GB!");
            Scanner s = new Scanner(System.in);
            double gb = s.nextDouble();
            System.out.println("Gimme MB/second!");
            double mb = s.nextDouble();
            double response = ((gb * 1024) / mb) / 3600;
            System.out.println("remaining time: " + response + " hours");
        }
    }
}
