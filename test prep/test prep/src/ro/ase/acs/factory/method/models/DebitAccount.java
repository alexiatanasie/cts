package ro.ase.acs.factory.method.models;

public class DebitAccount extends BankAccount {
    private boolean salaryCollected;
    private boolean hasOverdraft;

    DebitAccount(String name, String iban, boolean salaryCollected, boolean hasOverdraft) {
        super(name, iban);
        this.salaryCollected = salaryCollected;
        this.hasOverdraft = hasOverdraft;
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "salaryCollected=" + salaryCollected +
                ", hasOverdraft=" + hasOverdraft +
                ", name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
