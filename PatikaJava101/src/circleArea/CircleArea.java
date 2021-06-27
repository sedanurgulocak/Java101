package circleArea;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		int radius, angle;
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin yarýçapýný giriniz : ");
		radius = input.nextInt();
		System.out.print("Merkez açýný ölçüsünü giriniz : ");
		angle = input.nextInt();
		
		double temp = pi * (radius * radius) * angle;
		double area = temp / 360;
		
		System.out.println("Daire diliminin alaný : " + area);
		input.close();
		
		

	}

}
