package en.ase.sqt.dispatcher;

import en.ase.sqt.core.Sheriff;
import en.ase.sqt.model.Request;

public class CrisisDispatcher extends Dispatcher{
    public CrisisDispatcher(String id,String address){
        super(id,address);
    }

    @Override
    public void dispatch(Request request, Sheriff sheriff) {
        sheriff.addCrisisRequest(request);
    }
}
