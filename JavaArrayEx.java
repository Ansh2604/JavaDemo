public class JavaArrayEx {
    public static void main(String[] aa) {
        // In Java Language Array is an Object
        // Creating and Initializing an array with size of 2
        int[] num1 = new int[2];

        // Creating and Initializing an array with size of 8 and assiging the values
        int num[] = { 5, 2, 3, 7, 3, 6, 9, 1 };

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("The sum of numbers present in an array are " + sum);
    }
}