
public class Teste {

	public static void main(String[] args) {
		System.out.println("Hello Git");
		
		double p1 = 4;
		double p2 = 5;
		double notaFinal = (p1 + p2) /2;
		
		if (notaFinal > 6){
			System.out.println("Aprovado com a nota: " + notaFinal);
		}else{
			System.out.println("Reprovado com a nota: " + notaFinal);
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Valor da variável: " + i);
		}
	}
}
