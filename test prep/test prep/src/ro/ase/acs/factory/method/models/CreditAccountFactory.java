package ro.ase.acs.factory.method.models;

import ro.ase.acs.factory.simple.models.AccountType;

public class CreditAccountFactory implements FactoryMethod{
    @Override
    public BankAccount getAccount(AccountType type, String name, String iban) {
        switch (type){
            case CREDIT -> {
                return new CreditAccount(name, iban, 0, 1000);
            }
            default -> throw new UnsupportedOperationException();
        }
    }
}
