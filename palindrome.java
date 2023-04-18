import java.util.*;

class palindrome {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your Number");
        int num = sc.nextInt();

        int rev = 0;

        int temp = num;

        while (num > 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("Reverse number is " + rev);

        if (rev == temp) {

            System.out.println("Its Palindrome");

        } else {
            System.out.println("Its is not Palindrome");
        }

    }
}