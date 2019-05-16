import java.util.ArrayList;

public class Column
{
    ArrayList<Row> rows = new ArrayList<Row>();
    
    int numSeats = 0;
    
    public Column() {
        
    }
    
    public Column(int[] nums) {
        addRows(nums);
    }
    
    public void addRow(Row r) { rows.add(r); numSeats+=r.getNumSeats(); }
    public int getNumSeats() { return numSeats; }
    
    public void addRows(int[] nums) {
        for(int i : nums) {
            addRow( new Row(i) );
        }
    }
    
    public int numLeft() {
        int c = 0;
        for(Row r : rows) {
            c += r.numLeft();
        }
        return c;
    }
}