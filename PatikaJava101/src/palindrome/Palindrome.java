package palindrome;

public class Palindrome {
	
	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		
		//reverseNumber'ın ilk değeri sıfır. Ters çevrilecek sayının en baştaki basamağını elde etmek için (0 * 10)+ lastNumber
		//yapılırsa ilk sayı başa atılmış olur.
		
		while(temp != 0) {
			lastNumber = temp % 10; //Basamak değeri alınır
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10; //Basamak silinir
		}
		
		if(number == reverseNumber)
			return true;
		else
			return false;
		
		
		//0 * 10 = 0 + 7 = 7
		//7 * 10 = 70 + 4 = 74
		//74 * 10 =740 + 2 = 742
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrom(247));
		
	}

}
