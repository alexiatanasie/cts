package en.ase.sqt.dispatcher;

import en.ase.sqt.core.Sheriff;
import en.ase.sqt.model.Request;

public abstract class Dispatcher {
    protected final String id;
    protected final String address;

    public Dispatcher(String id, String address) {
        this.id = id;
        this.address = address;
    }
    public abstract void dispatch(Request request, Sheriff sheriff);

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Dispatcher{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
