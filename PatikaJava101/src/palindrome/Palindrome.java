package palindrome;

public class Palindrome {
	
	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		
		//reverseNumber'�n ilk de�eri s�f�r. Ters �evrilecek say�n�n en ba�taki basama��n� elde etmek i�in (0 * 10)+ lastNumber
		//yap�l�rsa ilk say� ba�a at�lm�� olur.
		
		while(temp != 0) {
			lastNumber = temp % 10; //Basamak de�eri al�n�r
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
