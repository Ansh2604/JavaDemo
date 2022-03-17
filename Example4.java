import java.util.Scanner;

public class Example4 {
    public static void menu() {
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    public static void main(String[] aa) {

        int choice;
        int num1, num2, result;

        Scanner sin = new Scanner(System.in);

        menu();

        System.out.println("Enter the first number ");
        num1 = sin.nextInt();
        System.out.println("Enter the second number ");
        num2 = sin.nextInt();
        System.out.println("Enter the correct choice ..");
        choice = sin.nextInt();

        if (choice == 1) {
            result = num1 + num2;
            System.out.println(result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println(result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println(result);
        } else if (choice == 4) {
            result = num1 / num2;
            System.out.println(result);
        } else {
            System.out.println("Invalid Choice ...");
        }
    }
}

// Standard Input Device System.in Keyboard
// Standard Output Device System.out Monitor
// Standard Error Device System.err Monitor