
public class Bank {
	public Account[] bankAccounts = new Account[1000];

	public Account openAccount(int nrOfAccounts, String type) {
		nrOfAccounts++;
		if (type.equals("savings")) {
			bankAccounts[nrOfAccounts] = new SavingsAccount(nrOfAccounts);
		} else if (type.equals("current")) {
			bankAccounts[nrOfAccounts] = new CurrentAccount(nrOfAccounts);
		} else if (type.equals("simple")) {
			bankAccounts[nrOfAccounts] = new Account(nrOfAccounts);
		} else {
			System.err.println(
					"Account.openAccount(...): invalid account type for account " + (nrOfAccounts) + ".");
		}
		return bankAccounts[nrOfAccounts];
	}

	//nu stiu daca merge, dar nu am stiut sa fac altfel
	public void closeAccount(Account accountToDelete) 
	{ // printAllAccounts();
		accountToDelete = null; 
		System.gc();
	}

	public void payDivident(int nrOfAccounts, double divident) {
		for (int i = 1; i <= nrOfAccounts; i++) {
			bankAccounts[i].deposit(divident);
		}
	}

	public void updateAccount(int nrOfAccounts, double interestToAdd) {
		for (int i = 1; i <= nrOfAccounts; i++) {
			if (bankAccounts[i] instanceof SavingsAccount) {
				((SavingsAccount) bankAccounts[i]).addInterest(interestToAdd);
			} else if (bankAccounts[i] instanceof CurrentAccount) {
				if (bankAccounts[i].getBalance() < -((CurrentAccount) bankAccounts[i]).getOverDraftLimit()) {
					System.out.print("The account " + bankAccounts[i].getAccountNumber() + " is in overdraft.\n");
				} else {
					System.out.print("The account " + bankAccounts[i].getAccountNumber() + " is not in overdraft.\n");
				}
			}
		}
	}

	public void printAllAccounts(int nrOfAccounts) {
		for (int i = 1; i <= nrOfAccounts; i++) {
			bankAccounts[i].print();
		}
	}
}
