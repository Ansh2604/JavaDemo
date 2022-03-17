import java.util.HashSet;
import java.util.TreeSet;

public class JavaSetEx {

    public static void main(String[] aa) {

        // HashSet pName = new HashSet<>();

        // pName.add("Tim");
        // pName.add("Tim");

        // pName.add("Rim");
        // pName.add("Jim");
        // pName.add("Sim");
        // pName.add("Kim");
        // pName.add("Dim");

        // System.out.println(pName);

        // for (Object s : pName) {
        // System.out.println(s);
        // }

        TreeSet pName = new TreeSet<>();

        pName.add("Tim");
        pName.add("Tim");

        pName.add("Rim");
        pName.add("Jim");
        pName.add("Sim");
        pName.add("Kim");
        pName.add("Dim");

        System.out.println(pName);

        for (Object s : pName) {
            System.out.println(s);
        }
    }
}
