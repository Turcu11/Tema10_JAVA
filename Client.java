import java.util.HashSet;

public class Client {

	protected String name;
	protected String adress;

	public Client(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	HashSet<TotalSum> list = new HashSet<TotalSum>();

	public BankAccount createAccount(String accountNumber, float sum, String currenty) {
		if (currenty == "RON") {
			return new BankAccountRON(accountNumber, sum);
		} else {
			return new BankAccountEURO(accountNumber, sum);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", adress=" + adress + ", list=" + list + "]";
	}

}
