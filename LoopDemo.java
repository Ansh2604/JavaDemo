public class LoopDemo {
    public static void main(String[] aa) {
        String[] empName = { "Tim", "Rim", "Jim" };

        for (String i : empName) {
            System.out.println(i);
        }

        for (int i = 0; i < empName.length; i++) {
            System.out.println(empName[i]);
        }
    }
}
