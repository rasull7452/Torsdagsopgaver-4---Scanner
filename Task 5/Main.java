import java.util.ArrayList;

public class Main{

	public static void main(String[] args){

		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu g = new GameMenu(actions);

		// 5.d
		String playerChoice = g.promptUser();

	}
	// 5.e
	public static void doAction(int action){

	}

}
