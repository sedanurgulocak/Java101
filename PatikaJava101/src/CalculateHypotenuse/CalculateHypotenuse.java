package CalculateHypotenuse;

import java.util.Scanner;

public class CalculateHypotenuse {

	public static void main(String[] args) {
		int a,b,c ;
        Scanner edge = new Scanner(System.in);
        System.out.println("Birinci kenar: ");
        a = edge.nextInt();
        System.out.println("Ýkinci kenar: ");
        b = edge.nextInt();
        System.out.println("Üçüncü kenar: ");
        c = edge.nextInt();

        int perimeter = a + b + c;

        int u = perimeter/2;
        System.out.println(u);
        int temp = u *(u-a)*(u-b)*(u-c);
        System.out.println("Area : " + Math.sqrt(temp));
        edge.close();

	}

}
