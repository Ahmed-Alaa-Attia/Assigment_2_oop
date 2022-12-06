public class Main {

    public static void main(String[] args) {


        GroceryList g = new GroceryList();


        GroceryItemOrder go = new GroceryItemOrder("beans", 2, 3.75);


        go.setQuantity( 3 );

        System.out.println("The total cost is : "
                + go.getCost() );


        g.add( go );


        GroceryItemOrder go2 = new GroceryItemOrder("peas", 4, 2.30);
        g.add( go2 );

        System.out.println("The total cost of groceries "
                + "is: " + g.getTotalCost() );
    }
}