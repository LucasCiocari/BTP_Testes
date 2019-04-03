package btp.teste_software;
 
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrianglesSmallerTest {

	//given_When_Then_()
	
	@Test
	public void classifyTestUm(){
		assertEquals(new TrianglesSmaller(5,5,5).classify(), "equilateral");	
		assertEquals(new TrianglesSmaller(3,4,5).classify(), "right-angled");
		assertEquals(new TrianglesSmaller(9,13,14).classify(), "scalene");
		assertEquals(new TrianglesSmaller(5,5,7).classify(), "isosceles");
		assertEquals(new TrianglesSmaller(0, 1, 2).classify(), "impossible");
		assertEquals(new TrianglesSmaller(100, 99, 1).classify(), "impossible");
	}
	
	
	
	
	
}
