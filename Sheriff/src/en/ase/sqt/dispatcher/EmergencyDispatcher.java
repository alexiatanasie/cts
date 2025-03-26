package en.ase.sqt.dispatcher;

import en.ase.sqt.core.Sheriff;
import en.ase.sqt.model.Request;

public class EmergencyDispatcher extends Dispatcher{
    public EmergencyDispatcher(String id, String address) {
        super(id, address);

    }

    @Override
    public void dispatch(Request request, Sheriff sheriff) {
        sheriff.addEmergencyRequest(request);
    }
}
