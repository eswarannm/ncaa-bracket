public class Tournament {

	public Team[] round1(Region region){
		Team[] teams = region.getTeams();
		Team[] winners = new Team[8];
			for(int i = 0; i < 8; i++){
				Team team1 = teams[i];
				Team team2 = teams[teams.length - 1 - i];
				boolean win = region.game(team1, team2);
				if (win) {
					winners[i] = team1;
					System.out.println(winners[i].getName());
				} else {
					winners[i] = team2;
					System.out.println(winners[i].getName());
				}
			}
			System.out.println("---");
			return winners;
		}

	public Team[] round2(Team[] winnersx, Region region){
		Team[] teams = winnersx;
		Team[] winners = new Team[4];
		for(int i = 0; i < 4; i++){
			Team team1 = teams[i];
			Team team2 = teams[teams.length - 1 - i];
			boolean win = region.game(team1, team2);
			if (win) {
				winners[i] = team1;
				System.out.println(winners[i].getName());
			} else {
				winners[i] = team2;
				System.out.println(winners[i].getName());
			}
		}
    System.out.println("---");
    return winners;
    }
 

	public Team[] round3(Team[] winnersx, Region region){
		Team[] teams = winnersx;
		Team[] winners = new Team[2];
		for(int i = 0; i < 2; i++){
			Team team1 = teams[i];
			Team team2 = teams[teams.length - 1 - i];
			boolean win = region.game(team1, team2);
			if (win) {
				winners[i] = team1;
				System.out.println(winners[i].getName());
			} else {
				winners[i] = team2;
				System.out.println(winners[i].getName());
			}
		}
	System.out.println("---");
    return winners;
    }


	public Team round4(Team[] winnersx, Region region){
		Team[] teams = winnersx;
		Team winner = teams[0];
		Team team1 = teams[0];
		Team team2 = teams[1];
		boolean win = region.game(team1, team2);
		if (win) {
			winner = team1;
		} else {
			winner = team2;
		}
    return winner;
    }

	public Team[] round5(Team[] lastFour, FinalFour finalFour){
		Team[] teams = lastFour;
		Team[] championship = new Team[2];
		Team team1 = teams[0];
		Team team2 = teams[1];
		Team team3 = teams[2];
		Team team4 = teams[3];
		boolean win = finalFour.game(team1, team2);
		if (win) {
			championship[0] = team1;
		} else {
			championship[0] = team2;
		}
		if (win) {
			championship[1] = team3;
		} else {
			championship[1] = team4;
		}
    return championship;
    }

 }