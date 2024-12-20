import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cricket cricket = new Cricket();
        Football football = new Football();

        int[] cricketAges = new int[11];
        int[] footballAges = new int[11];

        for (int i = 0; i < cricketAges.length; i++) {
            cricketAges[i] = sc.nextInt();
        }
        for (int i = 0; i < footballAges.length; i++) {
            footballAges[i] = sc.nextInt();
        }
        cricket.calculateAverageAge(cricketAges);
        football.calculateAverageAge(footballAges);

        int operations = sc.nextInt();
        while (operations-- > 0) {
            String command = sc.next();
            int id = sc.nextInt();

            if ("retirePlayer".equals(command)) {
                cricket.retirePlayer(id);
            } else if ("transferPlayer".equals(command)) {
                int fee = sc.nextInt();
                football.playerTransfer(fee, id);
            }
        }
    }
}