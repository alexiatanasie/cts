package en.ase.sqt.builder;

public class GiftPackage implements IGiftPackage{

    String wrapper;
    String greetingCard;
    String bow;
    //optional
    boolean hasBooks=false;
    boolean hasToys=false;

    GiftPackage(){

    }
    GiftPackage(String wrapper, String greetingCard, String bow){
        this.wrapper=wrapper;
        this.greetingCard=greetingCard;
        this.bow=bow;
    }

     void setHasBooks(boolean hasBooks) {
        this.hasBooks = hasBooks;
    }

     void setHasToys(boolean hasToys) {
        this.hasToys = hasToys;
    }

    @Override
    public void showDetails() {
        System.out.println("GiftPackage{" +
                "wrapper='" + wrapper + '\'' +
                ", greetingCard='" + greetingCard + '\'' +
                ", bow='" + bow + '\'' +
                ", hasBooks=" + hasBooks +
                ", hasToys=" + hasToys +
                '}');
    }


}
