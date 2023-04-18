import java.util.Scanner;

public class primeornot {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter to find Prime or not ");

        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Its is prime number");
        } else {
            System.out.println("Its is not Prime number");
        }
    }
}
