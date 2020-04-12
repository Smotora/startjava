public class Player {
	private int playerNumber;
	private String name;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    
    public Player(String name) {
        this.name = name;
     }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}