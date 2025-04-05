import en.ase.sqt.builder.GiftPackage;
import en.ase.sqt.builder.GiftPackageBuilder;
import en.ase.sqt.prototype.Sticker;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GiftPackage gift1=new GiftPackageBuilder("unicorn","Happy Birthday","red").build();
        gift1.showDetails();
        GiftPackage gift2=new GiftPackageBuilder("Ben10","LMA","green")
                .hasBooks(false)
                .hasToys(true)
                .build();
        gift2.showDetails();

        //prototype
        Sticker sticker=new Sticker("flowers");
        Sticker sticker1=null;
        sticker1=(Sticker)sticker.clone();
        sticker.print();
        sticker1.print();
    }
}