package frequencyOfElements;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int counter=0;
        
        int[]array={10,5,7,8,45,9,10,45,78,32};
                
        Scanner input = new Scanner(System.in);
        System.out.println("Dizide Aratmak Ýstediðiniz Sayýyý Giriniz");
        int search=input.nextInt();
        
        for(int i=0;i<array.length;i++){
            if(search==array[i]){
                
                counter=counter+1;
            }  
        
    }
        System.out.println("Dizide Aradýðýnýz Sayý    : "   + search);
        System.out.println("Dizide Tekrar Edilme Sayýsý : " + counter);
        input.close();
    }

}
