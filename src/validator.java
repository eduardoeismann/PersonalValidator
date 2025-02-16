
public class validator {
	public static void main(String[] args) {
		Integer v = args[0].hashCode();
		
		try {
			System.out.println(
				valid(
					v.toString().charAt(3),
					v.toString().charAt(7),
					v.toString().charAt(5)
				)
			);
		} catch(Throwable t) {
			System.out.println("false");
		}
	}
	
	private static Boolean valid(char x, char y, char z) {
		int check = 0;
		
		try {
			check += x == '7' ? 1 : 0; 
			check += ((int) y - (int) z) == 7 ? 1 : 0;
		} catch(Throwable t) {
			return false;
		}
		
		return (check == 2);
	}
}
