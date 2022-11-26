
public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean
		System.out.println(2 == 2);
		System.out.println(3 == 2);
		System.out.println(3 > 2);
		
		boolean b1 = 4 != 4;
		System.out.println(b1);
		
		boolean b2 = 4 <= 4;
		System.out.println(b2);
		
		
		//estrutura de decisão
		int idade = 25;
		int pontos = 5;
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
			pontos = pontos * 2;
		}
		System.out.println("Fim. pontos: " + pontos);
		
		//if else
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		

	}

}
