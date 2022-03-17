public class JavaArrayEx2 {
    public static void main(String[] aa) {

        int[] num1 = { 1, 3, 5 };
        int[] num2 = { 11, 31, 51 };

        // Dynamically initializing Size of resultant Array
        int[] allData = new int[num1.length + num2.length];

        for (int i = 0; i < num1.length; i++) {
            allData[i] = num1[i];
        }

        // for (int i = 0; i < num1.length; i++) {
        // System.out.println(allData[i]);
        // }

        for (int i = 0; i < num2.length; i++) {
            allData[num1.length + i] = num2[i];
        }

        for (int i = 0; i < allData.length; i++) {
            System.out.println(allData[i]);
        }

    }

}
