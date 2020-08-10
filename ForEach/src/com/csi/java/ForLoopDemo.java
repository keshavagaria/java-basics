package com.csi.java;

public class ForLoopDemo {
public static void main(String[] args) {
	
	for(int i=1;i<=3;i++)
	{
		System.out.println(i);
		for(int j=1;j<=3;j++)
		{
			
			if(i==2&&j==2)
			{
				break;
			}
			System.out.println(i+" "+j);
		}
	}
}
}
