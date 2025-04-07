package ro.ase.acs.builder.models;

public class Contract implements IContracts{
    String startDate;
    String endDate;
    float salary;

    Contract(){}

    Contract(String startDate, String endDate, float salary) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }

    //optional
    float bonusGrant = 0.0f;
    float stockOptionGrant = 0.0f;
    boolean isConfidential = false;
    boolean isNonCompete = false;

    void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    void setBonusGrant(float bonusGrant) {
        this.bonusGrant = bonusGrant;
    }

    void setStockOptionGrant(float stockOptionGrant) {
        this.stockOptionGrant = stockOptionGrant;
    }

    void setConfidential(boolean confidential) {
        isConfidential = confidential;
    }

    void setNonCompete(boolean nonCompete) {
        isNonCompete = nonCompete;
    }

    @Override
    public void printDetails() {
        System.out.println("Contract{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", salary=" + salary +
                ", bonusGrant=" + bonusGrant +
                ", stockOptionGrant=" + stockOptionGrant +
                ", isConfidential=" + isConfidential +
                ", isNonCompete=" + isNonCompete +
                '}');
    }
}
