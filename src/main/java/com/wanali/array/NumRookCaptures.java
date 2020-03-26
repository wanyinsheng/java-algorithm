package com.wanali.array;
/**
 * 999.车的可用捕获量
 * 
 * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。

车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。

返回车能够在一次移动中捕获到的卒的数量。
 

输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
输出：3
解释：
在本例中，车能够捕获所有的卒。

输入：[[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
输出：0
解释：
象阻止了车捕获任何卒。

输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
输出：3
解释： 
车可以捕获位置 b5，d6 和 f5 的卒。
 * @author wan_ys
 *
 * 2019年3月4日上午10:53:31
 */
public class NumRookCaptures {
	public static void main(String[] args) {
		
	}

	static int numRookCaptures(char[][] board) {
		int count = 0;
		// 先找R的位置
		int len = board.length;
		int x = 0;
		int y = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (board[i][j] == 'R') {
					x = i;
					y = j;
					break;
				}
			}
		}
		// 向左遍历,列下标变
		for (int index = y; index >= 0; index--) {
			if (board[x][index] == 'p') {
				count++;
				break;
			}
			if (board[x][index] == 'B') {
				break;
			}
		}

		// 向右遍历,列下标变
		for (int index = y; index < len; index++) {
			if (board[x][index] == 'p') {
				count++;
				break;
			}
			if (board[x][index] == 'B') {
				break;
			}
		}
		// 向上遍历,行下标变
		for (int index = x; index >= 0; index--) {
			if (board[index][y] == 'p') {
				count++;
				break;
			}
			if (board[index][y] == 'B') {
				break;
			}
		}
		// 向下遍历,行下标变
		for (int index = x; index < len; index++) {
			if (board[index][y] == 'p') {
				count++;
				break;
			}
			if (board[index][y] == 'B') {
				break;
			}
		}
		return count;
	}

}
