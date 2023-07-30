import java.util.*;

public class KosulOperatorleri {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		int yas;
		
		System.out.println("Lutfen Yasinizi Giriniz");
		yas=k.nextInt();
		
		System.out.println(yas>=18 ? "Ehliyet alabilirsiniz" : "Ehliyet alamazsiniz");
		
		k.close();
	}
}
