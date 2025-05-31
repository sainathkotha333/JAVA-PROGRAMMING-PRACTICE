package com.demo;

public class Recursionqpronix 
{
public static double series(int n)
{
	if(n==0)return 0;
	if(n%2==0)
	{
		System.out.println(-1.0/n);
	return -1.0/n+series(n-1);
	}
	else
	{
		System.out.println(1.0/n);
    return 1.0/n+series(n-1);
	}
	
}
public static void main(String[] args)
{
int k=4;
System.out.println(series(k));
}
}
