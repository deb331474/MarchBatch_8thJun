package StringAndCharArray;

public class CheckingForValidJAvaIdentifier {

	public static void main(String[] args) {

		String identifier1 = "variable123";
        String identifier2 = "123variable";
        String identifier3 = "my-variable";
        
        System.out.println("is valid Java Identifiers ? "+Character.isJavaIdentifierPart(identifier1.charAt(0)));
		
	}

}
