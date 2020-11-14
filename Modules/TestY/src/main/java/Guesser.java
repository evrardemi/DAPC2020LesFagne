import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
            String answer = scanner.nextLine();
            if (answer.equals("That is correct!"))
                break;



        }
    }
}
