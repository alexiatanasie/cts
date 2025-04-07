package ro.ase.acs.factory.method.models;

import ro.ase.acs.factory.simple.models.AccountType;

public class DebitAccountFactory implements FactoryMethod{
    @Override
    public BankAccount getAccount(AccountType type, String name, String iban) {
        switch (type){
            case DEBIT -> {
                return new DebitAccount(name, iban, false, false);
            }
            default -> throw new UnsupportedOperationException();
        }
    }
}
