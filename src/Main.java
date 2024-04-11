import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Heart", "Cherry", "Coin", "Melon", "Jocker"};

        Random random = new Random();
        System.out.println("The combination is :");
        for (int i = 0; i < array.length; i++) {
            int combination = random.nextInt(4);
            System.out.print(array[combination]+ " ");
        }
    }
}