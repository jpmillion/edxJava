package section2;

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
		
		
		
		return this;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
