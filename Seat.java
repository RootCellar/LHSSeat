public class Seat
{
    boolean taken = false;
    
    public void take() { taken = true; }
    public boolean isTaken() { return taken; }
}