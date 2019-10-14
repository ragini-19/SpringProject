package com.jbk;

public class A {
	
	public static void main(String[] args) {
		
		int a[]=new int[] {11,22,55,88};
		int max=0;
		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("zzzzzzzzzzzzz");
		
		System.out.println(max);
		
	}


}
