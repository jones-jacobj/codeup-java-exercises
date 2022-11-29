public class GroceryItem {
    private final String name, category;
    private int count;

    public GroceryItem(String name, int count, String category){
        this.name=name;
        this.count=count;
        this.category=category;
    }

    public void setCount(int count){this.count=count;}
    public int getCount(){return this.count;}
    public String getName(){return this.name;}
    public String getCategory(){return this.category;}
    public String toString(){return String.format("%d | %s - %s",this.count, this.category, this.name);}
}
