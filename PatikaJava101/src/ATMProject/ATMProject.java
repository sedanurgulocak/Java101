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
			System.out.println("Kullanýcý Adýnýz: ");
			userName = input.nextLine();
			System.out.println("Parolanýz: ");
			password = input.nextLine();
			
			if(userName.equals("seda") && password.equals("123")) {
				System.out.println("Merhaba Kodluyoruz bankasýna hoþgeldiniz");
				do {
					System.out.println("1-Para yatýrma\n" + "2-Para çekme\n" + "3-Bakiye sorgulama\n" + "4-Çýkýþ yap\n");
					System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
					select = input.nextInt();
					switch(select) {
					case 1: 
						System.out.println("Para miktarý: ");
						int price = input.nextInt();
						balance += price;
						break;
					case 2:
						System.out.println("Para miktarý: ");
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
				System.out.println("Tekrar görüþmek üzere !");
				break;
			}else {
				right--;
				if(right == 0) {
					System.out.println("Hesabýnýz bloke olmuþtur!");
				}else {
					System.out.println("Kullanýcý adý veya þifre yanlýþ!");
					System.out.println("Kalan hakkýnýz: " + right);
				}
				
			}
			
		}
		input.close();

	}

}
