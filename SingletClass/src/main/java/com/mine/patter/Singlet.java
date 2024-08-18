package com.mine.patter;

public class Singlet {
	private static Singlet singlet;
	
	private Singlet() {
		
	}
	public synchronized static Singlet getInstance() {
		
		if(singlet == null)
			 singlet= new Singlet();
		
		return singlet;
		
	}

}
