package com.array;

import java.util.ArrayList;
import java.util.List;

public class Rotate {
	
	void rotate_left_right(List<Integer> list, int len) {
		for (int i = 0; i < list.size(); i++) {
			rotateOne(list, len--, i);
		}
	}
	
	void rotateOne(List<Integer> list, int ind, int j) {
		System.out.println("lenght -->"+ ind + " j===>"+ j);
		int temp;
		int removeIndex;		
		temp = list.get(ind-1);
		removeIndex = ind-j-1;
		System.out.println("removIndex ===>"+removeIndex);
		list.remove(removeIndex);
		list.add(0, temp);
		printArray(list);
		System.out.println();
	}
	
	void printArray(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
	}

	public static void main(String[] args) {
		Rotate rot = new Rotate();
		List<Integer> list = new ArrayList<>();
		int[] arr = { 1, 2, 3, 4, 5, 6};
		for (int i=0; i < arr.length; i++) {
			list.add(i, arr[i]);
		}
		/*for(int i=0; i < arr.length; i++) {
			System.out.print(list.get(i) + " ");
		}*/
		
		rot.rotate_left_right(list, list.size());
		System.out.println("Result is =>" + list.size());
	}	
}

/*
package com.array;

public class Rotate {
	
	void rotate_left_right(int[] arr, int len) {
		for (int i = 0; i < arr.length; i++) {
			rotateOne(arr, len-i, i);
		}
	}
	
	void rotateOne(int[] arr, int ind, int j) {
		System.out.println("ind =>"+ ind);
		System.out.println("j =>"+ j);
		int t= arr[ind];
		for (int i = ind; i > 0; i--) {
			if(i == ind-j) {
				arr[i] = arr[i-1];
			}else {
				arr[i] = arr[i-1];
			}
		}
		arr[0] = t;
		printArray(arr);
		System.out.println();
	}
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		Rotate rot = new Rotate();
		int[] arr = { 1, 2, 3, 4};
		rot.rotate_left_right(arr, arr.length-1);
		System.out.println("Result is =>" + arr[0]);
	}	
}

*/


