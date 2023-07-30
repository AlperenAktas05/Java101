import java.util.Scanner;

public class KosulveDongulerOrnek3 {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Hosgeldiniz. Bir kelime giriniz");
		String kelime=k.next();
		
		String top="";
		for(int i=kelime.length()-1; i>=0; i--) {
			top=top+kelime.charAt(i);
		}
		
		System.out.println("Kelimenin tersi: "+top);
		
		//-------------------------------------------//
		
		System.out.println("Hosgeldiniz. Bir sayi giriniz");
		int sayi=k.nextInt();
		int faktoriyel=1;
		
		for(int i=1; i<=sayi; i++) {
			faktoriyel=faktoriyel*i;
		}
		
		System.out.println("Sayinin faktoriyeli= "+faktoriyel);
		
		k.close();
	}
}
