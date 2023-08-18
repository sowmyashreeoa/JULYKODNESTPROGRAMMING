package controlconstruct;

public class labeldowhile2 {
public static void main(String[] args) {
	int i=1;
	rajini:do {int j=1;
		tamanna:do {
		System.out.print("*");
		j++;
	}while(j<=5);
		System.out.println();
		i++;
		break rajini;
}while(i<=5);
}
}
