import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class JavaCollectionsDemo1 {
    public static void main(String[] aa) {

        ArrayList pName = new ArrayList<>();

        pName.add("Tim");
        pName.add("Tim");

        pName.add("Rim");
        pName.add("Jim");
        pName.add("Sim");
        pName.add("Kim");
        pName.add("Dim");

        System.out.println(pName);

        Iterator itr = pName.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        LinkedList<String> pName1 = new LinkedList<String>();

        pName1.add("Tim");
        pName1.add("Tim");

        pName1.add("Rim");
        pName1.add("Jim");
        pName1.add("Sim");
        pName1.add("Kim");
        pName1.add("Dim");

        System.out.println(pName);

        Iterator itr1 = pName.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        ListIterator itr2 = pName.listIterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("In reverse Order ...");

        while (itr2.hasPrevious()) {
            System.out.println(itr2.previous());
        }

    }
}
