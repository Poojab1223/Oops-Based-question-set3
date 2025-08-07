package com.bankingSystem;

public class MainClass {
	public static void main(String[] args) {
		Account account1 = new SavingAccount();
		Account account2 = new CurrentAccount();
		Account account3 = new FixedDeposite(7464,0.5f,100);



		Customer customer1 = new Customer();
		customer1. setCustomerId(101);
		customer1. setName("tom");
		customer1. setBalance(75767);
		customer1. setAccount(account2);

		Customer customer2 = new Customer();
		customer2. setCustomerId(102);
		customer2. setName("Jeryy");
		customer2. setBalance(2346);
		customer2. setAccount(account1);

		Customer customer3 = new Customer();
		customer3. setCustomerId(103);
		customer3. setName("John");
		customer3. setBalance(89346);
		customer3. setAccount(account3);

		Customer[] listOfCustomer = {customer1,customer2,customer3};

		for(int i = 0; i < listOfCustomer.length; i++) {
			if(listOfCustomer[i]. getAccount() instanceof CurrentAccount) {
				CurrentAccount currentAccount = (CurrentAccount)(listOfCustomer[i]. getAccount());
				currentAccount.calculateInterest(listOfCustomer[i]);
			}
			else if(listOfCustomer[i]. getAccount() instanceof SavingAccount) {
				SavingAccount savingAccount = (SavingAccount)(listOfCustomer[i].getAccount());
				savingAccount.calculateInterest(listOfCustomer[i]);
			}
			else {
				FixedDeposite fixedDeposite = (FixedDeposite)(listOfCustomer[i].getAccount());
				fixedDeposite.calculateInterest(listOfCustomer[i]);
			}
				

		}
	}

}
