import java.util.Date;
import java.util.Scanner;

public class DongulerWhile {
	public static void main(String[] args) throws InterruptedException {
		Scanner k=new Scanner(System.in);
		
		int i=0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		/*while(true) {  //sonsuz dongu
			System.out.println(new Date());
			Thread.sleep(1000);
		}*/
		
		
		while(true) {
			System.out.println("Bir sayi giriniz");
			int sayi=k.nextInt();
			System.out.println("Sayinizin karesi="+Math.pow(sayi, 2));
		}
		
	}
}
