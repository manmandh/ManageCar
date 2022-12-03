import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("___Please choose function___");
        System.out.println("1. Add car in list ");
        System.out.println("2. Print car in list ");
        System.out.println("3. In list Car having priceForSale > 20 ");
        System.out.println("4. The sum of Car in List ");
        System.out.println("5. Destroy");
        System.out.println("6. Sort");
        System.out.println("7. Quit");
    }
    public static void main(String[] args) {
        Handle handle = new Handle();
        boolean programFlag = true;
        Scanner scanner = new Scanner(System.in);

        while (programFlag){
            try {
                Main.menu();
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1:
                        handle.add5Car();
                        break;
                    case 2:
                        handle.print();
                        break;
                    case 3:
                        handle.printPriceForSaleL20();
                        break;
                    case 4:
                        handle.sumOfCars();
                        break;
                    case 5:
                        handle.sort();
//                    handle.bubbleSort();
//                    programFlag = false;
                        break;
                    default:
                        break;
                }
            } catch (Exception e){
                System.out.println("Error, restart menu");
            }
        }
    }
}
