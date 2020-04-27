/**
 * The AuthenticatorNoCheck presents the user with a menu of possible usernames and expexts a digit as input. It does not check any
 * password or pin.
 */
public class AuthenticatorNoCheck extends Authenticator {

	@Override
	public void waitForLogin () {
	}

	@Override
	public String askUsername (User [] users)
	{
		String result = null;
		while (result == null) {

			for (int index = 0; index < users.length; index++) {
				System.out.print (index + 1);
				System.out.println (") " + users [index].name);
			}

			System.out.println ();
			System.out.print ("Select your username: ");

			try {

				int index = SCANNER.nextInt();

				if (1 <= index && index <= users.length) {
					result = users [index - 1].name;
				}
			}
			catch (Exception exception) {
			}
		}

		return result;
	}

	@Override
	public String askSecret () {
		return "";
	}

	@Override
	public User valid (User [] users, String username, String secret) {
		return null;
	}
}