import java.util.Scanner;

// This class contains basic Java logic programs
public class BasicPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== 1. Taking Input =====
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // ===== 2. Factorial =====
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);

        // ===== 3. Prime Number Check =====
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        // ===== 4. Reverse a Number =====
        int temp = num;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("Reversed number: " + reverse);

        // ===== 5. Palindrome Check =====
        if (num == reverse) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }

        // ===== 6. Sum of Digits =====
        int sum = 0;
        temp = num;

        while (temp != 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        System.out.println("Sum of digits: " + sum);

        // ===== 7. Even or Odd =====
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}