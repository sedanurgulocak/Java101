package PassingGrade;

import java.util.Scanner;

public class PassingGrade {

	public static void main(String[] args) {
		int maths, physics, chemistry, turkish, music, totalLesson=0, total=0, average=0;
		
        Scanner input = new Scanner (System.in);
        System.out.println("Maths grade :");
        maths = input.nextInt();
        System.out.println("Physics grade :");
        physics = input.nextInt();
        System.out.println("Chemistry grade :");
        chemistry = input.nextInt();
        System.out.println("Turkish grade :");
        turkish = input.nextInt();
        System.out.println("Music grade :");
        music = input.nextInt();

        if(maths>0 && maths<=100) {
        	totalLesson++;
        	total = total + maths;
        }
        if(physics>0 && physics<=100) {
        	totalLesson++;
        	total = total + physics;
        }
        if(chemistry>0 && chemistry<=100) {
        	totalLesson++;
        	total = total + chemistry;
        }
        if(turkish>0 && turkish<=100) {
        	totalLesson++;
        	total = total + turkish;
        }
        if(music>0 && music<=100) {
        	totalLesson++;
        	total = total + music;
        }
        if(totalLesson != 0) {
        	average = total/totalLesson;
        	if(average >= 55) {
        		System.out.println("Geçtiniz");
        	}else {
        		System.out.println("Kaldýnýz");
        	}
        }else {
        	System.out.println("Geçersiz not giriþi");
        }
        
        System.out.println("Ortalama : " + average);
        input.close();
       

	}

}
