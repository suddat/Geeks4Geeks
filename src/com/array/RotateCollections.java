package com.array;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RotateCollections {

	public static void main(String[] args) {
		Collection val = new ArrayList<>();
		val.add(1);
		val.add(2);
		val.add(3);
		val.add(4);
		val.add(5);
		System.out.println(val.size());
		for (Object object : val) {
			System.out.println(object);
		}
		
		for (int i = 0; i < val.size(); i++) {
			System.out.println(val.toArray()[i]);
		}
		System.out.println("*************************");
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(2);
		set.add(8);
		set.add(3);
		set.add(1);
		set.add(5);
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		System.out.println("*************************");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);		
		list.add(3);
		list.add(4);
		list.add(5);		
		list.remove(2);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println();
		System.out.println(list.toArray()[list.size()-2]);
	}

}
