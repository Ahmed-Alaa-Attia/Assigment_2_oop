public class GroceryList {
    GroceryItemOrder[] groceries;
    int groceries_num;

    // Constructor
    public GroceryList() {
        groceries = new GroceryItemOrder[10];
        groceries_num = 0;
    }


    public void add(GroceryItemOrder item) {
        this.groceries[groceries_num] = item;
        groceries_num++;
    }


    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < this.groceries_num; i++) {
            totalCost += this.groceries[i].getCost();
        }
        return totalCost;
    }

}
