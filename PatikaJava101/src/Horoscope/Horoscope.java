package Horoscope;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
		int month, day;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Dogdugunuz ay: ");
		month = input.nextInt();
		System.out.println("Dogdugunuz g�n: ");
		day = input.nextInt();
		
		if(day >=1 && day<=31) {
			if(month == 1) {
				if(day <= 21)
					System.out.println("O�lak");
				else
					System.out.println("Kova");
			}else if(month == 2) {
				if(day <= 19)
					System.out.println("Kova");
				else
					System.out.println("Bal�k");
			}
			else if(month == 3) {
				if(day <= 20)
					System.out.println("Bal�k");
				else
					System.out.println("Ko�");
				
			}else if(month == 4) {
				if(day <= 20)
					System.out.println("Ko�");
				else
					System.out.println("Bo�a");
				
			}else if(month == 5) {
				if(day <= 21)
					System.out.println("Bo�a");
				else
					System.out.println("�kizler");
				
			}else if(month == 6) {
				if(day <= 22)
					System.out.println("�kizler");
				else
					System.out.println("Yenge�");
				
			}else if(month == 7) {
				if(day <= 22)
					System.out.println("Yenge�");
				else
					System.out.println("Aslan");
				
			}else if(month == 8) {
				if(day <= 22)
					System.out.println("Aslan");
				else
					System.out.println("Ba�ak");
				
			}else if(month == 9) {
				if(day <= 22)
					System.out.println("Ba�ak");
				else
					System.out.println("Terazi");
				
			}else if(month == 10) {
				if(day <= 22)
					System.out.println("Terazi");
				else
					System.out.println("Akrep");
			}else if(month == 11) {
				if(day <= 21)
					System.out.println("Akrep");
				else
					System.out.println("Yay");
				
			}else if(month == 12) {
				if(day <= 21)
					System.out.println("Yay");
				else
					System.out.println("O�lak");
				
			}else {
				System.out.println("Ge�ersiz ay girdiniz");
			}
				
		}else {
			System.out.println("Ge�ersiz tarih girdiniz");
		}
		input.close();

	}

}
