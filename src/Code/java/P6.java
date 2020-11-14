import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(group_maker(scanner));
    }

    public static int group_maker(Scanner scanner){
        String first_str = scanner.nextLine();
        String[] str_splitted = first_str.split(" ");
        int number_of_student = Integer.parseInt(str_splitted[0]);
        int non_working_pairs = Integer.parseInt(str_splitted[1]);
        int[][] student_matrix = new int[number_of_student][number_of_student];
        for (int i = 0; i < non_working_pairs ; i++) {
            String line = scanner.nextLine();
            String[] line_splitted = line.split(" ");
            int student_A = Integer.parseInt(line_splitted[0]) -1;
            int student_B = Integer.parseInt(line_splitted[1]) -1;
            student_matrix[student_A][student_B] = 1;
            student_matrix[student_B][student_A] = 1;
        }
        int count = 0;
        for (int i = 0; i < number_of_student; i++) {
            for (int j = 0; j < number_of_student; j++) {
                if (i>j && student_matrix[i][j]!=1){
                    count++;
                }
                if(i==j){
                    student_matrix[i][j] = -1;
                }
            }
        }
        if(count == 1){
            return 1;
        }
        if(count%2 == 0){
            count = count/2;
            return count;
        }
        else {
            count = (count/2) -1;
            if (count < 0){
                return 0;
            }
            return count;
        }
    }

}
