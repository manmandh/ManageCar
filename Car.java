import java.util.Scanner;

public class Car implements Comparable<Car>{
    private int id;
    private String name;
    private double price;
    private double extraOut;
    private int quantity;

    public Car() {
    }

    public Car(int id, String name, double price, double extraOut, int quantity) {
        this.id = id;
        this.price = price;
        this.extraOut = extraOut;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExtraOut() {
        return extraOut;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceForSale() {
        double priceForSale;
        if (quantity >= 50)
            priceForSale = price + extraOut + 0.01 * extraOut;
        else
            priceForSale = price + extraOut;
        return priceForSale;
    }


    public void addCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input information about car\n_____________ ");
        System.out.println("\nInput id:");
        this.id = sc.nextInt();
        System.out.println("\nInput price:");
        this.price = sc.nextDouble();
        System.out.println("\nInput extraOut");
        this.extraOut = sc.nextDouble();
        System.out.println("\nInput quantity");
        this.quantity = sc.nextInt();
        System.out.println("\nInput name:");
        this.name = sc.next();

    }

    public void outCar() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("ExtraOut: " + extraOut);
        System.out.println("Quantity: " + quantity);
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.name);
    }
}
