import java.util.List;
public class LeaderBoard {
     List <Player> playerList;
     public LeaderBoard() {
      playerList = null;
     }

    public void printLeaderBoard(){
         int i = 0;
        for(i = 0; i < playerList.size(); i++){
            System.out.println("Player: " + playerList.get(i).getName());
            System.out.println("Number of wins: "+ playerList.get(i).getLeaderBoardPoints());
        }
    }
    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
