import java.util.Scanner;

public class KosulluDallanma3 {
	public static void main(String[] args) {
		
		int sayi=25;
		
		if(sayi<100) {
			System.out.println("Sayi 100'den kucuktur");
			
			if(sayi>50) {
				System.out.println("Sayi 50'den buyuktur");
			}
		}
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		int sayi2=k.nextInt();
		
		if(sayi2<10 && sayi2>=0) {
			System.out.println("Sayi 1 basamakli");
		}
		else if(sayi2<100 && sayi2>=10) {
			System.out.println("Sayi 2 basamakli");
		}
		else if(sayi2<1000 && sayi2>=100) {
			System.out.println("Sayi 3 basamakli");
		}
		else {
			System.out.println("Sayi 3 basamaktan fazla");
		}
	}
}
