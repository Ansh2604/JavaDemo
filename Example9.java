import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the employee");
        String name = sc.next();

        System.out.println("Enter base pay of the employee");
        double basePay = sc.nextDouble();

        System.out.println("Enter number of hours worked by the employee");
        int hoursWorked = sc.nextInt();

        Example9 calculateTotalPay = new Example9();
        double salary = calculateTotalPay.calculateHourlyWages(basePay, hoursWorked);

        System.out.println("Name :: " + name);
        System.out.println("Base pay :: " + basePay + "$");
        System.out.println("Hours worked :: " + hoursWorked);
        System.out.println();
        System.out.println("Salary of employee :: " + salary + "$");

    }

    // Function to calculate salary of employee by analysing base pay and hours
    // worked by employee
    public double calculateHourlyWages(double basePay, int hoursWorked) {
        if (basePay <= 0 || hoursWorked <= 0) {
            return 0;
        }

        double salary = 0;

        boolean overtime = calculateOnHourlyBasis(hoursWorked);
        boolean basePayMoreThanMinimumWage = checkBasePay(basePay);

        if (overtime && basePayMoreThanMinimumWage) {
            int extraHours = hoursWorked - 40;
            double overTimePay = basePay * 2 * extraHours;
            salary = (basePay * 40) + overTimePay;
        } else if (basePayMoreThanMinimumWage) {
            salary = basePay * hoursWorked;
        } else {
            salary = 0;
        }
        return salary;
    }

    // Function to estimate if an employee has worked more than 40 hrs to get
    // overtime pay
    public boolean calculateOnHourlyBasis(int hoursWorked) {
        boolean overtime = false;

        if (hoursWorked > 40 && hoursWorked < 60) {
            overtime = true;
        }
        return overtime;
    }

    // Function to check if base pay is more than minimum wage
    public boolean checkBasePay(double basePay) {
        boolean basePayMoreThanMinimumWage = true;

        if (basePay < 12) {
            basePayMoreThanMinimumWage = false;
        }

        return basePayMoreThanMinimumWage;
    }
}
