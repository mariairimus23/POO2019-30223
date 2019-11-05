
public class CurrentAccount extends Account {
	private double overDraftLimit;

	public CurrentAccount(int number) {
		this.overDraftLimit = 0.0;
		this.setNumber(number);
		this.setBalance(0.0);
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ",\toverdraft limit = "
				+ getOverDraftLimit();
	}
}
