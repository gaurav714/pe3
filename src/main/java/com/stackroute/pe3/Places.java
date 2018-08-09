package com.stackroute.pe3;

public class Places {
	public String[] remVol(String[] a) {
		int len=a.length;
		String s=new String();
		for(int i=0;i<len;i++)
		{
				s= a[i].replaceAll("a|e|i|o|u","").trim();	
				a[i]=s;
			
		}
		return a;
	}

}
