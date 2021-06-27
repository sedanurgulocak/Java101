package methodByPattern;

import java.util.Scanner;

public class MethodByPattern {

	static void metot(int number, int i, boolean status) {
        if (number <= i) {
            System.out.print(number + " ");
            if (number > 0 && !status) {
                metot(number-5,i,false);
            }else{
                metot(number+5,i,true);
            }
        }
    }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("N sayisi : ");
        int sayi = input.nextInt();
        int a = sayi;
        metot(sayi,a,false);
        input.close();

	}

}
