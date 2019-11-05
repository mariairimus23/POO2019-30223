/**
 * A class for bank accounts.
 *
 * This class provides the basic functionality of accounts. It allows deposits
 * and withdrawals but not overdraft limits or interest rates.
 */

public class Account {

	private int number;
	private double balance;

	// aveam eroare din cauza vizibilitatii lui number si balance
	// am lasat varianta cu setters si getter
	// mai puteam rezolva aceasta eroare prin schimbarea tipului din private in
	// protected pentru number si balance

	// am avut nevoie de un constructor fara param, altfel imi genera eroare
	public Account() {
	}

	public Account(int number) {
		this.setNumber(number);
		this.setBalance(0.0);
	}

	public void deposit(double sum) {
		if (sum > 0) {
			setBalance(getBalance() + sum);
		} else {
			System.err.println("Account.deposit(...): cannot deposit negative amount.");
		}
	}

	public void withdraw(double sum) {
		if (sum > 0) {
			setBalance(getBalance() - sum);
		} else {
			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return getNumber();
	}

	public String toString() {
		return "Account " + getNumber() + ": " + "balance = " + getBalance();
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}