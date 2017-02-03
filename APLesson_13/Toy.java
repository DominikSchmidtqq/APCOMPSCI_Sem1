public abstract class Toy {
    private String name;
    private int count1;
    public Toy() {
        count1 = 1;
    }
    public Toy(String title) {
        count1 = 1;
        this.name = title;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count1;
    }
    public void setName(String title) {
        this.name = title;
    }
    public void setCount(int count1) {
        this.count1 = count1;
    }
    public abstract String getType();
    public String toString() {
        return name + ": " + count1;
    }
}