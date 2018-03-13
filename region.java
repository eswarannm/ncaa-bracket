class Region {

	String[][] teams = new String[64][3];
	private int start;
	private int end;


	public Region(String[][] teams, int start, int end) {
		this.teams = teams;
		this.start = start;
		this.end = end;
	}

	public static void game() {
		int team1power = teams[0][1];
		int team2power = teams[15][1];
		double winner = 1 / (1 + Math.pow(10, (-1)((team1power - team2power) * 30.464) / 400));
		System.out.println(winner);
	}


}