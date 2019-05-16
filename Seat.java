public class Seat
{
    boolean taken = false;
    
    public void take() { taken = true; }
    public boolean isTaken() { return taken; }
    
    private void out(String s) {
        LHSSeat.debug("[SEAT] " + s);
    }
}