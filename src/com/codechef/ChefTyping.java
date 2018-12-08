package com.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class ChefTyping {
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int T = fr.nextInt();
		int N = fr.nextInt();
		int total=0, sum=0;
		String typing;
		Map<String, Integer> typedWord;
		while (T-- > 0) {
			typedWord = new HashMap<>();
			while(N-- > 0) {
				typing = fr.next();
				//typing = fr.next().toCharArray();
				if(typedWord.get(typing) != null) {
					sum += typedWord.get(typing)/2;
					continue;
				}
				//System.out.println(typing.length());
				total = 2;				
				for (int i=1; i< typing.length(); i++) {					
					
					if( (typing.charAt(i-1) == 'd' || typing.charAt(i-1) == 'f')) {
						if (typing.charAt(i) == 'd' || typing.charAt(i) == 'f') {
							total +=4;
						}else {
							total +=2;
						}												
					}
					if( (typing.charAt(i-1) == 'j' || typing.charAt(i-1) == 'k')) {
						if (typing.charAt(i) == 'j' || typing.charAt(i) == 'k') {
							total +=4;
						}else {
							total +=2;
						}												
					}					
				}
				typedWord.put(typing, total);
				sum += total;
			}
		}
		System.out.println(sum);
	}
	
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
