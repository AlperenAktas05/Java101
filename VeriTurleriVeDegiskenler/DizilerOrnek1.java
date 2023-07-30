import java.util.*;

public class DizilerOrnek1 {
	public static void main(String[] args) {
		// uzunlugunu ve elemanlarini klavyeden girdigimiz dizinin ortalamasını yazdıran program
		Scanner k=new Scanner(System.in);
		
		System.out.print("Dizi Uzunlugunu Giriniz: ");
		int diziUzunlugu=k.nextInt();
		
		int list[]=new int[diziUzunlugu];
		
		for(int i=0; i<list.length; i++) {
			System.out.print((i+1)+". Elemani Giriniz: ");
			list[i]=k.nextInt();
		}
		
		System.out.println(Arrays.toString(list));
		
		int toplam=0;
		
		for(int i=0; i<list.length; i++) {
			toplam=toplam+list[i];
		}
		
		System.out.println("Dizinin Ortalamasi="+(toplam/list.length));
		
		k.close();
	}
}
