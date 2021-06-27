package exponentiationRecursive;

import java.util.Scanner;

public class ExponentiationRecursive {
	
	static int calculate(int base, int exponent) {
		
		if(exponent == 0) {
			return 1;
		}else {
			return (base * calculate(base, exponent-1));
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Taban deðeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs deðeri giriniz :");
        int exponent = scan.nextInt();
        scan.close();
        System.out.println("Sonuc: " + calculate(base, exponent));
        
        
	}

}
