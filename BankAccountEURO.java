public class BankAccountEURO extends BankAccount {

	private String accountNumber;
	private float accountSum;

	public BankAccountEURO(String accountNumber, float accountSum) {
		super();
		this.accountNumber = accountNumber;
		this.accountSum = accountSum;
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

	public float getIntrest() {
		if (this.accountSum > 500) {
			return (float) (this.accountSum * 1.3);
		} else
			return this.accountSum;
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
		BankAccountEURO other = (BankAccountEURO) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (Float.floatToIntBits(accountSum) != Float.floatToIntBits(other.accountSum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccountEURO [accountNumber=" + accountNumber + ", accountSum=" + accountSum + "]";
	}

	@Override
	public float getSum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
