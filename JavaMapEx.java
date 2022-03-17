import java.util.HashMap;

public class JavaMapEx {

    public static void main(String[] aa) {
        HashMap<Integer, String> pName = new HashMap<Integer, String>();

        pName.put(1, "Tim");
        pName.put(2, "Rim");
        pName.put(3, "Jim");
        pName.put(4, "Sim");
        pName.put(5, "Kim");
        pName.put(6, "Dim");

        System.out.println(pName);

        // for (Object s : pName) {
        // System.out.println(s);
        // }

    }
}
