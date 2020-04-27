/**
 * The AuthenticatorCheckNamePassword asks the username and password and checks if a valid user exists. If no valid user
 * exists, after a pause of 3 seconds, the process is repeated.
 */
public class AuthenticatorCheckNamePassword extends Authenticator {

	@Override
	public void waitForLogin () {
	}

	@Override
	public String askUsername (User [] users) {
		return "";
	}

	@Override
	public String askSecret() {
		return "";
	}

	@Override
	public User valid (User [] users, String username, String secret) {
		return null;
	}
}