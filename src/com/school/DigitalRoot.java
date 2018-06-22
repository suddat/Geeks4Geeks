package com.school;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DigitalRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int rem=0, num=0, cond=0;
		int[] arr = new int[T];
		int[] primeList = {2,3,5,7};
		String lgt, changeToRemainder;
		for(int i =0; i< T; i++) {
			num = sc.nextInt();
			lgt = Integer.toString(num);
			cond = lgt.length();
			rem = 0;
			while(cond > 0) {
				rem += num%10;
				num = num/10;
				changeToRemainder = Integer.toString(rem);
				if(changeToRemainder.length() > 1 && cond ==1) {
					num = rem;
					lgt = Integer.toString(num);
					cond = lgt.length();
					rem = 0;
					continue;
				}
				cond--;
			}
			arr[i] = rem;			
		}
		
		for (int j : arr) {
			System.out.println(j);
			boolean result = IntStream.of(primeList).anyMatch(x -> x == j);
			if(result) {
				System.out.println('1');
			}else {
				System.out.println('0');
			}
		}

	}

}
