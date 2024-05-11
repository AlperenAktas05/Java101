import java.util.Scanner;

public class DongulerForEach {
	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("10 adet sayi giriniz");
		int list[]=new int[10];
		
		for(int i=0; i<10; i++) {
			list[i]=k.nextInt();
		}
		System.out.println("------------------");
		for(int i : list) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		k.close();
	}
}
