
public class Diziler2 {
	public static void main(String[] args) {
		
		int list[][]=new int[2][3];
		list[0][0]=1;
		list[0][1]=2;
		list[0][2]=3;
		
		list[1][0]=4;
		list[1][1]=5;
		list[1][2]=6;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(list[i][j]);
			}
		}
		
		String list2[][]=new String[2][2];
		list2[0][0]="Alperen";
		list2[0][1]="Mert";
		
		list2[1][0]="Cengiz";
		list2[1][1]="Selen";
		
		for(int i=0; i<list2.length; i++) {
			for(int j=0; j<list2[i].length; j++) {
				System.out.println(list2[i][j]);
			}
		}
		
	}
}
