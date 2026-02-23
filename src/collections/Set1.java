package collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        Set<String> set11=new HashSet();
        set11.add("Upasana");
        set11.add("David");
        set11.add("Virat");
        set11.add("Upasana");
        set11.add("Dhoni");
        set11.add("Sharma");
        System.out.println(set11);

        Set<String> set2=new TreeSet();
        set2.add("Upasana");
        set2.add("David");
        set2.add("Virat");
        set2.add("Upasana");
        set2.add("Dhoni");
        set2.add("Sharma");
        System.out.println(set2);


    }
}
