package ro.ase.acs.factory.method.models;

public abstract class BankAccount {
    protected String name;
    protected String iban;


    protected BankAccount(String name, String iban) {
        this.name = name;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
