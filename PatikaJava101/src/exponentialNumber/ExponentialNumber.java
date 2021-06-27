package exponentialNumber;

import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) {
		int x, y;
		Scanner input =new Scanner(System.in);
		System.out.print("Taban = ");
		x = input.nextInt();
		System.out.print("Üs = ");
		y = input.nextInt();
		int result = 1;
		
		for(int i=1; i<=y; i++) {
			result *= x;
		}
		System.out.println("Sonuc = " + result);
		input.close();

	}

}
