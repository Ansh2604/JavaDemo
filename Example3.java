import java.util.Scanner;

public class Example3 {

    int num1, num2, result;

    public void calculate() {
        Scanner sin = new Scanner(System.in);

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

    public static void main(String[] aa) {
        Example3 eobj = new Example3();
        eobj.calculate();

        Example3 eobj1 = new Example3();
        eobj.calculate();

        Example3 eobj2 = new Example3();
        eobj.calculate();

        Example3 eobj3 = new Example3();
        eobj.calculate();
        // calculate();
    }
}

// Every non-static members are called as instance member
// whose existance is dependent upon the calss instance
// Static members are independent of class instance