package chineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		
		int year, temp;
		String zodiac;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Dogum yilinizi giriniz: ");
		year = input.nextInt();
		temp = year % 12;
		
		switch(temp){
		case 0: zodiac = "Maymun";
		break;
		case 1: zodiac = "Horoz";
		break;
		case 2: zodiac = "K�pek";
		break;
		case 3: zodiac = "Domuz";
		break;
		case 4: zodiac = "Fare";
		break;
		case 5: zodiac = "�k�z";
		break;
		case 6: zodiac = "Kaplan";
		break;
		case 7: zodiac = "Tav�an";
		break;
		case 8: zodiac = "Ejderha";
		break;
		case 9: zodiac = "Y�lan";
		break;
		case 10: zodiac = "At";
		break;
		case 11: zodiac = "Koyun";
		break;
		default: zodiac = "Gecersiz y�l";
		break;

		}
		System.out.println(zodiac);
		input.close();

	}

}
