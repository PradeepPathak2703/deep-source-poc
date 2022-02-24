package com.java.poc;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public String str = null;
	
	public void validate() {
		str = "one";
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		List<String> lstStr = null;
		
		for (String str : lstStr) {
			System.out.println(str);
		}
		
	}

}
