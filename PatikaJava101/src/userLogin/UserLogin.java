package userLogin;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		String userName, password, response, newPassword;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanýcý adý: ");
		userName = input.nextLine();
		System.out.println("Þifre: ");
		password = input.nextLine();
		
		if(userName.equals("seda") && password.equals("12345")) {
			System.out.println("Giriþ baþarýlý");
			
		}else {
			System.out.println("Bilgileriniz yazlýs! Þifrenizi sýfýrlamak istermisiniz?");
			response = input.nextLine();
			if(response.equals("evet")) {
				System.out.println("Yeni þifre: ");
				newPassword = input.nextLine();
				if(newPassword.equals("password") || newPassword.equals("12345")) {
					System.out.println("Yeni þifre eskisiyle ve hatalý giriþle ayný olamaz!");
				}else {
					System.out.println("Þifre oluþturuldu");
					password = newPassword;
				}
			}else if(response.equals("hayýr")){
				System.out.println("Tekrar giriþ yapýnýz");
			}else {
				System.out.println("Geçersiz!");
			}
		}
		input.close();

	}

}
