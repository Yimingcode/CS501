import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Component;
import java.io.*;

public class C12E13file {
	public static void main(String[] args) throws IOException{
		
		Scanner input=new Scanner(System.in);
		
		int repeatInt=1;
		
		while(repeatInt==1){
		
      
			JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "TXT File", "txt");
		    chooser.setFileFilter(filter);
			
	    Scanner fileScanner = null;
	    File selectedFile = null;
	   
	    
	    	try{
	    		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	    			selectedFile = chooser.getSelectedFile();
	    			fileScanner = new Scanner(selectedFile);   
	    			
	    			
	    			int linesCount = 0;
					int wordsCount = 0;
					int charsCount = 0;
					while (fileScanner.hasNextLine()) {
		    			linesCount++;
		    			String line = fileScanner.nextLine();
		    			Scanner lineScanner = new Scanner(line);
		    			
		    			while(lineScanner.hasNext()) {
		    				wordsCount++;
		    				String word = lineScanner.next();
		    				charsCount += word.length();
		    			} 

		    			lineScanner.close();
		    		}
		    
		    		System.out.println("You chose to open this file: " +  chooser.getSelectedFile().getName());
		    		System.out.println("========== Result ==========");
		    		System.out.println("Total chars: " + charsCount);
		    		System.out.println("Total words: " + wordsCount);
		    		System.out.println("Total lines: " + linesCount);
		    		
		    		
	    		}
	    		else {
	    			System.out.println("No file selected");
	    			break;
	    		}

	    	}
	    	catch (FileNotFoundException ex) {
            System.out.println("File not found");
	    	}
	    	
	    	System.out.println("\nRepeat program (enter 1 for yes or 0 for no)?: ");       
    		repeatInt = input.nextInt();
		}
	
	}

}