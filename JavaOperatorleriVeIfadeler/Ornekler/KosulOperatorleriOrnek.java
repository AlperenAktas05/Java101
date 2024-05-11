import java.util.*;

public class KosulOperatorleriOrnek {
	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		if(sayi1>sayi2) {
			System.out.println("Sayi1, sayi2'den buyuktur");
		}
		else{
			System.out.println("Sayi1, sayi2'den kucuktur");
		}
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("Birinci Sayiyi Giriniz");
		int sayi3=k.nextInt();
		System.out.println("Ikinci Sayiyi Giriniz");
		int sayi4=k.nextInt();
		
		if(sayi3>sayi4) {
			System.out.println("Birinci sayi daha buyuktur");
		}
		else {
			System.out.println("Ikinci sayi daha buyuktur");
		}
	}
}
