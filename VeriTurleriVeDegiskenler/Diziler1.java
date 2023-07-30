import java.util.Arrays;

public class Diziler1 {
	public static void main(String[] args) {
		
		int list[]=new int[10];
		System.out.println(Arrays.toString(list));  //indisler boş olduğu için 0 gösterilir
		list[5]=10;
		System.out.println(list[5]);
		
		int list2[]= {1,2,3,4,5};
		System.out.println(list2[0]);
		System.out.println(list2.length);
		
		String list3[]=new String[3];
		System.out.println(Arrays.toString(list3));  //indisler boş olduğu için null gösterilir
		list3[0]="Alperen";
		list3[1]="Mert";
		System.out.println(Arrays.toString(list3));
		
		//belirli bir veri tipinin dizisine başka bir veri tipi girilemez.
		//dizinin boyutu aşılmamalı
		
	}
}
