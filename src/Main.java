import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a prime number");
        } else {
            int countDivNum = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    countDivNum++;
                }
            }
            if (countDivNum == 2) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}