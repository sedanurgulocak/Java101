package primeNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++) {
			int check = 0;
			for(int j=2; j < i; j++) {
				if(i % j == 0 ) {
					check = 1;
					break;
				}
			}
			if(check == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
