package com.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task9 {

	public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		
		for(int i=l.size()-1; i>=l.size()-5; i--) {
		
	    System.out.println(l.get(i));
		
		}
	}

}
