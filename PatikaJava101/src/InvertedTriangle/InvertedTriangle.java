package InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Basamak sayýsýný giriniz: ");
		int digits = input.nextInt();
		
		for(int i=(digits-1); i>=1; i--) {
			for(int k= (digits-i-1); k>= 0; k--) {
				System.out.print(" ");
			}
			for(int n=(2*i-1); n>=1; n--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		input.close();

	}

}
