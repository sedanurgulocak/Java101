package calculatePrice;

import java.util.Scanner;

public class CalculatePrice {

	public static void main(String[] args) {
		 double applePrice = 3.67, pearPrice = 2.14, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5;
		 int apple, pear, tomato, banana, eggplant;
		 
		 Scanner input = new Scanner (System.in);
		  System.out.print("Elma kaç kilo : ");
		  apple = input.nextInt();
		  System.out.print("Armut kaç kilo : ");
		  pear = input.nextInt();
		  System.out.print("Domates kaç kilo : ");
		  tomato = input.nextInt();
		  System.out.print("Muz kaç kilo : ");
		  banana = input.nextInt();
		  System.out.print("Patlýcan kaç kilo : ");
		  eggplant = input.nextInt();
		  
		  double result = (apple * applePrice) + (pear * pearPrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (eggplant * eggplantPrice);
		  
		  System.out.println("Toplam Tutar :" + result + " TL");
		  input.close();


	}

}
