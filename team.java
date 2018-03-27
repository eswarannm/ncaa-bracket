class Team {

	private String name;
	private double power;
	private int seed;

	public Team(String team) {

		String[] teamInfo = team.split(",");
        this.name = teamInfo[0];
        this.power = Double.parseDouble(teamInfo[1]);
        this.seed = Integer.parseInt(teamInfo[2]);

	}

  	public String getName(){
        return name;
    }


    public double getPower(){
        return power;
    }

    public int getSeed(){
        return seed;
    }

}