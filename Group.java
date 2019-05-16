public class Group
{
    int numPeople = -1;
    String name = "NULL";
    
    public Group() {
        out(toString());
    }
    
    public Group(String n, int i) {
        setName(n);
        setPeople(i);
        
        out(toString());
    }
    
    public void setPeople(int i) { numPeople = i; }
    public void setName(String n) { name = n; }
    
    private void out(String s) {
        LHSSeat.debug("[GROUP] " + s);
    }
    
    public String toString() {
        return "{ name: " + name + ", people: " + numPeople + "}";
    }
}