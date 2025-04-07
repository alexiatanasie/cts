package ro.ase.acs.builder.models;

public class ContractBuilder {
    private Contract contract = null;

    public ContractBuilder(String startDate, String endDate, float salary){
        this.contract = new Contract(startDate, endDate, salary);
    }

    public ContractBuilder addBonusGrant(float bonusGrant){
        this.contract.setBonusGrant(bonusGrant);
        return this;
    }

    public ContractBuilder addStockOptionsGrant(float grant){
        this.contract.setStockOptionGrant(grant);
        return this;
    }

    public ContractBuilder makeConfidential(){
        this.contract.setConfidential(true);
        return this;
    }

    public ContractBuilder makeNonCompete(){
        this.contract.setNonCompete(true);
        return this;
    }

    public Contract build(){
        return this.contract;
    }
}
