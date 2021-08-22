package section2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SquarelotronTest {
	
	Squarelotron s = new Squarelotron(4);
	Squarelotron s2 = new Squarelotron(10);

	@Test
	public void testSquarelotron() {
		
		assertEquals(4, s.size);
		
		for (int i = 0, k = 1; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				assertEquals(k++, s.squarelotron[i][j]);
			}
		}
	}
	
	@Test
	public void testUpsideDownFlip() {
		
		s2.upsideDownFlip(4);
		
		int[][] arr3 = {{64, 65, 66, 67}, {34, 35, 36, 37}};
		
		int[] copyOf4thRow = Arrays.copyOfRange(s2.squarelotron[3], 3, 7);
		int[] copyOf7thRow = Arrays.copyOfRange(s2.squarelotron[6], 3, 7);
		
		assertArrayEquals(arr3[0], copyOf4thRow);
		assertArrayEquals(arr3[1], copyOf7thRow);
		
		int num1 = 64, num2 = 67;
		for (int i = 3; i < 7; i++) {
			assertEquals(num1, s2.squarelotron[i][3]);
			assertEquals(num2, s2.squarelotron[i][6]);
			num1 -= 10;
			num2 -= 10;
		}
	}
}
