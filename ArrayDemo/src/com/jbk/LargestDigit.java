package com.jbk;

public class LargestDigit {

	public static void main(String[] args) {
		
		int a[]=new int[] {11,22,88,99,44};
		int large1,large2,temp=0;
		
		large1=a[0];
		
		large2=a[1];
		
		if(large1 < large2)
		{
			temp=large1;
			large1=large2;
			large2=temp;
			
		}
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>large1)
			{
		
				large2=large1;
				large1=a[i];
				
			}
			else if(a[i]>large2 && a[i] !=large1)
			{
				large2=a[i];
			}
			
		}
		
		System.out.println("large1 " +large1);
		
		System.out.println("large2 " +large2);

	}

}
