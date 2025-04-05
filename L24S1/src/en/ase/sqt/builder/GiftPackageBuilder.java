package en.ase.sqt.builder;

public class GiftPackageBuilder {
    private GiftPackage gift = null;

    public GiftPackageBuilder(String wrapper, String greetingCard, String bow) {
        this.gift = new GiftPackage(wrapper, greetingCard, bow);

    }
    public GiftPackageBuilder hasBooks (boolean b) {
        this.gift.setHasBooks(true);
        return this;
    }
    public GiftPackageBuilder hasToys (boolean b) {
        this.gift.setHasToys(false);
        return this;

    }
    public GiftPackage build(){
        return this.gift;
    }
}
