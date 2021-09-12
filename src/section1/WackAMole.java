package section1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class WackAMole {
	
	int score = 0;
	int molesLeft;
	int attemptsLeft;
	char[][] moleGrid;
	
	WackAMole(int numAttempts, int gridDimension){
		attemptsLeft = numAttempts;
		molesLeft = gridDimension;
		moleGrid = new char[gridDimension][gridDimension];
	}
	
	boolean place(int x, int y) {
		if (moleGrid[y][x] != 'M') {
			moleGrid[y][x] = 'M';
			return true;
		}
		return false;
	}
	
	void wack(int x, int y) {
		if (moleGrid[y][x] == 'M') {
			moleGrid[y][x] = 'W';
			score++;
			molesLeft--;
		}
		attemptsLeft--;
	}
	
	void printGridToUser() {
		for (char[] row : moleGrid) {
			for (int i = 0; i < row.length; i++) {
				char c = row[i] == 'W' ? row[i] : '*';
				if (i == row.length-1) System.out.println(c);
				else System.out.printf("%c ", c);
			}
		}
	}
	
	void printGrid() {
		for (char[] row : moleGrid) {
			for (int i = 0; i < row.length; i++) {
				char c = row[i] == 'W' || row[i] == 'M' ? row[i] : '*';
				if (i == row.length-1) System.out.println(c);
				else System.out.printf("%c ", c);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of attempts");
		int attempts = scan.nextInt();
		System.out.println("Enter number of moles");
		int moles = scan.nextInt();
		
		WackAMole game = new WackAMole(attempts, moles);
		
		int i = 0;
		Random random = new Random();
		
		while (i < moles) {
			int y = random.nextInt(game.moleGrid.length);
			int x = random.nextInt(game.moleGrid.length);
			if (game.place(y, x)) i++;
		}
		
		while (game.attemptsLeft > 0) {
			System.out.println("Enter y cordinate");
			int y = scan.nextInt();
			System.out.println("Enter x cordinate");
			int x = scan.nextInt();
			if (x + y == -2) break;
			game.wack(y, x);
			System.out.println("Grid to show wacks");
			game.printGridToUser();
		}
		
		scan.close();
		game.printGrid();
	}

}
