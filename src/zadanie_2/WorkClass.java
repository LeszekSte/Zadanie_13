package zadanie_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class WorkClass {


    public List<Integer> readDate(String file) throws FileNotFoundException {

            Scanner scanner = new Scanner(new File(file));
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()){
                numbers.add(scanner.nextInt());
            }
            System.out.println("koniec");
            return numbers;
        }




    public void printList(TreeSet<Integer> occurrences) {
        System.out.println("Liczbu unikalne" + occurrences.size());

    }
}
