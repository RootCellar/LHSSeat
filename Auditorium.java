import java.util.ArrayList;

public class Auditorium
{
    ArrayList<Column> columns = new ArrayList<Column>();
    
    int numSeats = 0;
    
    public Auditorium() {
        int[] rows = {10, 20, 30, 40, 50};
        
        Column col = new Column();
        col.addRows( rows );
        addColumn(col);
        
        col = new Column();
        col.addRows( rows );
        addColumn(col);
        
        col = new Column();
        col.addRows( rows );
        addColumn(col);
    }
   
    public int numLeft() {
        int c = 0;
        for(Column col : columns) {
            c += col.numLeft();
        }
        
        return c;
    }
    
    public void addColumn(Column col) { columns.add(col); numSeats += col.getNumSeats();}
    public int numSeats() { return numSeats; }
}