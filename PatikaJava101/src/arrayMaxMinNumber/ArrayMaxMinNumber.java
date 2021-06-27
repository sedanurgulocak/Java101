package arrayMaxMinNumber;

import java.util.Arrays;

public class ArrayMaxMinNumber {

	public static void main(String[] args) {
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		int number = 9;
		System.out.println("Dizi: " + Arrays.toString(list));
		Arrays.sort(list);
		System.out.println("Sayi: " + number);
		
		for (int i = 0; i < list.length; i++) {
            if (list[i] > number) {
                System.out.println("En yakin minimum sayi: " + list[i - 1]);
                System.out.println("En yakin maximum sayi: " + list[i]);
                break;
            }
        }
    
	}

}
