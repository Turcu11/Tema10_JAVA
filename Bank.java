import java.util.HashSet;

public class Bank {

	private String bankCode;

	public static void main(String[] args) {
		HashSet<Client> listOfClients = new HashSet<Client>();

		Client c1 = new Client("Ion", "Nufarului 87");
		c1.createAccount("9217853412", 500, "EURO");
		System.out.println(c1.toString());
		c1.createAccount("1486874123", 800, "RON");

		listOfClients.add(c1);
	}

}
