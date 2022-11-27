
public class SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// soma dos números
		int n = 3;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("A soma é: " + sum);

		// número primos
		int x = 3;
		boolean isPrime = true;

		if (x == 0 || x == 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		System.out.println(x + " é primo? --> " + isPrime);

	}

}
