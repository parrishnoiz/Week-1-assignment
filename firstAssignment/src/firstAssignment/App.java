package firstAssignment;

public class App {

	public static void main(String[] args) {
		double applePrice = 1.67;
		double bananaPrice = 1.78;
		
		double amountInWallet = 45.63;
		double amountInWallet2 = 54.35;
		
		int numberOfFriends = 6;
		int numberOfFriends2 = 20;
		
		int ageInYears = 27;
		int ageInYears2 = 67;
		
		String firstName = "Parrish";
		String firstName2 = "Savannah";
		
		String lastName = "McKinney";
		String lastName2 = "Anderson";
		
		char middleInitial = 'E';
		char middleInitial2 = 'M';
		
		String fullName = firstName + middleInitial + lastName; //concatenation
		
		
		
		
		System.out.println(amountInWallet - applePrice);
		System.out.println(ageInYears / numberOfFriends);
		System.out.println(fullName);
		System.out.println(firstName + " " + middleInitial + " " + lastName);
		
		
		
		
		System.out.println("The price of an apple is" + " " + applePrice);
		System.out.println("The price of a banana is" + " " + bananaPrice);
		System.out.println("The amount currently in my wallet is" + " " + amountInWallet);
		System.out.println("The amount I had in my wallet before breakfast" + " " + amountInWallet2); //wallet 2
		System.out.println("The number of friends I have is" + " " + numberOfFriends);
		System.out.println("The number of friends my mom has is" + " " + numberOfFriends2);
		System.out.println("My age is" + " " + ageInYears);
		System.out.println("My moms age is" + " " + ageInYears2);
		System.out.println("My first name is" + " " + firstName);
		System.out.println("My girlfriends first name is" + " " + firstName2);
		System.out.println("My last name is" + " " + lastName);
		System.out.println("My girlfriends last name is" + " " + lastName2);
		System.out.println("My middle initial is" + " " + middleInitial);
		System.out.println("My girlfriends middle initial is" + " " + middleInitial2);
		
	}

}
