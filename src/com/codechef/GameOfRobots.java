package com.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class GameOfRobots {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int T = fr.nextInt();
		char[] robot_mov;
		// int robot_test;
		int[] trace = new int[50];
		int k = 0, d, t, flag;
		boolean isSafe = true;
		while (T-- > 0) {
			robot_mov = fr.next().toCharArray();
			// trace = new byte[robot_mov.length];
			flag=0;
			k=0;
			for (int i = 0; i < robot_mov.length; i++) {
				if ((int) robot_mov[i] >= 48 && (int) robot_mov[i] <= 57) {
					trace[k] = i;
					k++;
				}
			}

			for (int j = 0; j < k - 1; j++) {
				d = trace[j + 1] - trace[j] - 1;
				t = robot_mov[trace[j + 1]] + robot_mov[trace[j]] - 96;
				System.out.println(robot_mov[trace[j + 1]]);
				if (d < t) {
					flag = 1;
					break;
				}					
			}
			if (flag == 0)
				System.out.println("safe\n");
			else
				System.out.println("unsafe\n");
			/*
			 * for (int i = 0; i < robot_mov.length; i++) { if(robot_mov[i] != '.') {
			 * //robot_test = Character.getNumericValue(robot_mov[i]) ; isSafe =
			 * GameOfRobots.checkPosition(trace, i,
			 * Character.getNumericValue(robot_mov[i])); if(!isSafe) { break; } } }
			 * if(!isSafe) { System.out.println("unsafe"); }else {
			 * System.out.println("safe"); }
			 */
		}
	}

	static boolean checkPosition(byte[] data, int ind, int value) {
		// data[ind] = 1;
		int left_ind = ind;
		int left_val = value;
		// left
		while (ind >= 0 && value >= 0) {
			if (data[ind] == 1)
				return false;
			else
				data[ind] = 1;
			ind--;
			value--;
		}

		ind = left_ind + 1;
		value = left_val;
		// right
		while (ind <= value + ind && ind < data.length) {
			if (data[ind] == 1)
				return false;
			else
				data[ind] = 1;
			ind++;
			value--;
		}
		return true;
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
