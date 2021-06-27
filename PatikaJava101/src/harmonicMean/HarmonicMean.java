package harmonicMean;

public class HarmonicMean {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + (double)1 / numbers[i];
        }

        System.out.println("Sonuc: " +((double) numbers.length/sum));

	}

}
