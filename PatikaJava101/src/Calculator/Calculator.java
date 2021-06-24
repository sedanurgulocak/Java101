package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int number1, number2, select;
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayýyý giriniz: ");
		number1 = input.nextInt();
		System.out.print("Ýkinci sayýyý giriniz: ");
		number2 = input.nextInt();
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminiz: ");
		select = input.nextInt();
		
		switch(select) {
		case 1: System.out.println("Toplama sonucu: " + (number1 + number2));
		break;
		case 2: System.out.println("Çýkarma sonucu: " + (number1 - number2));
		break;
		case 3: System.out.println("Çarpma sonucu: " + (number1 * number2));
		break;
		case 4: 
			if(number2 ==0) {
				System.out.print("Sayý sýfýra bilenemez");
			}else {
				System.out.println("Bölme sonucu: " + (number1 / number2));
			}
			
		break;
		default:
			System.out.println("Tekrar deneyiniz");
			break;
		}
		input.close();

	}

}
