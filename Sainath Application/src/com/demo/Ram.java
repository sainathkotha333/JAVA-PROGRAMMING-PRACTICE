package com.demo;

public class Ram 
{
public static void main(String[] args)
{
String s="Sai nath";
String r=s.toLowerCase();
for(char c='a';c<'z';c++)
{
if(r.indexOf(c)==-1)
	System.out.println(c);
}
}
}
