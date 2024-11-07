// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
		Random r = new Random();
		int limit = Integer.parseInt(args[0]);
		int x = r.nextInt(0, limit);
		int y = r.nextInt(0, limit);
		int z = r.nextInt(0, limit);
		
		System.out.print(x);
		System.out.print(" " + y);
		System.out.println(" " + z);

		int min = Math.min(Math.min(x, y), Math.min(z, y));
		int max = Math.max(Math.max(x, y), Math.max(z, y));
		int mid = (x + y + z) - (max + min);
		System.out.println(min + " " + mid + " " + max);
	}
}
