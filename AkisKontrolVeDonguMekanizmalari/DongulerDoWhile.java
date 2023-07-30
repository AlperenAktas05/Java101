import java.util.Scanner;

public class DongulerDoWhile {
	public static void main(String[] args) {
		
		int i=0;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		Scanner k=new Scanner(System.in);
		String sifre="";
		
		do {
			System.out.println("Parola giriniz");
			sifre=k.nextLine();
		}while(!sifre.equals("123"));
		
		System.out.println("Hosgeldiniz");
		
		k.close();
	}
}
