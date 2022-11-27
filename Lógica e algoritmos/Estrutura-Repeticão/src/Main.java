
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 10;
		int max = 100;

		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		//TABUADA
		System.out.println("\n");
		System.out.println("*****TABUADA*****");
		int n = 3;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
		
		

	}

}
