import java.util.Arrays;

public class Cricket implements Sport {
    private int[] playerIDs = new int[11];

    public Cricket() {
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = i + 1;
        }
        System.out.println("A new cricket team has been formed.");
    }

    @Override
    public void calculateAverageAge(int[] age) {
        double average = Arrays.stream(age).average().orElse(0.0);
        System.out.printf("The average age of the team is %.2f%n", average);
    }

    @Override
    public void retirePlayer(int id) {
        if (id > 0 && id <= playerIDs.length && playerIDs[id - 1] != -1) {
            playerIDs[id - 1] = -1;
            System.out.printf("Player with id %d has retired.%n", id);
        } else {
            System.out.printf("Player with id %d has already retired.%n", id);
        }
    }
}