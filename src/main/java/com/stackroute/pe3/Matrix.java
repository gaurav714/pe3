package com.stackroute.pe3;

public class Matrix
{
	public int[][] add(int[][]m1, int[][]m2)
	{
		int len=m1.length;
		int len2=m2.length;
		int[][] result=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				result[i][j]=m1[i][j]+m2[i][j];
			}
			
		}
		return result;
	}
}
