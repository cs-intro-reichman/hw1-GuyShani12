// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		System.out.println("Please Enter Your Names: ");
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2]; 
		System.out.println("Please Enter Total Price: ");
		double price =  Double.parseDouble(args[3]);
		
		System.out.println(name1 + "," + name2 + "," + name3 + "you need to pay: " + Math.ceil(price / 3));

	}
}
