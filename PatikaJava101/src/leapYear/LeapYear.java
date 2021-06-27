package leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner (System.in);
		System.out.println("Yil giriniz: ");
		year = input.nextInt();

		if(year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " artık yıldır!");
		}else if(year % 4 == 0) {
			System.out.println(year + " artık yıldır!");
		}
		else {
			System.out.println(year + " artık yıl değildir!");
		}
		input.close();
	}

}
