import java.util.Arrays;
import java.util.Scanner;

class guesser{
    public static int guess(int previous_number, Scanenr scanner){
        System.out.printf(previous_number);
        String answer = scanner.nextline();
        switch (answer){
            case "That is correct!" :
                return previous_number;
            case "Your guess is too high.":
                guess(previous_number-1, scanner);
            case "“Your guess is too low.":
                guess(previous_number+1, scanner);
        }
    }

    public static void main(String[] args) {
        public int number= 500;
        Scanner scanner = new Scanner(System.in);
        guess(number, scanner);
    }
}