package com.jbk;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayDuplicate {
	

	public static void main(String[] args) {
		
		
		Integer a[]=new Integer[] {11,11,22,3,44,55,11,55};
		
		System.out.println(Arrays.toString(a));
		
		LinkedHashSet<Integer> ll=new LinkedHashSet<>(Arrays.asList(a));
		
		Integer b[]=ll.toArray(new Integer [] {});
		
		
		System.out.println(Arrays.toString(b));
		
	}


}
