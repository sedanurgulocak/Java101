package elementSorting;

import java.util.Arrays;
import java.util.Scanner;

public class ElementSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutu: ");
        int x = input.nextInt();
        System.out.println("Dizi elemanlarý: ");
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". Elemaný: ");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        input.close();
	}

}
