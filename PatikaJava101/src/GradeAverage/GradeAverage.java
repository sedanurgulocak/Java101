package GradeAverage;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		int maths, physics, chemistry, turkish, history, music;
        Scanner input = new Scanner (System.in);
        System.out.println("Maths grade :");
        maths = input.nextInt();
        System.out.println("Physics grade :");
        physics = input.nextInt();
        System.out.println("Chemistry grade :");
        chemistry = input.nextInt();
        System.out.println("Turkish grade :");
        turkish = input.nextInt();
        System.out.println("History grade :");
        history = input.nextInt();
        System.out.println("Music grade :");
        music = input.nextInt();
        int total = (maths + physics + chemistry + turkish + history + music);
        double result = total / 6.0;
        String results = result >= 50 ? "Sýnýfý geçti" :"Sýnýfta Kaldý";
        System.out.println(results);
        input.close();

	}

}
