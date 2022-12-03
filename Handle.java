import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Handle {
    private ArrayList<Car> list;

    public Handle() {
        list = new ArrayList<Car>();
    }
    //Add
    public void add(Car car) {
        this.list.add(car);
    }

    // Add 5 cars
    public void add5Car() {
        for (int i = 0; i < 2; i++) {
            System.out.println(String.format("Enter information (%d/%d)", i + 1, 2));
            Car car = new Car();
            car.addCar();
            this.add(car);
        }
    }

    //Print
    public void print() {
        System.out.println("Print all car:");
        for (Car car : list) {
            car.outCar();
            System.out.println("___");
        }
    }

    public void printPriceForSaleL20() {
        System.out.println("Print all car:");
        for (Car car : list) {
            if (car.getPriceForSale() > 20) {
                car.outCar();
                System.out.println("___");
            }
        }
    }

    public void destroyById() {
        System.out.println("ID?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for (Car car : list) {
            if (car.getId() == id) {
                list.remove(car);
            }
        }
        System.out.println("Destroyed");
    }

    public void sumOfCars() {
        double sum = 0;
        for (Car car : list) {
            sum += 1;
        }
        System.out.println("Amount of car in list is: " + sum);
    }

    public void sort() {
        Collections.sort(list);
        this.print();
    }
}

/*  public void bubbleSort() {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
//                if (list.get(j).getName().toCharArray()[0] > list.get(j + 1).getName().toCharArray()[0]) {
                if (list.get(j).getName().compareTo(list.get(j + 1).getName()) > 0) {
                    Car temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        this.print();
    }*/

