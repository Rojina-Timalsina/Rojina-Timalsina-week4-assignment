//Base class Product with fields: name, price.
//Method: displayDetails() prints basic info.
//Subclasses:
//Electronics: add warrantyPeriod
//Clothing: add size and material
//Grocery: add expiryDate
//Override displayDetails() to show product-specific info.
//File: ProductCatalog.java.

class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}


class Electronics extends Product {
    private int warrantyPeriod; // in months

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warrantyPeriod + " months");
    }
}


class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}


class Grocery extends Product {
    private String expiryDate;

    public Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}


public class ProductCatalog {
    public static void main(String[] args) {
        
        Product p1 = new Electronics("Laptop", 1400.00, 12);
        Product p2 = new Clothing("T-Shirt", 20.00, "M", "Cotton");
        Product p3 = new Grocery("Milk", 2.50, "2025-07-01");

        
        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            System.out.println(" Product Details ");
            p.displayDetails();
        }
    }
}
