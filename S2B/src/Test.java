import java.util.ArrayList;
import java.util.HashMap;

import ro.ase.csie.cts.accounts.BankAccount;
import ro.ase.csie.cts.bank.Banker;
import ro.ase.csie.cts.enums.AccountType;

public class Test {

	public static void main(String[] args) {
		Banker banker=new Banker();
		//create a list of different accounts
		ArrayList<BankAccount> accounts=new ArrayList<>();
		accounts.add(banker.openAccount(AccountType.CURRENT));
		accounts.add(banker.openAccount(AccountType.SAVINGS));
		accounts.add(banker.openAccount(AccountType.CURRENT));
			
		for(BankAccount acc:accounts) {
			System.out.println(acc.getId());
		}
	
		//define a map of accounts
		HashMap<String,BankAccount>accountsMap= new HashMap<>();
		BankAccount myCredit=banker.openAccount(AccountType.CURRENT);
		accountsMap.put(myCredit.getId(), myCredit);
		
		for(BankAccount acc:accounts) {
			accountsMap.put(acc.getId(),acc);
			
		}
		BankAccount account=accountsMap.get("ACM00");
		if(account==null) {
			System.out.println("no acm00 account");
		}else {
			System.out.println("acm00 balance:"+account.getBalance());
			
			
		}
		account=accountsMap.get("acme2");
		if(account==null) {
			System.out.println("no acme2 account");

		}
		else {
			System.out.println("acme2 balance:"+account.getBalance());

		}
	}

}
