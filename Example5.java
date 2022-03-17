import java.util.Scanner;

public class Example5 {

    public static void menu() {
        System.out.println("+. Addition");
        System.out.println("-. Substraction");
        System.out.println("*. Multiplication");
        System.out.println("/. Division");
    }

    public static void main(String[] aa) {

        String choice;
        int num1, num2, result;

        Scanner sin = new Scanner(System.in);

        menu();

        System.out.println("Enter the first number ");
        num1 = sin.nextInt();
        System.out.println("Enter the second number ");
        num2 = sin.nextInt();
        System.out.println("Enter the correct choice ..");
        choice = sin.next();

        if (choice.equals("+")) {
            result = num1 + num2;
            System.out.println(result);
        } else if (choice.equals("-")) {
            result = num1 - num2;
            System.out.println(result);
        } else if (choice.equals("*")) {
            result = num1 * num2;
            System.out.println(result);
        } else if (choice.equals("/")) {
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
