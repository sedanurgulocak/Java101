package ATMProject;

import java.util.Scanner;

public class ATMProject {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		while(right > 0) {
			System.out.println("Kullan�c� Ad�n�z: ");
			userName = input.nextLine();
			System.out.println("Parolan�z: ");
			password = input.nextLine();
			
			if(userName.equals("seda") && password.equals("123")) {
				System.out.println("Merhaba Kodluyoruz bankas�na ho�geldiniz");
				do {
					System.out.println("1-Para yat�rma\n" + "2-Para �ekme\n" + "3-Bakiye sorgulama\n" + "4-��k�� yap\n");
					System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
					select = input.nextInt();
					switch(select) {
					case 1: 
						System.out.println("Para miktar�: ");
						int price = input.nextInt();
						balance += price;
						break;
					case 2:
						System.out.println("Para miktar�: ");
						price = input.nextInt();
						if(price > balance) {
							System.out.println("Bakiye yetersiz!");
						}else {
							balance -= price;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz: " + balance);
					}
					
				}while(select != 4);
				System.out.println("Tekrar g�r��mek �zere !");
				break;
			}else {
				right--;
				if(right == 0) {
					System.out.println("Hesab�n�z bloke olmu�tur!");
				}else {
					System.out.println("Kullan�c� ad� veya �ifre yanl��!");
					System.out.println("Kalan hakk�n�z: " + right);
				}
				
			}
			
		}
		input.close();

	}

}
