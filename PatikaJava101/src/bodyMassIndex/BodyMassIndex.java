package bodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		 double size, weight, result;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("L�tfen boyunuzu (metre cinsinden) giriniz : ");
		 size = input.nextDouble();
		 System.out.print("L�tfen kilonuzu giriniz : ");
		 weight = input.nextDouble();
		 
		 result = weight / (size * size);
		 System.out.println("V�cut kitle indeksiniz : " + result);
		 input.close();
		 
		 
		 
	}

}
