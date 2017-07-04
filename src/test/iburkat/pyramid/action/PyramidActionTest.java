package test.iburkat.pyramid.action;

import org.junit.Assert;
import org.junit.Test;

import com.iburkat.pyramid.entity.Pyramid;
import com.iburkat.pyramid.parser.Parser;
import com.iburkat.pyramid.reader.ReadFile;
import com.iburkat.pyramid.action.*;


public class PyramidActionTest {

	@Test
	public void calculatePyramidVolume() throws Exception{
		Pyramid[] imputData = Parser.parsePyramids(ReadFile.read("resources\\rawData.txt"));
		
		double expected = 232.5625;
		
		double result = Action.calculatePyramidVolume(imputData[0]);
		
		Assert.assertEquals("test failed: ", expected, result, 0.000001);
		
	}

	@Test
	public void calculatePyramidSquare() throws Exception{
		Pyramid[] imputData = Parser.parsePyramids(ReadFile.read("resources\\rawData.txt"));
		
		double expected = 45;
		
		double result = Action.calculatePyramidSquare(imputData[1]);
		
		Assert.assertEquals("test failed: ", expected, result, 0.000001);
		
	}

	@Test
	public void calculateRationVolume() throws Exception{
		Pyramid[] imputData = Parser.parsePyramids(ReadFile.read("resources\\rawData.txt"));
		
		double expected = 46;
		
		double result = Action.calculateRationVolume(imputData[2]);
		
		Assert.assertEquals("test failed: ", expected, result, 0.000001);
		
	}

}
