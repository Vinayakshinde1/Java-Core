package com.learning.core.day2session1;

public class D02P05_9 {

	public static void main(String []args) {
		String str ="Mr John Smith";
		
		
		System.out.println(replaceSpaces(str));
		
		
		
		
	}
	public static String replaceSpaces(String str) {
		
		int spaceCount=0;
		int ix=0;
		if(str== null) {
			return null;
		}
		
		for(char c: str.toCharArray()) {
			if(c == ' ') {
				spaceCount++;
			}
		}
		char ch []=new char[str.length()+spaceCount*2];
		
		for(char c:str.toCharArray()) {
			if(c==' ') {
				ch[ix++]='%';
				ch[ix++]='2';
				ch[ix++]='0';
			}else {
				ch[ix++]=c;
			}
		}
		return new String(ch);
		
	}
	
	
}
