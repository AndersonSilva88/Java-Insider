
public class LogicaOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 15;
		String categoria;
		
		if (idade > 0 && idade <= 12) {
			categoria = "Criança";
		} else if (idade > 12 && idade <= 18) {
			categoria = "Adolescente";
		} else if (idade > 18) {
			categoria = "Adulto";
		} else {
			categoria = "Desconhecido";
		}

		System.out.println("Categoria para " + idade + " anos: " + categoria);
	}

}
