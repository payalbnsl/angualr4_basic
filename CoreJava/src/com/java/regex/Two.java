package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {

	public static void main(String[] args) {
//Character classes
		Pattern p = Pattern.compile("[a-z]");
		Matcher m= p.matcher("a7b@z#9");
		while(m.find()){
			System.out.print(m.start());
			System.out.println(m.group());
		}
		
	}

}
