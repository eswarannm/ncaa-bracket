import java.util.Scanner;
import java.io.*;

class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("ncaa_data_2018.csv");
		Scanner scanner = new Scanner(file);
		Team[] eastRegion = new Team[16];
		Team[] midwestRegion = new Team[16];
		Team[] southRegion = new Team[16];
		Team[] westRegion = new Team[16];
		int currentLine = 0;
		int region = 0;
		int i = 0;
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			if (i != 0 && i != 17 && i != 18 && i != 35 && i != 36 && i != 53 && i != 54) {
				if (currentLine >= 16) {
					currentLine = 0;
					region++;
				}
				if (currentLine < 16) {
					if (region == 0) {
						eastRegion[currentLine] = new Team(line);
						currentLine++;
					} else if (region == 1) {
						midwestRegion[currentLine] = new Team(line);
						currentLine++;
					} else if (region == 2) {
						southRegion[currentLine] = new Team(line);
						currentLine++;
					} else if (region == 3) {
						westRegion[currentLine] = new Team(line);
						currentLine++;
					}
				} 
            }
			i++;
		}

		Region[] regions = new Region[4];
		regions[0] = new Region("east", eastRegion);
		regions[1] = new Region("midwest", midwestRegion);
		regions[2] = new Region("south", southRegion);
		regions[3] = new Region("west", westRegion);

		Tournament superBowl = new Tournament();
		Team[] finalFour = new Team[4];
		for (int j = 0; j < regions.length; j++) {
			Team[] winners = superBowl.round1(regions[j]);
			Team[] winners2 = superBowl.round2(winners, regions[j]);
			Team[] winners3 = superBowl.round3(winners2, regions[j]);
			finalFour[j] = superBowl.round4(winners3, regions[j]);
		}

		for (int x = 0; x < finalFour.length; x++) {
			System.out.println(finalFour[x].getName());
		}

		FinalFour ff = new FinalFour(finalFour);
		Team[] championship = new Team[2];
		championship = superBowl.round5(finalFour, ff);

		String champ = new String();
		champ = superBowl.round6(championship, ff);

		for (int x = 0; x < championship.length; x++) {
			System.out.println(championship[x].getName());
		}

		System.out.println("---");
		System.out.println(champ);
	
	}

}