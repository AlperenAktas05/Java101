import java.util.Arrays;

public class DizilerOrnek3 {
	public static void main(String[] args) {
		
		int list[]= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(list));  //Diziyi yazdirir
		System.out.println(Arrays.binarySearch(list, 3)); //degerin hangi indiste oldugunu verir
		
		int kopya[]= Arrays.copyOf(list, 3);  //verilen degere kadar olanları yeni diziye atar
		System.out.println(Arrays.toString(kopya));
		
		int kopya2[]= Arrays.copyOfRange(list, 0, 2);  //verilen degerler arasını yeni diziye atar
		System.out.println(Arrays.toString(kopya2));
		
		Arrays.fill(list, 10);  //Dizinin elemanlarina verilen degeri atar
		System.out.println(Arrays.toString(list));
		
		int list2[]= {42,26,45,75,98};
		Arrays.sort(list2);  //Diziyi kucukten buyuge siralar
		System.out.println(Arrays.toString(list2));
	}
}
