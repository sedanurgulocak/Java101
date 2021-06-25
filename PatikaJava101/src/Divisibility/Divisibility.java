package Divisibility;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		int number, total=0, average=0, counter =0;
		Scanner input=new Scanner(System.in);
		System.out.println("Sayý giriniz: ");
		number = input.nextInt();
		
		for(int i=0; i<=number; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				total += i;
				counter++;
			}
		}
		average = total/counter;
		System.out.println("Ortalama: "+ average);
		input.close();

	}

}
