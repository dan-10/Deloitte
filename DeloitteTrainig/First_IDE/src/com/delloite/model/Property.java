package com.delloite.model;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Property {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		File f = new File("");
		FileWriter fw = new FileWriter("");
		
		FileReader fr = new FileReader("C:\\Users\\matham26\\Documents\\MyDetail.properties");
		
		pr.load(fr);
		
		System.out.println(pr.get("name"));
		System.out.println(pr.get("place"));
		System.out.println(pr.get("company"));
	}
}
