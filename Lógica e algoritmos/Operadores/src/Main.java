
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//par ou impar
		int n = 2;
		
		if (n % 2 == 0) {
			System.out.println("O número " + n + " é par");
		} else {
			System.out.println("O número " + n + " é impar");
		}
		
		// calcular multa
		int speed = 109;
		double amount;
		
		if (speed <= 80) {
			amount = 0;
		} else if(speed > 80 && speed <= 100) {
			amount = 67;
		} else {
			amount = 70 + (speed - 100) * 10;
		}
		System.out.println("Valor de multa = R$ " + amount);
		
		//jogo do dado
		int d1 = (int) (Math.random() * 6) + 1;
		int d2 = (int) (Math.random() * 6) + 1;
		
		System.out.println("D1 = " + d1);
		System.out.println("D2 = " + d2);
		
		int sum = d1 + d2;
		
		if (d1 == d2) {
			sum  = sum * 2;
		}
		System.out.println("Casas = " + sum);
		
	}

}
