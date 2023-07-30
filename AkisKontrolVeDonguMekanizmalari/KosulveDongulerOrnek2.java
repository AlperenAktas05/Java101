import java.util.Scanner;

public class KosulveDongulerOrnek2 {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Hosgeldiniz. Vize notunuzu giriniz");
		double vize=k.nextInt();
		System.out.println("Final notunuzu giriniz");
		double finall=k.nextInt();
		
		double ort=vize*0.4+finall*0.6;
		
		if(ort<50) {
			System.out.println("Ortalamaniz="+ort+" Kaldiniz");
		}
		else {
			System.out.println("Ortalamaniz="+ort+" Gectiniz");
		}
		
		//------------------------------------------------------//
		
		System.out.println("Hosgeldiniz. Kac adet sayi girilecek?");
		int eleman=k.nextInt();
		
		int list[]=new int[eleman];
		
		for(int i=0; i<list.length; i++) {
			System.out.println((i+1)+". elemani giriniz");
			System.out.print((i+1)+") ");
			list[i]=k.nextInt();
		}
		System.out.println("------------------------------");
		for(int i=0; i<list.length; i++) {
			
			if(list[i]%2==0) {
				System.out.println((i+1)+") "+list[i]+" cift");
			}
			
			else {
				System.out.println((i+1)+") "+list[i]+" tek");
			}
		}
		
		k.close();
	}
}
