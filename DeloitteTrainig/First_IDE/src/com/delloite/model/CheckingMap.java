package com.delloite.model;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CheckingMap {
	public static void main(String[] args) {
		Map<Integer,String> data = new HashMap<Integer, String>();
		data.put(2, "A");
		data.put(1, "B");
		data.put(3, "C");
		data.put(4, "D");
		
		for(Map.Entry<Integer, String> en : data.entrySet()) {
			System.out.println(en.getKey() +" : " + en.getValue());
		}
	
	}

}
