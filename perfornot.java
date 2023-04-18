import java.util.*;

public class perfornot {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter to find Perfect or not ");

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {

                sum = sum + i;
            }

        }

        if (sum == num) {

            System.out.println("its is Perfect number");
        } else {
            System.out.println("Its is Not Perfect number");
        }
    }

}
