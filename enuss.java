package projectenu;

public class enuss {
	
	enum ProfileName {
		ANTHONYJAMES, PELEA, SIXTEEN;
	}

	public static void main(String[] args) {
		ProfileName prof = ProfileName.ANTHONYJAMES;
		
		if(prof ==  prof.ANTHONYJAMES) {
			System.out.println("My First Name is Anthony James");
		} else if(prof == prof.PELEA) {
			System.out.println("My Last Name is Pelea");
		} else if(prof == prof.SIXTEEN) {
			System.out.println("My Age is Sixteen");
		}
	}

}
