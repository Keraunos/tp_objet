import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class provides utilities to read .pgm files 
 * 
 * @author gaetan
 *
 */
public class PgmParser {
	
	/**
	 * Reads all the lines of a .pgm file
	 * @param reader
	 */
	public void readPgm(BufferedReader reader) {
		
		String line = null;
		try {
			System.out.println("BEGIN -------------");
			// read all lines
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("END ---------------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
