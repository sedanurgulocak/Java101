package Combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		int n, nFak = 1, r, rFak = 1, temp = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("n = " );
		n = input.nextInt();
		System.out.println("r = ");
		r = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			nFak = nFak * i;
		}
		for(int i=1; i<=r; i++) {
			rFak = rFak * i;
		}
		for(int i=1; i<=(n-r); i++) {
			temp = temp * i;
		}
		
		int result = nFak / (rFak * temp);
		System.out.println("Kombinasyon= " + result);
		input.close();	

	}

}
