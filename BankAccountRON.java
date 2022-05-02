
public class BankAccountRON extends BankAccount {

	protected String accountNumber;
	protected float accountSum;

	public BankAccountRON(String accountNumber, float accountSum) {
		super();
		this.accountNumber = accountNumber;
		this.accountSum = accountSum;
	}

	public void transfer(BankAccountRON destinationAccount, float sum) {
		if (this.removeSum(sum))
			destinationAccount.addSum(sum);
	}

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

	@Override
	public float getSum() {
		return getAccountSum();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + Float.floatToIntBits(accountSum);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccountRON other = (BankAccountRON) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (Float.floatToIntBits(accountSum) != Float.floatToIntBits(other.accountSum))
			return false;
		return true;
	}

}
