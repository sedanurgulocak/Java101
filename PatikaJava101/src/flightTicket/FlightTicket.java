package flightTicket;

import java.util.Scanner;

public class FlightTicket {

	public static void main(String[] args) {
		int distance, age, tripType;
		double kmPrice=0.10, totalPrice, discountedPrice = 0.0, temp;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Mesafe: ");
		distance = input.nextInt();
		System.out.println("Yaþýnýz: ");
		age = input.nextInt();
		System.out.println("Yolculuk tipi-> Tek yön için '1', Gidiþ dönüþ için '2' seçiniz :");
		tripType = input.nextInt();
		
		if(distance < 0 || age < 0 ) {
			if(tripType != 1 || tripType != 2) {
				System.out.println("Hatalý Veri Girdiniz !");
			}
		}else {
			totalPrice = kmPrice * distance;
			System.out.println("Toplam tutar: " + totalPrice + "TL");
			
			if(age < 12) {
				temp = totalPrice * 0.5;
				discountedPrice = totalPrice - temp;
				System.out.println("Tek yön Ýndirimli tutar: " + discountedPrice);
			}else if(age > 12 && age < 24) {
				temp = totalPrice * 0.1;
				discountedPrice = totalPrice - temp;
				System.out.println("Tek yön Ýndirimli tutar: " + discountedPrice);
			}else if(age > 65) {
				temp = totalPrice * 0.3;
				discountedPrice = totalPrice - temp;
				System.out.println("Tek yön Ýndirimli tutar: " + discountedPrice);
			}else {
				System.out.println("Tek yön bilet fiyatý: " + totalPrice);
			}
			
			if(tripType == 2) {
				temp = discountedPrice * 0.2;
				discountedPrice = discountedPrice - temp;
				discountedPrice = discountedPrice * 2;
				System.out.println("Çift yön Ýndirimli tutar: " + discountedPrice);
			}
			
			
		}
		
		
		
		input.close();
	}

}
