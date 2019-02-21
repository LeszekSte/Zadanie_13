package zadanie_1;

import java.util.*;

public class TestClass_1 {

    public static void main(String[] args) {


        List<Double> positiveNumbers = readDate();
        backPrinting(positiveNumbers);
        sumList(positiveNumbers);
        minMaxNumbers(positiveNumbers);

    }

    private static void minMaxNumbers(List<Double> positiveNumbers) {
        TreeSet<Double> minMax = new TreeSet<>();
        for (Double positiveNumber : positiveNumbers) {
            minMax.add(positiveNumber);
        }
        System.out.println("Minimalna  liczba - "+ minMax.first());
        System.out.println("Maksymalna  liczba - "+ minMax.last());

    }

    private static void sumList(List<Double> positiveNumbers) {
        double sum = 0;
        for (Double positiveNumber : positiveNumbers) {
            System.out.print(positiveNumber + "+");
            sum += positiveNumber;
        }
        System.out.println(" = " + sum);
    }

    private static void backPrinting(List<Double> positiveNumbers) {
        for (int i = positiveNumbers.size() - 1; i >= 0; i--) {
            System.out.print(positiveNumbers.get(i) + ", ");
        }
        System.out.println();
    }


    private static List<Double> readDate() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        System.out.println("Podaj cyfry dodatnie, ujemna wartość kończy zabawę");

        double nr = scanner.nextDouble();
        while (nr >= 0) {
            numbers.add(nr);
            System.out.println("Następna ");
            try {
                nr = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("To nie jest liczba");
            } finally {
                scanner.nextLine();
            }
        }
        System.out.println("koniec");
        return numbers;
    }
}
