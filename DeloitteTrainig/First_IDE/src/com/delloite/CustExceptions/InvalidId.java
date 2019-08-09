package com.delloite.CustExceptions;

public class InvalidId extends Exception{
	public InvalidId(){
		System.out.println("error");
	}
	public InvalidId(String str){
		System.out.println(str);
	}

}
