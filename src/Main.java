import java.io.*;
import java.util.ArrayList;

/**
 * Main class of TP application
 * 
 * @author gaetan
 */
public class Main {
	
	public static BufferedReader reader;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		welcome();
		
		try {
			reader = loadImage();
		} catch (Exception e) {
			exit("Sorry, the file cannot be found.");
			return;
		}
		
		// read file
		PgmParser parser = new PgmParser();
		parser.readPgm(reader);
		
		exit();
		
	}
	
	
	/**
	 * Displays welcome message as program starts
	 */
	public static void welcome() {
		System.out.println(	"-------------------------\n" +
							"      EI3 Info - TP      \n" +
							"  Binary images process  \n" +
							"-------------------------\n");
	}
	
	
	/**
	 * Opens buffered stream reader from selected image file 
	 * 
	 * @return BufferedReader
	 * @throws FileNotFoundException Throw exception if image file path is wrong
	 */
	public static BufferedReader loadImage() throws FileNotFoundException {
		
		// create list of image names
		ArrayList<String> imgNames = new ArrayList<String>();
	    imgNames.add("lena512x512.pgm");
	    imgNames.add("peppers512x512.pgm");
	    
	    // open file
	    String imgFilePath = Config.IMG_FOLDER_PATH + imgNames.get(Config.SELECTED_IMG);
	    System.out.println("Selected file: " + imgFilePath);
		File imgFile = new File(imgFilePath);
		
		if (!imgFile.exists()) throw new FileNotFoundException();
		
		return new BufferedReader(new InputStreamReader(new FileInputStream(imgFile)));
	}
	
	
	/**
	 * Informs user that program stops
	 */
	public static void exit() {
		exit(null);
	}
	
	/**
	 * Informs user that program stops
	 * @param message Additional message to send to user
	 */
	public static void exit(String message) {
		if (message != null) System.out.println(message);
		System.out.println(Config.END_OF_PROGRAM);
	}
	
}
