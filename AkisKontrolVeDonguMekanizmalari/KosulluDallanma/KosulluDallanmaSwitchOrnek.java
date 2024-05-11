import java.util.Scanner;

public class KosulluDallanmaSwitchOrnek {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		Double sayi1,sayi2;
		char islem;
		
		System.out.println("Birinci sayiyi giriniz");
		sayi1=k.nextDouble();
		
		System.out.println("Operator Giriniz");
		islem=k.next().charAt(0);
		
		System.out.println("Ikinci sayiyi giriniz");
		sayi2=k.nextDouble();
		
		switch(islem) {
		case '+':
			System.out.println("Sonuc="+(sayi1+sayi2));
			break;
		case '-':
			System.out.println("Sonuc="+(sayi1-sayi2));
			break;
		case '*':
			System.out.println("Sonuc="+(sayi1*sayi2));
			break;
		case '/':
			System.out.println("Sonuc="+(sayi1/sayi2));
			break;
			default:
				System.out.println("Yanlis operator girdiniz");
		}
	}
}
