package ro.ase.acs.builder;

import ro.ase.acs.builder.models.Contract;
import ro.ase.acs.builder.models.ContractBuilder;

public class Main {
    public static void main(String[] args) {
        Contract simpleContract = new ContractBuilder("3.3.2025", "undefiend", 3500)
                .build();

        Contract complexContract = new ContractBuilder("today", "never", 10000)
                .addBonusGrant(245)
                .makeConfidential()
                .makeNonCompete()
                .build();

        simpleContract.printDetails();
        complexContract.printDetails();

    }
}
