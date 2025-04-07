package ro.ase.acs.factory.method;

import ro.ase.acs.factory.method.models.CreditAccount;
import ro.ase.acs.factory.method.models.CreditAccountFactory;
import ro.ase.acs.factory.method.models.DebitAccount;
import ro.ase.acs.factory.method.models.DebitAccountFactory;
import ro.ase.acs.factory.simple.models.AccountType;

public class Main {
    public static void main(String[] args) {
        DebitAccount debitAccount = (DebitAccount) new DebitAccountFactory().getAccount(AccountType.DEBIT, "jogn" ,"32425");
        CreditAccount creditAccount = (CreditAccount) new CreditAccountFactory().getAccount(AccountType.CREDIT, "ann", "1223532");
        System.out.println(debitAccount);
        System.out.println(creditAccount);
    }
}
