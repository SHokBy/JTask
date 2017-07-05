package com.iburkat.pyramid.parser;

import com.iburkat.pyramid.entity.Point;
import com.iburkat.pyramid.entity.Pyramid;
import com.iburkat.pyramid.validation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class Parser {

	private static final Logger LOGGER  = LogManager.getLogger(); 
	
	public static Pyramid[] parsePyramids(List<String> pyramids)  {
		
		int countElements = pyramids.size();
		Pyramid[] listOfPyramid = new Pyramid[countElements];
		
		int aX = 0;
		int Ay = 0;
		int Az = 0;

		int Bx = 0;
		int By = 0;
		int Bz = 0;
		
		int Cx = 0;
		int Cy = 0;
		int Cz = 0;
		
		int Topx = 0;
		int Topy = 0;
		int Topz = 0;
		
		int rowCount = 0;
		for (String rowLines : pyramids){
			
			String[] res=rowLines.split(";");
			if (DataValidation.isCountOfElementsCorrect(res)){
				try{
					aX = Integer.parseInt(res[0]);
					Ay = Integer.parseInt(res[1]);
					Az = Integer.parseInt(res[2]);
					
					Bx = Integer.parseInt(res[3]);
					By = Integer.parseInt(res[4]);
					Bz = Integer.parseInt(res[5]);
					
					Cx = Integer.parseInt(res[6]);
					Cy = Integer.parseInt(res[7]);
					Cz = Integer.parseInt(res[8]);

					Topx = Integer.parseInt(res[9]);
					Topy = Integer.parseInt(res[10]);
					Topz = Integer.parseInt(res[11]);

					Point A = new Point(aX, Ay, Az);
					Point B = new Point(Bx, By, Bz);
					Point C = new Point(Cx, Cy, Cz);
					Point Top = new Point(Topx, Topy, Topz);
					listOfPyramid[rowCount] = new  Pyramid(A, B, C, Top);				
				}
				catch (Exception e) {
					// TODO: handle exception
					LOGGER.error("Pyramid "+(rowCount+1)+" wasn't created(incorrect symbol)");
				}
				
			}else{
				LOGGER.error("Pyramid "+(rowCount+1)+" wasn't created(not enough points)");
			}
		
			rowCount++;
		}
	
				
	return listOfPyramid;
	}
	

}
