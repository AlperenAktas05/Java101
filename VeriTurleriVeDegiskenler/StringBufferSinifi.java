import java.util.Scanner;

public class StringBufferSinifi {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		StringBuffer mesaj=new StringBuffer();
		
		System.out.println("Adinizi Giriniz");
		mesaj.append(k.next());
		
		System.out.println("Soyadinizi Giriniz");
		mesaj.append(k.next());
		
		System.out.println(mesaj.toString());
		
		k.close();
	}
}
