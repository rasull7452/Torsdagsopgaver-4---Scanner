// 1.b
import java.util.ArrayList;

public class Team{

	// 1.c
	private String teamName;

	// 1.d
	private int rank;

	// 1.e
	private ArrayList<String> members = new ArrayList<String>();

		// 1.f
		public Team(String teamName){

			this.teamName = teamName;

		}

		// 1.h
		public void setRank(int newRank){

			this.rank = newRank;


		}

		// 1.j
		public String toString(){
			String teamInfo = "Hold: " + this.teamName + " | Rang: " + this.rank;
			String teamMembers = "\nMembers: \n";

				// 1.m
				for(String player : members){
					teamMembers += player + " \n";
				}

			return teamInfo + " " + teamMembers;
		}

		// 1.l
		public void addPlayer(String player){

			this.members.add(player);

		}
}