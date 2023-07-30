import java.util.Random;
import java.util.Scanner;

public class KosulveDongulerOrnek {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Toplama makinesine hosgeldiniz. Cikmak icin 0'a basiniz");
		
		int top=0;
		
		while(true) {
			System.out.println("Bir sayi giriniz");
			int sayi=k.nextInt();
			
			if(sayi==0) {
				break;
			}
			
			top=top+sayi;
		}
		
		System.out.println("Toplam="+top);
		
		//------------------------------------------------//
		
		System.out.println("Hosgeldiniz. Parola giriniz");
		String parola="12345";
		
		while(true) {
			String input=k.next();
			
			if(!input.equals(parola)) {
				System.out.println("Tekrar deneyiniz");
			}
			else {
				break;
			}
		}
		
		System.out.println("Giris basarili");
		
		//---------------------------------------------//
		
		System.out.println("Hosgeldiniz. Kac sayi istiyorsunuz");
		double eleman=k.nextInt();
		double toplam=0;
		
		Random r=new Random();
		
		System.out.println("Olusturulan rastgele sayilar:");
		
		for(int i=0; i<eleman; i++) {
			int rastgele=r.nextInt(100);
			System.out.print(rastgele+",");
			toplam=toplam+rastgele;
		}
		
		System.out.println();
		System.out.println("Ortalama="+(toplam/eleman));
		
		k.close();
	}
}
