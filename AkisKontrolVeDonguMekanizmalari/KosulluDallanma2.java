import java.util.Scanner;

public class KosulluDallanma2 {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		int sayi=k.nextInt();
		
		if(sayi>0) {
			System.out.println("Sayi pozitiftir");
		}
		else {
			System.out.println("Sayi negatiftir");
		}
		
		System.out.println("Program bitti");
		
		
		System.out.println("Bir sayi giriniz");
		int sayi2=k.nextInt();
		
		if(sayi2%2==0) {
			System.out.println("Sayi cifttir");
		}
		else {
			System.out.println("Sayi tektir");
		}
		
		System.out.println("Program 2 bitti");
	}
}
