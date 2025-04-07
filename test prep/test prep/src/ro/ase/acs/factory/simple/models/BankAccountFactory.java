package ro.ase.acs.factory.simple.models;

public class BankAccountFactory {
    public static BankAccount getAccount(AccountType accountType, String name, String iban){
        switch (accountType){
            case DEBIT -> {
                return new DebitAccount(name, iban, false, false);
            }
            case CREDIT -> {
                return new CreditAccount(name, iban, 0, 1000);
            }
            default -> {
                throw new UnsupportedOperationException();
            }
        }
    }
}
