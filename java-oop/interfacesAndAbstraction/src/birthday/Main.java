package birthday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Birthable> birthableList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            Birthable birthable = tokens[0].equals("Citizen") ?
                    new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]) :
                    new Pet(tokens[1], tokens[2]);

            birthableList.add(birthable);

            input = scanner.nextLine();
        }
        String birthYear = scanner.nextLine();


        birthableList.stream()
                .map(Birthable::getBirthDate)
                .filter(e -> e.endsWith(birthYear))
                .forEach(System.out::println);
    }
}
