package section2;

import java.util.Arrays;

public class Squarelotron {
	int[][] squarelotron;
	int size;
	
	Squarelotron(int n) {
		this.size = n;
		this.squarelotron = new int[n][n];
		
		for (int i = 0, k = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {
				this.squarelotron[i][j] = k++;
			}
		}
	}
	
	Squarelotron upsideDownFlip(int ring) {
		
		int startIdx = ring - 1;
		int endIdx = startIdx * 2;
		
		for (int i = startIdx; i <= endIdx; i++) {
			int temp = this.squarelotron[startIdx][i];
			this.squarelotron[startIdx][i] = this.squarelotron[endIdx][i];
			this.squarelotron[endIdx][i] = temp;
		}
		
		for (int i = startIdx + 1, j = endIdx - 1; i < j; i++, j--) {
			int temp = this.squarelotron[i][startIdx];
			this.squarelotron[i][startIdx] = this.squarelotron[j][startIdx];
			this.squarelotron[j][startIdx] = temp;
			
			temp = this.squarelotron[i][endIdx];
			this.squarelotron[i][endIdx] = this.squarelotron[j][endIdx];
			this.squarelotron[j][endIdx] = temp;
		}
		
		
		
		
		return this;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
