package ebobEkok;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int bigNumber, smallNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("n1 sayýsýný giriniz: ");
		int n1 = input.nextInt();
		System.out.print("n2 sayýsýný giriniz: ");
		int n2 = input.nextInt();
		
		if(n1 > n2) {
			bigNumber = n1;
			smallNumber = n2;
		}else {
			bigNumber = n2;
			smallNumber =n1;
		}
		int ebob = 1;
		
		int i=1;
		while(i<= smallNumber) { 
			if(smallNumber % i == 0  && bigNumber % i == 0) {
				ebob = i;
			}
			i++;
		}
		System.out.println("Ebob: "+ebob);
		System.out.println("-------------");
		
		//Kýsa döngü
		int j=smallNumber;
		while(j >= 1) {
			if(smallNumber % j == 0 && bigNumber % j == 0) {
				ebob = j;
				System.out.println("Ebob: "+ebob);
				break;
			}
			j--;
		}
		
		input.close();
		
		System.out.println("-------------");
		
		int k = 1;
		while(k <= (smallNumber * bigNumber)) {
			if(k % smallNumber == 0 && k % bigNumber == 0) {
				System.out.println("Ekok: " + k);
				break;
			}
			k++;
		}
		
		
	}

}
