import java.util.Scanner;
import java.io.*;

class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("ncaa_data_2018.csv");
		Scanner scanner = new Scanner(file);
		String[][] teams = new String[64][3];
		int currentLine = 0;

		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] pieces = line.split(",");

			if (pieces.length > 2) {
				String name = pieces[0];
				String power = pieces[1];
				String seed = pieces[2];
				teams[currentLine][0] = name;
				teams[currentLine][1] = power;
				teams[currentLine][2] = seed;				
				currentLine++;
			}

		}

		Region east = new Region(teams, 0, 15);
		Region midwest = new Region(teams, 16, 31);
		Region south = new Region(teams, 32, 47);
		Region west = new Region(teams, 48, 63);

		Region[] regions;
		regions = new Region[]{east, west, midwest, south};

		Tournament tournament = new Tournament(regions);		

		tournament.finalFour();
		// for (int i=0; i< round_winners.length; i++) {
		// 	for (int j=0; j< round_winners[0].length; j++) {
		// 		System.out.println(round_winners[i][j]);
		// 	}
		// }

	}

}