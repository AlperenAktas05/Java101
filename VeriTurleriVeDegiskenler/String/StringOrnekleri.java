import java.util.*;

public class StringOrnekleri {
	public static void main(String[] args) {
		
		String str="Alperen";
		String str2="Alperen";
		System.out.println(str.equals(str2));
		str2="ALPEREN";
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str+" "+str2);
		
		Scanner k=new Scanner(System.in);
		System.out.println("Bir mesaj giriniz");
		String mesaj=k.next();
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.charAt(3));
		System.out.println(mesaj.length());
		System.out.println(mesaj.substring(3));
		System.out.println(mesaj.isEmpty());
		System.out.println(mesaj.replace('a','e'));
		System.out.println(mesaj.indexOf("er"));
		System.out.println(mesaj.trim());
		
		k.close();
	}
}