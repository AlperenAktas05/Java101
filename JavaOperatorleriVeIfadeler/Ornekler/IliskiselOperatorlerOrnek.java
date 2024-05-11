import java.util.*;

public class IliskiselOperatorlerOrnek {
	public static void main(String[] args) {
		
		boolean kontrol= 9==9;
		System.out.println(kontrol);
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("Kelime Giriniz");
		String kelime1=k.next();
		
		System.out.println("Kelime Giriniz");
		String kelime2=k.next();
		
		System.out.println(kelime1.equals(kelime2));
		
		
	}
}
