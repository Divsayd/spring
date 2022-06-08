package implementation;

import interfaces.speakers;
import model.Song;
import org.springframework.stereotype.Component;

@Component
public class BossSpeakers implements speakers {

    public String makeSound(Song song){
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Bose speakers";
    }

}
