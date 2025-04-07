package ro.ase.acs.factory.simple;

import ro.ase.acs.factory.method.models.BankAccount;
import ro.ase.acs.factory.method.models.CreditAccountFactory;
import ro.ase.acs.factory.simple.models.AccountType;
import ro.ase.acs.factory.simple.models.BankAccountFactory;
import ro.ase.acs.factory.simple.models.CreditAccount;
import ro.ase.acs.factory.simple.models.DebitAccount;

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = (CreditAccount) BankAccountFactory.getAccount(AccountType.CREDIT, "Jon", "1224552");
        DebitAccount debitAccount = (DebitAccount) BankAccountFactory.getAccount(AccountType.DEBIT, "Ann", "2520498");

        System.out.println(creditAccount);
        System.out.println(debitAccount);

        BankAccount creditt= new CreditAccountFactory().getAccount(AccountType.CREDIT,"nume","123");
        System.out.println(creditt);
    }
}
