import java.util.Scanner;

public class KosulveDongulerOrnek4 {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Hosgeldiniz. Yaricap giriniz");
		int r=k.nextInt();
		
		System.out.println("Dairenin cevresi="+(2*Math.PI*r));
		System.out.println("Dairenin alani="+(Math.PI*r*r));
		
		//---------------------------------------------------//
		
		System.out.println("Hosgeldiniz. Karenin bir kenarini giriniz");
		int kenar=k.nextInt();
		
		System.out.println("Karenin cevresi="+(4*kenar));
		System.out.println("Karenin alani="+(Math.pow(kenar, 2)));
		
		k.close();
	}
}
