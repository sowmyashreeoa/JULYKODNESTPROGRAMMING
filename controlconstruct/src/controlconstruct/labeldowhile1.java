package controlconstruct;

public class labeldowhile1 {
	public static void main(String[] args) {
		int i=1;
		rajini:do {
			int j=1;
			tamanna:do{
				System.out.print("*");
				j++;
				break tamanna;
		   }while(j<=5);
		System.out.println();
		i++;
	}while(i<=5);
}
}
