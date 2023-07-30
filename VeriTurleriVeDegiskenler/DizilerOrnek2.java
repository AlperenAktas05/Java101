import java.util.Arrays;

public class DizilerOrnek2 {
	public static void main(String[] args) {
		
		int list[]= {1,2,3,4,5};
		int toplam=0;
		
		for(int i=0; i<list.length; i++) {
			toplam=toplam+list[i];
		}
		System.out.println(toplam);
		
		int list2[]=new int[list.length];
		
		for(int i=0; i<list2.length; i++) {
			list2[i]=list[i];
		}
		
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list2));
		
		//-------------------------------------------------------------------------------------------
		
		String list3[]= new String[3];
		list3[0]="Alperen";
		list3[1]="Mert";
		list3[2]="Selen";
		
		for(int i=list3.length-1; i>=0; i--) {
			System.out.println(list3[i]);
		}
		
		//-------------------------------------------------------------------------------------------
		
		int list4[]= {1,2,3};
		System.out.println(Arrays.toString(list4));
		
		int list5[]=new int[list4.length];
		list5=list4;  //Bellekte list5 silindi ve tamamen list4 oldu
		System.out.println(Arrays.toString(list5));
		
		list4[0]=4;
		System.out.println(Arrays.toString(list5));
	}
}
