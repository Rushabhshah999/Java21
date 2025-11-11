import java.util.HashSet;
import java.util.LinkedHashSet;

public class SequencedSet {

    public static void main(String[] args) {

        // gurantees insertion order SequencedSet but Set does not
        java.util.Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");



        System.out.println(set);

        java.util.SequencedSet<String> set1 = new LinkedHashSet<String>(); //  guaranteed insertion order
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
        set1.add("5");

        System.out.println(set1);

    }



}
