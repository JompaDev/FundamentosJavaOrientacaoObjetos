public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		long x = 10;
		// casting conversão
		int y = (int) x;
		System.out.println(y);
		
		int m = 102344;
		long n = m;
		System.out.println(n);
		
		double a = 20.5;
		float b = (float) a;
		System.out.println(b);
		
		float c = 934.5f;
		double d = c;
		System.out.println(d);
		
		double largura = 100.37;
		int tamanho = (int) largura;
		System.out.println(tamanho);
	}
}