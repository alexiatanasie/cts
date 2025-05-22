package sub2.composite;

//asta e component
public interface IStream {
    String getName();
    default void add(IStream stream){
        throw new UnsupportedOperationException();
    }
    default void remove(IStream stream){
        throw new UnsupportedOperationException();
    }
    default IStream getChild(int  index){
        throw new UnsupportedOperationException();
    }
}
