package primeNumberRecursive;

import java.util.Scanner;

public class PrimeNumberRecursive {
	
	static boolean prime(int number, int i) {
		
		if(number < 2) {
			return false;
		} 
		if(number == 2) {
			return true;
		}
		if(number % i == 0) {
			return false;
		}
		if(number < i*i) {
			return true;
		}
		return prime(number, i+1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Sayý giriniz :");
        int number = scan.nextInt();
        
        if(prime(number, 2)) {
        	System.out.println("Sayisi asal");
        }else {
        	System.out.println("Sayisi asal deðil");
        }
        scan.close();

	}

}
