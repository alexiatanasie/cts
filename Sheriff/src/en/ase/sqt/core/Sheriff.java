package en.ase.sqt.core;

import en.ase.sqt.model.Request;
import en.ase.sqt.model.RequestType;

import java.util.Iterator;
import java.util.LinkedList;

public class Sheriff {
    private final String name;
    private final int tenure;
    private final LinkedList<Request> queue=new LinkedList<>();
    private final int MAX_QUEUE_SIZE=5;

    public Sheriff(String name, int tenure) {
        this.name = name;
        this.tenure = tenure;
    }
    public void addEmergencyRequest(Request request){
        if(queue.size()<MAX_QUEUE_SIZE){
            int pos=0;
            while(pos<queue.size()&&queue.get(pos).getType()== RequestType.CRISIS){
                pos++;
            }
            queue.add(pos,request);
        }
    }
    public void addRegularRequest(Request request){
        if(queue.size()<MAX_QUEUE_SIZE){
            queue.addLast(request);
        }
    }
    public void addCrisisRequest(Request request){
        if(queue.size()>=MAX_QUEUE_SIZE){
            queue.removeLast();
        }
        queue.addFirst(request);
    }
    public void solveRequest(){
        if(!queue.isEmpty()){
            Request req=queue.removeFirst();
            System.out.println("solved:"+req);

        }else{
            System.out.println("queue is empty");
        }
    }
    public void printQueue(){
        if(queue.isEmpty()){
            System.out.println("queue is empty");
        }else{
            queue.forEach(System.out::println);
        }
    }
    public void transformRequest(int id,RequestType newType){
        for(Iterator<Request>iterator= queue.iterator(); iterator.hasNext();) {
            Request request = iterator.next();
            if (request.getId() == id) {
                iterator.remove();
                request.changeType(newType);

                switch (newType) {
                    case REGULAR -> addRegularRequest(request);
                    case EMERGENCY -> addEmergencyRequest(request);
                    case CRISIS -> addCrisisRequest(request);
                }
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Sheriff{" +
                "name='" + name + '\'' +
                ", tenure=" + tenure +
                '}';
    }
}
