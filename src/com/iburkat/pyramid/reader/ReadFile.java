package com.iburkat.pyramid.reader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//import org.apache.logging.log4j.Logger;

public class ReadFile {

	public static List<String> read (String fileName) {

		List<String> lines = null;
		try {
	        lines = Files.readAllLines(Paths.get( fileName ), Charset.forName("UTF-8"));
	    } catch (IOException ex) {
	        //Logger
	    }
	    
	    return lines;
	}
	 
	
}
