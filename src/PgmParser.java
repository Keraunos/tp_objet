import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class provides utilities to read .pgm files 
 * 
 * @author gaetan
 *
 */
public class PgmParser {
	
	
	private int maxReadLines = 20;
	
	/**
	 * Reads all the lines of a .pgm file
	 * @param reader
	 */
	public void readPgm(BufferedReader reader) {
		
		String line = null;
		
		// read all lines
		try {
			
			System.out.println("File content:");
			
			int n = 0;
			while ((line = reader.readLine()) != null && n<maxReadLines) {
				System.out.print(line+" | ");
				n++;
			}
			if (reader.readLine() != null) System.out.println("\netc...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
