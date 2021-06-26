package Diamond;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Basamak sayýsýný giriniz: ");
		int n = input.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j =0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println(" ");	
		}
		for(int i= (n-1) ; i>=1; i--) {
			for(int j =(n-i-1); j>= 0 ; j--) {
				System.out.print(" ");
			}
			for(int k=(2*i-1); k>= 1; k--) {
				System.out.print("*");
			}
			System.out.println(" ");	
		}
		input.close();
	}

}
