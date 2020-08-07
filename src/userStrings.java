import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class userStrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {

			FileWriter fw = new FileWriter("userStrings.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);
			Scanner scan = new Scanner(System.in);

			String input = "";
			int done = 0;
			while (done != 1) {
				System.out.print("Please type anything or type DONE to quit: ");
				input = scan.nextLine();
				if ("DONE".equals(input)) {
					done = 1;
				} else {
					outFile.print(input);
					outFile.println();
				}
			}
			outFile.close();
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
