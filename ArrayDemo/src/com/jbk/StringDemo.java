package com.jbk;

public class StringDemo {

	public static void main(String[] args) {
		String str="mam";
		String rev="";
		
		for(int i =str.length()-1; i>=0;i--)
		{
			rev=rev+ str.charAt(i);
		}
		
		System.out.println(rev);

		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("palindrome not");
		}
	}

}
