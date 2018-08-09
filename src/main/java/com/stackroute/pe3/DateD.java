package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateD {
	public String dateCal()	
	{
		Date date= new Date();
		Date d1=new Date(date.getTime()-3*(24*3600*1000));
		String d="E dd/MM/yyyy";
		SimpleDateFormat f=new SimpleDateFormat(d);
		String s1=f.format(d1);
		System.out.println(d1);
		Date d2=new Date(date.getTime()+3*(24*3600*1000));
		String s2=f.format(d2);
		System.out.println(s2);
		String s="";
		s=s+s1;
		s=s+" ";
		s=s+s2;
		return s;
	}

}
