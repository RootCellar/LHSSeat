import java.util.ArrayList;

public class Row
{
    int numSeats;
    
    ArrayList<Seat> seats = new ArrayList<Seat>();
    public Row(int n) {
        for(int i=0; i<n; i++) {
            seats.add( new Seat() );
        }
        
        numSeats = n;
    }
    
    public boolean isFull() {
        if(numLeft() < 1) return true;
        return false;
    }
    
    public int numLeft() {
        int c = 0;
        for(Seat s : seats) {
            if(!s.isTaken()) c++;
        }
        return c;
    }
    
    public int take(int n) {
        for(Seat s : seats) {
            if(!s.isTaken()) {
                s.take();
                n--;
            }
        }
        
        return n;
    }
    
    public int getNumSeats() { return numSeats; }
}