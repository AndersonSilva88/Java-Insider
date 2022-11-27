
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 20;
		int i = min;
		
		while (i <= max) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println("\n");
		
		int n = 4;
		int j = 1;
		
		while(j <= 10) {
			System.out.println(n + " X " + j + " = " + n * j);
			j++;
		}
		
		System.out.println("\n");
		
		//break
		while(true) {
			int x = (int) (Math.random() * 100) +1;
			System.out.println(x);
			if (x > 50) {
				break;
			}
		}
		System.out.println("Encontrou número alto!!");
	}

}
