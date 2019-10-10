package com.jbk;

public class LargestDigitSmallest {

	public static void main(String[] args) {
		
		int a[]=new int[] {11,22,88,99,44};
		int i,temp=0;
		int len=a.length;
		
		System.out.println(len);
	for(i=0;i<a.length;i++)
	{
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i] > a[j])
			{
		
				   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
				
			}
			
			
		}
	}
		
		System.out.println("large1 " +a[len-2]);
		
		System.out.println("large2 " +a[0]);

	}

}
