package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String typeAnimal = scanner.nextLine();
            if (typeAnimal.equals("Beast!")) {
                break;
            }
            String[] animalInfo = scanner.nextLine().split("\\s+");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];
            Animal animal;

            try {
                switch (typeAnimal) {
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    default:
                        animal = new Tomcat(name, age);
                        break;
                }
                System.out.println(animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
