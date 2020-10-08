import java.util.Scanner;

public class pingPongGame {
    ////will allow the players to update their points per round and the point management system will
////        also denote the server per round. T he point management system will also announce the winner and
////        update the players position on the leader board
//
////The leaderboard should be visible at some point in the flow.
////        At any point the players should be able to terminate the game with no winner selected.
//
    public static void main(String[] args) {

        Player player0 = new Player();
        Player player1 = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: Please register a new name or choose a previous name: ");
        String playerName0 = sc.nextLine();
        player0.setName(playerName0);

        System.out.println("Player 2: Please register a new name or choose a previous name: ");
        String playerName1 = sc.nextLine();
        player1.setName(playerName1);
        Game pingPongGame = new Game(player0, player1, );

    }
}
