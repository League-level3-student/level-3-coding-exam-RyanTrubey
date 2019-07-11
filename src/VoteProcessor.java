import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		String winner = "";
		int vote1 = 0;
		int vote2 = 0;
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("pope francis")) {
				vote1+=1;
			} else {
				vote2+=1;
			}
		}
		if(vote1 > vote2) {
			winner = "pope francis";
		} else if(vote2 > vote1) {
			winner = "edward snowden";
		} else {
			winner = "TIE";
		}
		
		return(winner);
	}
}
