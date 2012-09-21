import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Main class of TP application
 * 
 * @author gaetan
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("---------------------");
		System.out.println("Binary images process");
		System.out.println("---------------------\n");
		
		// create list of image names
		ArrayList<String> imgNames = new ArrayList<String>();
	    imgNames.add("lena512x512.pgm");
	    imgNames.add("peppers512x512.pgm");
		
	    // initialize selected image index in imgNames
	    int selectedImgIndex = 1; 
	    
	    // open file
		File imgFile = new File("resources/img/" + imgNames.get(selectedImgIndex));
		FileInputStream in;
		try {
			in = new FileInputStream(imgFile);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, the file cannot be found.");
			return;
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		// read file
		PgmParser parser = new PgmParser();
		parser.readPgm(reader);
		
	}

}
