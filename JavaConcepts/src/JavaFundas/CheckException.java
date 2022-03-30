package JavaFundas;
import java.io.*;

//Checked Exception
public class CheckException {
	public static void main(String[] args) {
		
		File f = new File("C\\ab.txt");

		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			while(br.readLine() != null) {
				System.out.println(br.readLine());
			}
			br.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
