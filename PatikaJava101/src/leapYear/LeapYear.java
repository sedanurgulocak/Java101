package leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner (System.in);
		System.out.println("Yil giriniz: ");
		year = input.nextInt();

		if(year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " art�k y�ld�r!");
		}else if(year % 4 == 0) {
			System.out.println(year + " art�k y�ld�r!");
		}
		else {
			System.out.println(year + " art�k y�l de�ildir!");
		}
		input.close();
	}

}
