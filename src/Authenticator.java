import java.util.Scanner;

public abstract class Authenticator {
	public static final Scanner SCANNER = new Scanner (System.in);

	public User authenticate (User [] users) {
		User result = null;

		while (result == null) {

			String username = askUsername (users);
			String secret = askSecret ();
			result = valid (users, username, secret);

			if (result == null) {
				waitForLogin ();
			}
		}

		return result;
	}

	public abstract void waitForLogin ();

	public abstract String askUsername (User[] users);

	public abstract String askSecret ();

	public abstract User valid (User[] users, String username, String secret);
}