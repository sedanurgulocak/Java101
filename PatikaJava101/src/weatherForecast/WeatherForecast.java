package weatherForecast;

import java.util.Scanner;

public class WeatherForecast {

	public static void main(String[] args) {
		int heat;
		Scanner input = new Scanner (System.in);
		System.out.println("Hava sýcaklýðýný giriniz: ");
		heat = input.nextInt();
		
		if(heat < 5){
			System.out.println("Kayak yapabilirsiniz");
		}else if(heat >= 25) {
			System.out.println("Yüzmeye gidebilirsiniz");
		}else {
			if(heat < 10) {
				System.out.println("Sinemaya gidebilirsiniz");
			}else if(heat > 20) {
				System.out.println("Pikniðe gidebilirsiniz");
			}else {
				System.out.println("Sinemaya ve pikniðe gidebilirsiniz");
			}
			
		}
		input.close();

	}

}
