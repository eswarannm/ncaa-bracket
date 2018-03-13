import java.util.Scanner;
import java.io.File;

class InputScanner {

	public static String[] readFile() {
		File file = new File("ncaa_data_2018.csv");
		Scanner scanner = new Scanner(file);

		int teamnum = 0;

		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] pieces = line.split(",");
			String name = pieces[0];
			int power = Integer.parseInt(pieces[1]);
			int seed = Integer.parseInt(pieces[2]);
		}

	}

}