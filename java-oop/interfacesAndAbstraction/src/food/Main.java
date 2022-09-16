package food;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Buyer> buyers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            Buyer buyer = tokens.length > 3 ?
                    new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]) :
                    new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            buyers.add(buyer);
        }

        String input = scanner.nextLine();

        int totalAmountFood = 0;
        while (!input.equals("End")) {

            for (Buyer buyer : buyers) {
                if (buyer.getName().equals(input)) {
                    buyer.buyFood();
                    totalAmountFood += buyer.getFood();
                }
            }
            input = scanner.nextLine();
        }

        System.out.println(totalAmountFood);
    }
}
