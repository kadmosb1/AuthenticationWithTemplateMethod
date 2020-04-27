import java.util.Random;

/**
 * The AuthenticatorChallengeResponse asks the username and the result of some calculation with digits in the pin. E.g. the multiplication
 * of two random digits. It uses username and response  to check if a valid user exists. If no valid user exists,
 * after a pause of 5 seconds, the process is repeated.
 */
public class AuthenticatorChallengeResponse extends Authenticator {

	public static Random RANDOM = new Random (System.currentTimeMillis ());
	public int index1 = RANDOM.nextInt (8);
	public int index2 = RANDOM.nextInt (8);

	@Override
	public void waitForLogin() {
	}

	@Override
	public String askUsername (User [] users) {
		return "";
	}

	@Override
	public String askSecret () {
		return "";
	}

	public static int digit (String pin, int index) {
		return Integer.parseInt(pin.substring(index, index + 1));
	}

	@Override
	public User valid (User [] users, String username, String secret) {
		return null;
	}
}
