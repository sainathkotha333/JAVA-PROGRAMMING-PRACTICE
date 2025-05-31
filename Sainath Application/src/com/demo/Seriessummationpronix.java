package com.demo;


public class Seriessummationpronix 
{
public static void main(String[] args)
{
	double sum=0;
int n=4,x=2;
for(int i=2;i<=n;i++)
{
sum=sum+(Math.pow(x,i)/i);
}
System.out.println(sum);
}
}
