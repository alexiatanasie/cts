package ro.ase.acs.factory.simple.models;

public class CreditAccount extends BankAccount{
    private int installments;
    private float creditLimit;


    CreditAccount(String name, String iban, int installments, float creditLimit) {
        super(name, iban);
        this.creditLimit = creditLimit;
        this.installments = installments;
    }

    public int getInstallments() {
        return installments;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "installments=" + installments +
                ", creditLimit=" + creditLimit +
                ", name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
