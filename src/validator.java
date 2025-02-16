
public class validator {
	public static void main(String[] args) {
		Integer v = args[0].hashCode();
		valid(
				v.toString().charAt(3),
				v.toString().charAt(7),
				v.toString().charAt(5)
				
		);
	}
	
	private static Boolean valid(char x, char y, char z) {
		int check = 0;
		
		try {
			check += x == '7' ? 1 : 0; 

			check += ((int) y - (int) z) == 7 ? 1 : 0;
			
			
		} catch(Throwable t) {
			System.out.println("FALSE");
			return false;
		}
		
		if(check == 2) {
			System.out.println("TRUE");
			return true;
		} else {
			System.out.println("FALSE");
			return false;
		}
	}
}
