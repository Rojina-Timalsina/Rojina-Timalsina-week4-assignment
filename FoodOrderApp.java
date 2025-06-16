//Class FoodItem: private fields name, price
//Subclasses:
//Pizza: add size, toppings[]
//Burger: add cheese, pattyType
//Salad: add ingredients[]
//Use encapsulation and override method displayMenuItem()
//File: FoodOrderApp.java.

class FoodItem{
    private String name;
    private int price;

    public FoodItem(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void displayMenuItem(){
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
    }

}
class Pizza extends FoodItem{
    private String size;
    private String[] toppings;

    public Pizza(String name, int price, String size, String[] toppings){
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    public String getSize(){
        return size;
    }
    public String[] getToppings(){
        return toppings;
    }
    @Override
    public void displayMenuItem(){
        super.displayMenuItem();
        System.out.println("Size: " + this.size);
        System.out.println("Toppings: "  );
        for(String topping : toppings){
            System.out.println(topping + " ");
        }
        System.out.println();
    }
}
class Burger extends FoodItem{
    private boolean cheese;
    private String pattyType;

    public Burger(String name, int price, boolean cheese, String pattyType){
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    public boolean getCheese(){
        return cheese;
    }
    public String getpattyType(){
        return pattyType;
    }
    @Override
    public void displayMenuItem(){
        super.displayMenuItem();
        System.out.println("Cheese: "+this.cheese);
        System.out.println("PattyType: "+this.pattyType);
        System.out.println();
    }
}
class Salad extends FoodItem{
    private String[] ingredients;

    public Salad(String name, int price, String[] ingredients){
        super(name, price);
        this.ingredients = ingredients;
    }

    public String[] getIngredients(){
        return ingredients;
    }
    @Override
    public void displayMenuItem(){
        super.displayMenuItem();
        System.out.println("Ingredients: ");
        for(String ingreient : ingredients){
            System.out.println(ingreient+ " ");
        }
        System.out.println();
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem f1 = new Pizza("cheese burst veggie pizza", 600, "medium", new String[]{"tomato","Onion","Sweet corn"});
        FoodItem f2 = new Burger("veg Burger", 100, true, "veg");
        FoodItem f3 = new Salad("Fresh garden salad", 199, new String[]{"cucumber", "caarrot", "Tomato", "Letutuce"});
        f1.displayMenuItem();
        System.out.println();
        f2.displayMenuItem();
        System.out.println();
        f3.displayMenuItem();
    }
}