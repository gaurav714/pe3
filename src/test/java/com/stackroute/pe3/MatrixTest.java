package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;

public class MatrixTest {
	Matrix m=new Matrix();
	
	int[][] mat1= {{1,2},{3,4},{5,6}};
	int[][] mat2= {{9,8},{7,6},{5,4}};
	int[][] result= {{10,10},{10,10},{10,10}};
	int[][] result1= {{10,20},{20,30},{30,40}};
	int[] r= {1,2,3};
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals(result,m.add(mat1, mat2));
		assertNotEquals(result1,m.add(mat1, mat2));
		assertNotEquals(r,m.add(mat1, mat2));
		
	
	}
}
