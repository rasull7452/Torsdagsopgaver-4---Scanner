import java.util.ArrayList;
import java.util.Scanner;

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

		// 5.g
		int playerDecision = Integer.parseInt(playerChoice);

		doAction(playerDecision);

	}
	// 5.e
	public static void doAction(int action){

		// 5.f
		if(action < 4 && action > 0){
		switch(action){
			case 1:
				System.out.println(action + ": Starting the game now");
				break;
			case 2:
				System.out.println(action + ": Fetching previously saved game data");
				break;
			case 3:
				System.out.println(action + ": Game paused");
				break;
			case 4:
				System.out.println(action + ": Ending game");
				break;
			} 
		} 
		else {

			System.out.println("You have picked an invalid option");

		}
	}
}
