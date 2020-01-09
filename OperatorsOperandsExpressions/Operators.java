public class Operators {
	
	public static void main(String[] args) {
		// [*, +, -, =, %, ==, !==, ===. <, >, <=, >=]
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		result = result - 1;
		System.out.println("3 - 1 = " + result);
		System.out.println("Previous result was" + previousResult);
		
		result = result * 10; // 2 * 10 = 20
		System.out.println("2 * 10 = " + result);
		
		result = result / 5; // 20 /5 = 4
		System.out.println("20 / 5 = " + result);
		
		result = result % 3; // Remainer of (4 % 3) = 1
		System.out.println("4 % 3" + result);
		
		result++; // Adiciona 1, logo neste momento result será 2
		
	}
}