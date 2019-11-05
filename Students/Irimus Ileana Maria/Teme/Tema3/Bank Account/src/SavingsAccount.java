
public class SavingsAccount extends Account {
	private double interest;

	public SavingsAccount(int number) {
		this.interest = 0.0;
		this.setNumber(number);
		this.setBalance(0.0);
	}

	public void addInterest(double suma) {
		if (suma > 0) {
			interest = interest + suma;
		} else {
			System.err.println("SavingsAccount.addInterest(...): cannot add negative interest value.");
		}
	}

	public double getInterest() {
		return interest;
	}

	@Override
	public String toString() {
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ",\tinterest = " + getInterest();
	}
}
