import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] line_splited =  line.split(" ");
        int h = Integer.parseInt(line_splited[0]);
        int s = Integer.parseInt(line_splited[1]);
        double p = 0.5*h*(h+1)-s;
        double people_remaining =  p;
        int possibility = 0;
        int first_layer_possibility = C(s,h);
        possibility+=first_layer_possibility;
        people_remaining+= (s-h);
        for (int i = h-1; i > 0; i--) {
            possibility*=C((int)people_remaining,i);
            people_remaining-=i;
            System.out.println(people_remaining);
        }
        System.out.println(possibility);
    }
    public static int C(int n, int k){
        int c =  fact(n)/(fact(k)*fact(n-k));
        return c;
    }
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
