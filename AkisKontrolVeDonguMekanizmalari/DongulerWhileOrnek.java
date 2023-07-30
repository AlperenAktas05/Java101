import java.util.Scanner;

public class DongulerWhileOrnek {
	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		System.out.println("Kac yildiz istiyorsunuz?");
		int sayi=k.nextInt();
		
		int i=1;
		
		while(i<=sayi) {
			int j=0;
			while(j<i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		int top=0;
		while(true) {
			System.out.println("Bir sayi giriniz");
			int sayi2=k.nextInt();
			
			if(sayi2==0) {
				break;
			}
			
			top=top+sayi2;
		}
		
		System.out.println("Toplam="+top);
	}
}
