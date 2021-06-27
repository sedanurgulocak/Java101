package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, number;
		n1 = 0;
		n2 = 1;
		System.out.println("Eleman sayýsý: ");
		number = input.nextInt();
		System.out.print(n1+" "+n2);
		for(int i =2; i<=number; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
		}
		input.close();

	}

}
