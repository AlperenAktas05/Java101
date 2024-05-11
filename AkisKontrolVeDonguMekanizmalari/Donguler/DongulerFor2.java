import java.util.Scanner;

public class DongulerFor2 {
	public static void main(String[] args) {
		
		int list[]= {1,2,3,4,5};
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		//---------------------------------------------//
		Scanner k=new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		int sayi=k.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int sayi2=k.nextInt();
		System.out.println("----------------------");
		
		for(int i=sayi; i<=sayi2; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//---------------------------------------------------//
		System.out.println("Dizi kac elemanli olacak?");
		int eleman=k.nextInt();
		
		String list2[]=new String[eleman];
		
		for(int i=0; i<list2.length; i++) {
			System.out.println("1. Eleman:");
			list2[i]=k.next();
		}
		
		for(int i=0; i<list2.length; i++) {
			System.out.print(list2[i]+",");
		}
		k.close();
	}
}
