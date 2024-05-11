import java.util.*;

public class Ornek {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Bir Sayi Giriniz");
		int sayi1=k.nextInt();
		
		System.out.println(sayi1%2==0 ? "Sayi cift" : "Sayi Tek");
		
		//----------------------------------------------------------//
		
		String parola="1234";
		
		System.out.println("Parola Giriniz");
		String giris=k.next();
		
		System.out.println(parola.equals(giris) ? "Giris yapildi" : "Hatali parola");
	}
}
