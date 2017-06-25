package com.iburkat.pyramid.reader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class readFile {

	public static List<String> read (String fileName) throws IOException{

		List<String> lines = null;
		try {
	        lines = Files.readAllLines(Paths.get( fileName ), Charset.forName("UTF-8"));
	    } catch (IOException ex) {
	        //Logger.getLogger(DefQuoteSynExporterWordlist.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    
	    return lines;
	}
	 
	
}
