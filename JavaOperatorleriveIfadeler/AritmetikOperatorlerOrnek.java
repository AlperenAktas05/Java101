
public class AritmetikOperatorlerOrnek {
	public static void main(String[] args) {
		
		int sayi1=10;
		double sayi2=20;
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1-sayi2);
		System.out.println(sayi1*sayi2);
		System.out.println(sayi1/sayi2);
		
		System.out.println(5%2);  //kalani verir
		
		int sayi3=10;
		sayi3=sayi3+2;  //sayi+=3
		System.out.println(sayi3);
		
		int sayi4=30;
		System.out.println(sayi4++);  //sayi4'u yazar ve 1 arttirir
		System.out.println(++sayi4);  //sayi 4'un 1 arttirilmis halini yazar
		System.out.println(sayi4);
	}
}
