package com.task;

import java.util.*;


public class Task6 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		System.out.println("list Value:" + l);
		
		Set<Integer> s = new LinkedHashSet<>();
		
		s.addAll(l);
		
		System.out.println("copied from List:"+s);

	}

}
