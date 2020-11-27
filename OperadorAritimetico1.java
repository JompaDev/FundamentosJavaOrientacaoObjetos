public class OperadorAritimetico1 {
	
	public static void main(String[] args) {
		int notaAluno1 = 99;
		int notaAluno2 = 80;
		int notaAluno3 = 53;
		
		int totalGeral = notaAluno1 + notaAluno2 + notaAluno3;
		System.out.println(totalGeral);
		
		int mediaGeral = totalGeral / 3;
		System.out.println("Media geral: " + mediaGeral);
	}
}