import java.util.Scanner;

public class KosulluDallanmaOrnek {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Bir not giriniz");
		int not=k.nextInt();
		
		if(not<=100 && not>=85) {
			System.out.println("AA");
		}
		else if(not<85 && not>=70) {
			System.out.println("BB");
		}
		else if(not<70 && not>=50) {
			System.out.println("CC");
		}
		else if(not<50 && not>=0) {
			System.out.println("FF");
		}
		else {
			System.out.println("Lutfen 0-100 arasi bir sayi giriniz");
		}
	}
}
