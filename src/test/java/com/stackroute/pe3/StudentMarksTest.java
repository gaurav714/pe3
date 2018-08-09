package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;

public class StudentMarksTest {
	StudentMarks s =new StudentMarks();
	//int numOfStudents= 5;
	int[] stuGrades= {80,85,90,75,70};
	int[] stuGrades1= {90,101,50,103,80};
	
	@Test
	public void test() {
		assertEquals("grades within range",s.check(stuGrades));
		assertEquals("grades outside range",s.check(stuGrades1));
		assertNotEquals("grades within range",s.check(stuGrades1));
		
	}
	

}
