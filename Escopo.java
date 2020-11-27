public class Escopo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		boolean podeDirigir = idade >= 18;
		String nomePai = "";
		
		if (!podeDirigir) {
			System.out.print("Nome do Pai: ");
			
			nomePai = entrada.next();
		}
		
		System.out.println("Você pode dirigir?");
		
		if (podeDirigir) {
			System.out.println("Sim, claro");
		} else {
			System.out.println("Não, se fizer isso seu Pai " + nomePai + "vai preso");
		}
	}
}