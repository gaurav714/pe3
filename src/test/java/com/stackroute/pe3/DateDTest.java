package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.*;
public class DateDTest 
{
	DateD d=new DateD();
	@Test
	public void Test()
	{
		assertEquals("Mon 06/08/2018 Sun 12/08/2018",d.dateCal());
		assertNotEquals("Mon 07/08/2018 Sun 13/08/2018",d.dateCal());
		assertNotNull(d.dateCal());
		
	}		

}
