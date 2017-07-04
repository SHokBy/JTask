package com.iburkat.pyramid.parser;

import com.iburkat.pyramid.entity.Point;
import com.iburkat.pyramid.entity.Pyramid;

import java.util.List;

public class Parser {
	
	public static Pyramid[] parsePyramids(List<String> pyramids) throws Exception {
		
		int countElements = pyramids.size();
		Pyramid[] listOfPyramid = new Pyramid[countElements];
		
		int Ax = 0;
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
			
			Ax = Integer.parseInt(res[0]);
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

			Point A = new Point(Ax, Ay, Az);
			Point B = new Point(Bx, By, Bz);
			Point C = new Point(Cx, Cy, Cz);
			Point Top = new Point(Topx, Topy, Topz);
			
			listOfPyramid[rowCount] = new  Pyramid(A, B, C, Top);
			
			rowCount++;
		}
	
				
	return listOfPyramid;
	}
	

}
