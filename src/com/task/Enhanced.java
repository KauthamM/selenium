package com.task;

import java.util.ArrayList;
import java.util.List;

public class Enhanced {

	public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		for(Integer i : l) {
			System.out.println(i);
		}
		
	}

}
