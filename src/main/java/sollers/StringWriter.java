package sollers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StringWriter {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>();
        Random random = new Random();
        System.out.println("Podaj pierwszą liczbę:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = scanner.nextInt();
        int sum = a + b;
        int aCounter = 0;

        if (a / b > 2) {
            System.out.println("Zbyt mała liczna b w stoskunku " +
                    "do liczby a, by utworzyć tablicę wg zadanego wzoru");
            System.exit(-1);
        }
        for (int i = 0; i < sum ; i++) {
            if (aCounter < 2 && a != 0) {
                list.add('a');
                aCounter++;
                a--;
            } else {
                list.add((char)(random.nextInt('z' - 'a') + 'a'));
                aCounter = 0;
            }
        }
        System.out.println(list);
    }
}
