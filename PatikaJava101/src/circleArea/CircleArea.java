package circleArea;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		int radius, angle;
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin yar��ap�n� giriniz : ");
		radius = input.nextInt();
		System.out.print("Merkez a��n� �l��s�n� giriniz : ");
		angle = input.nextInt();
		
		double temp = pi * (radius * radius) * angle;
		double area = temp / 360;
		
		System.out.println("Daire diliminin alan� : " + area);
		input.close();
		
		

	}

}
