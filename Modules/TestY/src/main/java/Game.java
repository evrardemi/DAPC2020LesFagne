import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angle = scanner.nextDouble();

        System.out.println(Math.tan(Math.toRadians(angle))*10);
    }
}
