
public abstract class BankAccount implements TotalSum {

	private String accountNumber;
	private float accountSum;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getAccountSum() {
		return accountSum;
	}

	public void setAccountSum(float accountSum) {
		this.accountSum = accountSum;
	}

	public boolean removeSum(float sum) {
		if (this.accountSum < sum) {
			return false;
		}
		this.accountSum -= sum;
		return true;
	}

	public void addSum(float sum) {
		this.accountSum += sum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

}
