package calculateKdv;

import java.util.Scanner;

public class CalculateKdv {

	public static void main(String[] args) {
		double amount, kdv, kdvAmount;
        Scanner input = new Scanner (System.in);
        System.out.println("Amount :");
        amount = input.nextDouble();
        if(amount >0 && amount <1000){
            kdv = 0.18;
            kdvAmount = amount * kdv;
            System.out.println(kdvAmount);
        }else if(amount>=1000){
            kdv= 0.08;
            kdvAmount = amount * kdv;
            System.out.println(kdvAmount);
        }else{
            System.out.println("Sýfýrdan büyük deðer giriniz");
        }
        input.close();

	}

}
