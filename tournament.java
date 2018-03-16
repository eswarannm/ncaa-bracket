class Tournament {

		private Region[] regions;

		public Tournament(Region[] regions) {
			this.regions = regions;
		}

		public String[][] finalFour() {
			for (int i = 0; i < 2; i+2) {
				double team1power = Double.parseDouble(regions[i][]);
				double team2power = Double.parseDouble(regions[i+1][]);
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
		}

}