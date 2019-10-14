package com.jbk;

public class Pair {
	
	public int findpair(String a[])
	{
		int no=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i].equalsIgnoreCase(a[i+1]))
			{
				no++;
			}
		}
		
		return no; 
		
	
	}
			
	

	public static void main(String[] args) {
		
		String arr[]= {"Blue","Pink","Red","Pink","Blue"};
		
		Pair pair=new Pair();
		
		int result=pair.findpair(arr);
		System.out.println(result);
		
	
		
	}

}
