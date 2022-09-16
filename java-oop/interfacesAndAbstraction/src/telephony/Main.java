package telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phoneNumbers = new ArrayList<>(List.of(scanner.nextLine().split("\\s+")));
        List<String> urls = new ArrayList<>(List.of(scanner.nextLine().split("\\s+")));

        Smartphone smartphone = new Smartphone(phoneNumbers, urls);

        smartphone.callAll();
        smartphone.browseAll();
    }
}
