// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//Number of Group Members
		//int numDiners = Integer.parseInt(args[0]);
		//Group names
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2]; 
		//Price
		double price = Double.parseDouble(args[3]);

		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + Math.ceil(price / 3) + " Shekels each");
	}
}
