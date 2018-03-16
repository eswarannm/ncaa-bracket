import java.util.Random;

class Region {

	String[][] region_teams = new String[16][3];
	private int start;
	private int end;


	public Region(String[][] teams, int start, int end) {
		this.start = start;
		this.end = end;
		int count = 0;
		for (int i=0; i < teams.length; i++) {
			if (i >= start && i <= end) {
				region_teams[count][0] = teams[i][0];
				region_teams[count][1] = teams[i][1];
				region_teams[count][2] = teams[i][2];
				count++;
			}
		}


	}

	public String[][] round() {
		String[][] round1 = new String[8][3];
		String[][] round2 = new String[4][3];
		String[][] round3 = new String[2][3];
		String[][] round4 = new String[1][3];

		round1 = roundLoop(15, round1);
		round2 = roundLoop(7, round2);
		round3 = roundLoop(3, round3);
		round4 = roundLoop(1, round4);

		return round4;

	}

	public String[][] roundLoop(int teams, String[][] round) {
		for (int a = 0, b = teams, i = 0; b > a; a++, b--, i++) {
			double team1power = Double.parseDouble(region_teams[a][1]);
			double team2power = Double.parseDouble(region_teams[b][1]);
			double somemath = -1.0 * (team1power - team2power) * 30.464 / 400.0;
			double odds_a = 1.0 / (1.0 + Math.pow(10, somemath));

			Random rand = new Random();
			double n = (rand.nextInt(1000000) + 0) / 1000000.0;
			if (n <= odds_a) {
				round[i][0] = region_teams[a][0];
				round[i][1] = region_teams[a][1];
				round[i][2] = region_teams[a][2];
			} else {
				round[i][0] = region_teams[b][0];
				round[i][1] = region_teams[b][1];
				round[i][2] = region_teams[b][2];
			}
		}
		return round;

	}


}