package interfaces;

import model.ACcontrol;

public interface temperature   {
    public int tempCheck(ACcontrol aCcontrol);
    public String status(ACcontrol aCcontrol);
}
