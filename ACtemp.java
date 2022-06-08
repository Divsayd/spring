package implementation;

import interfaces.temperature;
import model.ACcontrol;
import org.springframework.stereotype.Component;

@Component
public class ACtemp implements temperature {

    public int tempCheck(ACcontrol aCcontrol){
        return aCcontrol.getTemp() ;
    }
    public String status(ACcontrol aCcontrol){
        return "sttaus of AC feel is " + aCcontrol.getStatus();
    }
}
