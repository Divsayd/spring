package services;

import interfaces.LogAspect;
import interfaces.speakers;
import interfaces.temperature;
import model.ACcontrol;
import model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component
public class VehicleServies {

    private Logger logger = Logger.getLogger(VehicleServies.class.getName());
    @Autowired
    private speakers speakers;
    private temperature temperature;

    @LogAspect

    public String playMusic(boolean b,Song song) {
        return  speakers.makeSound(song);
    }

    public String getACDetails(ACcontrol aCcontrol) {

        return temperature.status(aCcontrol) + "\t" +  temperature.tempCheck(aCcontrol);
    }

    @Autowired
    public void setSpeakers(speakers speakers){
        this.speakers=speakers;
    }
    @Autowired
    public void setTemperature(temperature temperature){
        this.temperature=temperature;
    }
    public speakers getSpeakers() {
        return speakers;
    }

    public temperature getTemperature(){
        return temperature;
    }


}
