package com.codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Knigh Chess Solution
 */
public class Events {


    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int test_case = fr.nextInt();
        while (test_case--!=0){
            int n = fr.nextInt();
            int mat[][] = new int[n][2];
            for (int i=0;i<n;i++){
                mat[i][0] = fr.nextInt();
                mat[i][1] = fr.nextInt();
            }
            int x = fr.nextInt();
            int y = fr.nextInt();
            
            //all the 8 possible moves of kings are checked if all the position are in knights kill range
            if (checkmate(x-1,y-1,mat) && checkmate(x-1,y,mat) &&checkmate(x-1,y+1,mat) &&checkmate(x,y-1,mat) &&
                    checkmate(x,y+1,mat) &&checkmate(x+1,y-1,mat) &&checkmate(x+1,y,mat) &&checkmate(x+1,y+1,mat)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }


    static boolean checkmate(int x, int y, int mat[][]){
    	//checking knights kill move of 2 and half i.e 2 move to x and 1 to y vice versa 8 possibilities
        for (int i=0;i<mat.length;i++){
            if (x == mat[i][0]+1 && y == mat[i][1] +2){
                return true;
            }
            if (x == mat[i][0]+1 && y == mat[i][1] -2){
                return true;
            }
            if (x == mat[i][0]-1 && y == mat[i][1] +2){
                return true;
            }
            if (x == mat[i][0]-1 && y == mat[i][1] -2){
                return true;
            }
            if (x == mat[i][0]+2 && y == mat[i][1] +1){
                return true;
            }
            if (x == mat[i][0]+2 && y == mat[i][1] -1){
                return true;
            }
            if (x == mat[i][0]-2 && y == mat[i][1] -1){
                return true;
            }
            if (x == mat[i][0]-2 && y == mat[i][1] +1){
                return true;
            }
        }
        return false;
    }



    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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