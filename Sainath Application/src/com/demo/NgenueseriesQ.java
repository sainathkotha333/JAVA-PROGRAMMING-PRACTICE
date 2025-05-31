package com.demo;

public class NgenueseriesQ 
{
public static void main(String[] args)
{
int n=2

;
int twopaircount=0;
int t=0;
for(int i=0;i<n;i++)
{
int x= i;
for(int j=0;j<n;j++)
{
int y=j;
if(x+y==n)
{
System.out.println(x+" "+y);
twopaircount++;
}
for(int k=0;k<n;k++)
{
int s=k;
if(x+y+s==n)
{
t++;
System.out.println(x+" "+y+" "+s);
}
}
}
}
System.out.println("Two pair count possible="+twopaircount+"Three pairs possible count="+t);
}
}