public abstract class Toy {
    private String name;
    private int count;
    public Toy() {
        count += 1;
    }
    public Toy(String nm) {
        count += 1;
        setName(nm);
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    public void setName(String nm) {
        this.name = nm;
    }
    public abstract String getType();
    public String toString() {
        return getName() + getCount();
    }
}