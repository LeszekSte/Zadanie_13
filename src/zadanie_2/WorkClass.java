package zadanie_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WorkClass {

    List<Integer> numbers = new ArrayList<>();

    public List<Integer> readDate(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));

        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("koniec");
        return numbers;
    }

    public void printList(TreeSet<Integer> occurrences) {
        Iterator<Integer> iterator = occurrences.iterator();
        List<Integer> listaDoDruku = new ArrayList<>();
        System.out.println("Ilość unikalnych liczb " + occurrences.size());

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            listaDoDruku.add(next);
        }
        for (int i = 0; i < listaDoDruku.size(); i++) {
            System.out.println(listaDoDruku.get(i) + " - liczba wystąpień " + countnNumers(numbers, listaDoDruku.get(i)));
        }
    }

    private int countnNumers(List<Integer> list, Integer next) {
        int sum = 0;
        for (Integer integer : list) {
            if (next.equals(integer)) {
                sum++;
            }
        }
        return sum;
    }
}
