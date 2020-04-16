public class Player {
	
	private String name;
	private int playerNum;

	public Player(String x) {
		name = x;
	}

	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}

	public int getPlayerNum() {
		return playerNum;
	}

	public String getName() {
		return name;
	}
}