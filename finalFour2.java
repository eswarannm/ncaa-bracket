import java.util.Random;

class FinalFour {

	private Team[] finalFourTeams = new Team[4];

	public FinalFour(Team[] finalFourTeams) {
		this.finalFourTeams = teams;
	}

	public Team[] getTeams() {
		return regionTeams;
	}

	public boolean game(Team team1, Team team2){
        double team1Power = team1.getPower();
        double team2Power = team2.getPower();
 		
 		double somemath = -1.0 * (team1Power - team2Power) * 30.464 / 400.0;
		double odds_a = 1.0 / (1.0 + Math.pow(10, somemath));
        
        Random random = new Random();
		double n = (random.nextInt(1000000) + 0) / 1000000.0;

		if (n <= odds_a) {
			return true;
		}

		return false;
  
    }

}

	