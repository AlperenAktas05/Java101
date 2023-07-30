
public class MantiksalOperatorler {
	public static void main(String[] args) {
		
		boolean kontrol=true;
		
		System.out.println(kontrol & true);  //sadece ikisi de true olursa true olur
		System.out.println(kontrol & false);
		
		System.out.println(kontrol | true);
		System.out.println(kontrol | false);  //sadece biri true olursa true olur
		
		System.out.println(kontrol && true);  
		System.out.println(kontrol && false);
		
		System.out.println(kontrol || true);
		System.out.println(kontrol || false);
	}
}
