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
		int aY = 0;
		int aZ = 0;

		int bX = 0;
		int bY = 0;
		int bZ = 0;
		
		int cX = 0;
		int cY = 0;
		int cZ = 0;
		
		int topX = 0;
		int topY = 0;
		int topZ = 0;
		
		int rowCount = 0;
		for (String rowLines : pyramids){
			
			String[] res=rowLines.split(";");
			if (DataValidation.isCountOfElementsCorrect(res)){
				try{
					aX = Integer.parseInt(res[0]);
					aY = Integer.parseInt(res[1]);
					aZ = Integer.parseInt(res[2]);
					
					bX = Integer.parseInt(res[3]);
					bY = Integer.parseInt(res[4]);
					bZ = Integer.parseInt(res[5]);
					
					cX = Integer.parseInt(res[6]);
					cY = Integer.parseInt(res[7]);
					cZ = Integer.parseInt(res[8]);

					topX = Integer.parseInt(res[9]);
					topY = Integer.parseInt(res[10]);
					topZ = Integer.parseInt(res[11]);

					Point A = new Point(aX, aY, aZ);
					Point B = new Point(bX, bY, bZ);
					Point C = new Point(cX, cY, cZ);
					Point Top = new Point(topX, topY, topZ);
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
