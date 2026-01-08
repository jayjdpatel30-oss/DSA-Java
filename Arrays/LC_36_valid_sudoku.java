package Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class LC_36_valid_sudoku {
	
	// ========================================================================
    // LeetCode 36: Valid Sudoku
    // ========================================================================
    /**
     * Problem Statement:
     * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need 
     * to be validated according to the following rules:
     * 1. Each row must contain digits 1-9 without repetition.
     * 2. Each column must contain digits 1-9 without repetition.
     * 3. Each of the nine 3x3 sub-boxes must contain digits 1-9 without repetition.
     * 
     * Note: A Sudoku board (partially filled) could be valid but is not 
     * necessarily solvable. Only filled cells need validation.
     * 
     * Example:
     * Input: board = 
     * [["5","3",".",".","7",".",".",".","."]
     * ,["6",".",".","1","9","5",".",".","."]
     * ,[".","5","8",".",".",".",".","6","."]
     * ,["8",".",".",".","6",".",".",".","3"]
     * ,["4",".",".","8",".","3",".",".","1"]
     * ,["7",".",".",".","2",".",".",".","6"]
     * ,[".","6",".",".",".",".","2","8","."]
     * ,["5",".",".","4","1","9",".",".","5"]
     * ,[".",".",".",".","8",".",".","7","9"]]
     * Output: true
     *
     * Approach:
     * Use HashSets to track seen numbers:
     * - first add rows with -> rowNumber row value
     * - then add column with -> columnNumber column value
     * - finally add number with boxnumber! -> boxNum box value
     * if any of this operation we cannot perform [adding] return false;
     * 
     * For box index: boxIndex = (row / 3) * 3 + (col / 3)
     * 
     * Time Complexity: O(1) - fixed 9x9 board = 81 cells
     * Space Complexity: O(1) - fixed size HashSets
     */
	
	public static void main(String[] args) {
		
		String[][] board =  {{"5","3",".",".","7",".",".","","."}
    			     			    ,{"6",".",".","1","9","5",".",".","."}
    				    	      ,{".","7","8",".",".",".",".","6","."}
    				    	      ,{"8",".",".",".","6",".",".",".","3"}
    				    	      ,{"4",".",".","8",".","3",".",".","1"}
    				    	      ,{"7",".",".",".","2",".",".",".","6"}
    				    	      ,{".","6",".",".",".",".","2","8","."}
    				    	      ,{".",".",".","4","1","9",".",".","5"}
    				    	      ,{".",".",".",".","8",".",".","7","9"}};
    
		System.out.println(validSudoku(board));
	}
	
	private static boolean validSudoku(String[][] board) {
		
		boolean isValid = true;
		HashSet<String> seen = new HashSet<String>();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
				if (board[i][j] != ".") {
					
					if(!seen.add(i + " row " + board[i][j])) {
						return false;
					}
					
					if(!seen.add(j + " column " + board[i][j])) {
						return false;
					}
					
					int boxNumber = ((i / 3)*3) + j /3;
					
					if(!seen.add(boxNumber + " box " + board[i][j])) {
						return false;
					}
					
				}
					
			}
		}
		
		return isValid;
	}

}

// Output:
// true
