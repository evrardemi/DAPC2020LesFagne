import java.util.Scanner;
import java.util.Arrays;

public class P7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(verifyer(scanner));
    }
    public static String verifyer(Scanner scanner){
        int number_of_contestant = scanner.nextInt();
        String[] predicted = new String[number_of_contestant];
        String[] jury = new String[number_of_contestant];
        scanner.nextLine();
        for (int i = 0; i < number_of_contestant; i++) {
            predicted[i] = scanner.nextLine();
        }
        for (int i = 0; i < number_of_contestant ; i++) {
            jury[i] = scanner.nextLine();
        }
        if(Arrays.equals(predicted,jury)){
            return "suspicious";
        }
        else {
            return jury[0];
        }
    }
}
