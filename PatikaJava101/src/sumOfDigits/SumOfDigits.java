package sumOfDigits;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int number, temp = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Say? giriniz: ");
		number = input.nextInt();
		
		while(number != 0) {
			temp = (number % 10) + temp;
			number /= 10;			
		}
		
		System.out.println("Sonuc= " + temp);
		input.close();

	}

}
