public class Player {
    String name;
    int LeaderBoardPoints;

    public Player() {
        this.name = null;
        this.LeaderBoardPoints = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeaderBoardPoints() {
        return LeaderBoardPoints;
    }

    public void setLeaderBoardPoints(int leaderBoardPoints) {
        LeaderBoardPoints = leaderBoardPoints;
    }
}
