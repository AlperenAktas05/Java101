import java.util.Scanner;

public class DongulerWhileOrnek2 {
	public static void main(String[] args) {
		
		int sayi=0;
		
		while(sayi<=100) {
			if(sayi%2==0) {
				System.out.println(sayi);
			}
			sayi++;
		}
		
		//--------------------------------------------//
		Scanner k=new Scanner(System.in);
		int enk=Integer.MAX_VALUE;  //99999999
		int enb=Integer.MIN_VALUE; //0
		int sayac=0;
		
		while(sayac<10) {
			System.out.println("Bir sayi giriniz");
			int sayi2=k.nextInt();
			
			if(sayi2<enk) {
				enk=sayi2;
			}
			
			if(sayi2>enb) {
				enb=sayi2;
			}
			
			sayac++;
		}
		
		System.out.println("En buyuk sayi="+enb);
		System.out.println("En kucuk sayi="+enk);
		//--------------------------------------------------//
		
		double top=0;
		double eleman=0;
		
		while(true) {
			System.out.println("Bir sayi giriniz");
			int sayi3=k.nextInt();
			
			if(sayi3==0) {
				break;
			}
			
			top=top+sayi3;
			eleman++;
		}
		
		System.out.println("Sayilarin ortalamasi="+(top/eleman));
		//----------------------------------------------------------//
		
		int negatif=0;
		int pozitif=0;
		
		while(true) {
			System.out.println("Bir sayi giriniz");
			int sayi4=k.nextInt();
			
			if(sayi4==0) {
				break;
			}
			
			if(sayi4<0) {
				negatif++;
			}
			
			if(sayi4>0) {
				pozitif++;
			}
		}
		
		System.out.println("Pozitif sayilar "+pozitif+" tanedir");
		System.out.println("Negatif sayilar "+negatif+" tanedir");
		//---------------------------------------------------------//
		k.close();
		
	}
}
