package biggestSmallestNumber;

import java.util.Scanner;

public class BiggestSmallestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Ka� tane say� gireceksiniz?");
		int x = input.nextInt();
		int number;
		
		for(int i=1; i<= x; i++) {
			System.out.print(i + ". Say�y� giriniz: ");
			number = input.nextInt();
			System.out.println(number);
		}
		
		
		input.close();

	}

}
