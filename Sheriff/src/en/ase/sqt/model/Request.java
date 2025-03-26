package en.ase.sqt.model;

public class Request {
    private static int counter=0;
    private final int id;
    private RequestType type;
    private final String description;

    public Request(RequestType type, String description) {
        this.id=++counter;
        this.type = type;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public RequestType getType() {
        return type;
    }
    public void changeType(RequestType newType){
        this.type=newType;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }

}
