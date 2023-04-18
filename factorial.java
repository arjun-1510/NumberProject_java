import java.util.Scanner;

public class factorial {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter To find  Factorila Number");

        int num = sc.nextInt();

        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial number is" + fact);
    }

}
