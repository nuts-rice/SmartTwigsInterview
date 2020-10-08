import java.util.Map;

public class Game {
   Player player0;
   Player player1;
   Map PlayerScores;

   public Game(Player player0, Player player1, ){
       this.player0 = player0;
       this.player1 = player1;

       this.PlayerScores.put(player0.getName(), 0);
       this.PlayerScores.put(player1.getName(), 0);
   }
//   public void addPoint(Player player){
//        this.PlayerScores.put(player.getName(), )
//   }

}
