package com.leetcode.BFS;
import java.util.*;
public class SurroundedRegions_2BFS {
	public static void main(String[] args){
//		char[][] input = {{'X','X','X'},
//						  {'X','O','X'},
//						  {'X','X','X'},
//						 };
		
		char[][] input = {{'X','X','X','X'},
						  {'x','O','O','X'},
						  {'X','X','O','X'},
						  {'X','O','X','X'}};
		solve(input);
		for(int i = 0; i < input.length; i ++){
			for(int j = 0; j < input[0].length; j ++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void solve(char[][] board) {
		 
	}
}

















