package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.*;
public class PlacesTest {
	Places p=new Places();
	String[] a={"India", "United States","Germany","Egypt","czechoslovakia"}; //removed space from cze
	String[] b= {"Ind","Untd Stts","Grmny","Egypt","czchslvk"};  //REMOVED E FROM CZCH. Added I in india
	//System.out.println(b);
	@SuppressWarnings("deprecation")
	@Test
	public void test(){
		assertEquals(b, p.remVol(a));
		assertNotEquals("India",p.remVol(a));
		assertNotNull(p.remVol(a));
			
	}


}
