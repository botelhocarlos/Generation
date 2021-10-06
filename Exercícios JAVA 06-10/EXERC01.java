package vetormatriz;

public class EXERC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,0,5,-2,-5,7};
		int soma,i;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("A soma entre os valores das posições A[0], A[1] e A[5] do vetor é: "+soma);
		
		A[4] = 100;
		
		for (i=0; i<6; i++) {
			System.out.printf("%d\n",A[i]);
		}
	}
}
