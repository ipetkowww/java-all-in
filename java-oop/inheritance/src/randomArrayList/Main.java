package randomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> randomList = new RandomArrayList<>();

        for (int i = 1; i <= 20; i++) {
            randomList.add(i);
        }

        System.out.println(randomList.getRandomElement());
        System.out.println(randomList.getRandomElement());
        System.out.println(randomList.getRandomElement());
    }
}
