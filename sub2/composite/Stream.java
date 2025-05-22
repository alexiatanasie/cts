package sub2.composite;

//leaf

public class Stream implements  IStream{

    private String name;

    public Stream(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
