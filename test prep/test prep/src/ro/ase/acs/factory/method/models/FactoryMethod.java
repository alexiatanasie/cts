package ro.ase.acs.factory.method.models;

import ro.ase.acs.factory.simple.models.AccountType;

public interface FactoryMethod {
    BankAccount getAccount(AccountType type, String name, String iban);
}
