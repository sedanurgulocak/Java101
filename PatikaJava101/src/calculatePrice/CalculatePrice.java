package calculatePrice;

import java.util.Scanner;

public class CalculatePrice {

	public static void main(String[] args) {
		 double applePrice = 3.67, pearPrice = 2.14, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5;
		 int apple, pear, tomato, banana, eggplant;
		 
		 Scanner input = new Scanner (System.in);
		  System.out.print("Elma ka� kilo : ");
		  apple = input.nextInt();
		  System.out.print("Armut ka� kilo : ");
		  pear = input.nextInt();
		  System.out.print("Domates ka� kilo : ");
		  tomato = input.nextInt();
		  System.out.print("Muz ka� kilo : ");
		  banana = input.nextInt();
		  System.out.print("Patl�can ka� kilo : ");
		  eggplant = input.nextInt();
		  
		  double result = (apple * applePrice) + (pear * pearPrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (eggplant * eggplantPrice);
		  
		  System.out.println("Toplam Tutar :" + result + " TL");
		  input.close();


	}

}
