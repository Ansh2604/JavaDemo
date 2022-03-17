import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice = scanner.nextInt();

        Example8 areaCalculator = new Example8();
        areaCalculator.calculateAreaOfFence(choice);

    }

    // Function to calculate area of fence by calling respective methods according
    // to user's choice
    public void calculateAreaOfFence(int choice) {

        Scanner scanner = new Scanner(System.in);

        if (choice == 1) {
            System.out.println("Enter side of square");

            double side = scanner.nextInt();

            // Call method and display area of square
            System.out.println("Area of square fence for chickens is " + calculateAreaOfSquare(side));

        } else if (choice == 2) {
            System.out.println("Enter radius of circle");

            double radius = scanner.nextInt();
            // Call method and display area of circle
            System.out.println("Area of circular fence for ducks is " + calculateAreaOfCircle(radius));

        } else if (choice == 3) {
            System.out.println("Enter length of rectangle");
            double length = scanner.nextInt();

            System.out.println("Enter breadth of rectangle");
            double breadth = scanner.nextInt();
            // Call method and display area of rectangle
            System.out.println("Area of rectangular fence for cows is " + calculateAreaOfRectangle(length, breadth));

        } else {
            System.out.println("Please enter valid choice!");
        }
    }

    // public int add(int num1, int num2) {
    // // int sum = num1+num2;
    // // return sum;

    // return num1 + num2;

    // }

    // Function to calculate area of square
    public double calculateAreaOfSquare(double side) {
        return side * side;
    }

    // Function to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }

    // Function to calculate area of rectangle
    public double calculateAreaOfRectangle(double length, double breadth) {
        return length * breadth;
    }
}