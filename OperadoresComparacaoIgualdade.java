public class OperadoresComparacaoIgualdade {
	
	public static void main(String[] args) {
		
		// Comparação: > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
		// Igualdade: == (igual) e != (diferente)
		
		int a = 10;
		int b = 5;
		int c = 2;
		
		boolean maior = b > a;
		boolean maiorIgual = b >= a;
		boolean menor = a < b;
		boolean menorIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;
		
		System.out.println(maior); //false
		System.out.println(maiorIgual); //false
		System.out.println(menor); //false
		System.out.println(menorIgual); //true
		System.out.println(igual); //false
		System.out.println(diferente); //true
		
		boolean bloqueado = true;
		bloqueado = !bloqueado;
		System.out.println(bloqueado);
	}
}