package perfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir say� giriniz: ");
		int number = input.nextInt();
		int total = 0;
		
		for(int i=1; i< number; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		if(total == number) {
			System.out.println(number + " M�kemmel say�d�r.");
		}else {
			System.out.println(number + " M�kkemel say� de�ildir.");
		}
		input.close();

	}

}
