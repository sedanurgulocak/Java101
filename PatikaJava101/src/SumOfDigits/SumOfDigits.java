package SumOfDigits;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int number, counter = 0, temp = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayý giriniz: ");
		number = input.nextInt();
		
		while(number != 0) {
			temp = (number % 10) + temp;
			number /= 10;			
		}
		
		System.out.println("Sonuc= " + temp);
		input.close();

	}

}
