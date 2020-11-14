import java.util.Arrays;
import java.util.Scanner;

class Main{
    public int = 500;
    public Scanner scanner = new Scanner(System.in);

    public static int guess(int previous_number){
        System.out.printf(previous_number);
        String answer = scanner.nextline();
        switch (answer){
            case "That is correct!" :
                return previous_number;
            case "Your guess is too high.":
                guess(previous_number-1);
            case "“Your guess is too low.":
                guess(previous_number+1);
        }
    }
}