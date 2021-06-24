package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int number1, number2, select;
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci say�y� giriniz: ");
		number1 = input.nextInt();
		System.out.print("�kinci say�y� giriniz: ");
		number2 = input.nextInt();
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iminiz: ");
		select = input.nextInt();
		
		switch(select) {
		case 1: System.out.println("Toplama sonucu: " + (number1 + number2));
		break;
		case 2: System.out.println("��karma sonucu: " + (number1 - number2));
		break;
		case 3: System.out.println("�arpma sonucu: " + (number1 * number2));
		break;
		case 4: 
			if(number2 ==0) {
				System.out.print("Say� s�f�ra bilenemez");
			}else {
				System.out.println("B�lme sonucu: " + (number1 / number2));
			}
			
		break;
		default:
			System.out.println("Tekrar deneyiniz");
			break;
		}
		input.close();

	}

}
