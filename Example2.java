
// Program to calculate 2 numbers ....

import java.util.Scanner;

public class Example2 {
    public static void main(String[] aa) {
        Scanner sin = new Scanner(System.in);
        int num1, num2, result;

        System.out.println("Enter the Number ..");
        num1 = sin.nextInt();

        System.out.println("Enter Second Number ..");
        num2 = sin.nextInt();

        result = num1 + num2;
        System.out.println("The Result Is :" + result);

        result = num1 - num2;
        System.out.println("The Result Is :" + result);

        result = num1 * num2;
        System.out.println("The Result Is :" + result);

        result = num1 / num2;
        System.out.println("The Result Is :" + result);
    }
}
