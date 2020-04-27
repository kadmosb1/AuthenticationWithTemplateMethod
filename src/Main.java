public class Main {

	public static void login (User [] users, Authenticator authenticator) {
		User user = authenticator.authenticate (users);
		System.out.println ("User '" + user.name + "' logged in succesfully.");
	}

	public static void main (String[] args) {

		User[] users = new User[] {
			new User("mrpurple", "h6", "68774153"),
			new User("mrbrown", "ds", "14323421"),
			new User("mrpink", "sa", "721167212")
		};

		login (users, new AuthenticatorNoCheck ());
		// login (users, new AuthenticatorCheckNamePassword ());
		// login (users, new AuthenticatorChallengeResponse ());
	}
}