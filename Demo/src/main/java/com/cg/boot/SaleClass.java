package com.cg.boot;

public class SaleClass {

	int arr[]= {12,3,4,5,6};
	public void print()
	{
		
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			num+=arr[i];
			System.out.println(num);
		}
	}
}
