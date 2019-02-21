package zadanie_2;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        WorkClass workClass = new WorkClass();
        List<Integer> positiveNumbers = (List<Integer>) workClass.readDate("Liczby.txt");
        TreeSet<Integer>  occurrences = new TreeSet<>(positiveNumbers);
        workClass.printList(occurrences);
    }
}
