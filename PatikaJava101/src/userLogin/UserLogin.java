package userLogin;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		String userName, password, response, newPassword;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�: ");
		userName = input.nextLine();
		System.out.println("�ifre: ");
		password = input.nextLine();
		
		if(userName.equals("seda") && password.equals("12345")) {
			System.out.println("Giri� ba�ar�l�");
			
		}else {
			System.out.println("Bilgileriniz yazl�s! �ifrenizi s�f�rlamak istermisiniz?");
			response = input.nextLine();
			if(response.equals("evet")) {
				System.out.println("Yeni �ifre: ");
				newPassword = input.nextLine();
				if(newPassword.equals("password") || newPassword.equals("12345")) {
					System.out.println("Yeni �ifre eskisiyle ve hatal� giri�le ayn� olamaz!");
				}else {
					System.out.println("�ifre olu�turuldu");
					password = newPassword;
				}
			}else if(response.equals("hay�r")){
				System.out.println("Tekrar giri� yap�n�z");
			}else {
				System.out.println("Ge�ersiz!");
			}
		}
		input.close();

	}

}
