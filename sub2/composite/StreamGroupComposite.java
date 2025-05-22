package sub2.composite;

import java.util.ArrayList;
import java.util.List;

public class StreamGroupComposite implements IStream{
    private String name;
    private List<IStream>categories=new ArrayList<>();

    public StreamGroupComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(IStream stream) {
        categories.add(stream);
    }

    @Override
    public void remove(IStream stream) {
        categories.remove(stream);
    }

    @Override
    public IStream getChild(int index) {
        return categories.get(index);
    }

    @Override
    public String getName() {
       StringBuilder result=new StringBuilder(name+ " :");
       for(IStream category:categories){
           result.append(category.getName()).append(", ");
       }
        return  result.toString();
    }
}
