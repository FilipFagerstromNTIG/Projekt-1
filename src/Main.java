
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();

        System.out.println("1. Lägg till Villa");
        System.out.println("2. Lägg till Garage");
        System.out.println("3. Ta bort order");
        System.out.println("4. Lista orders");
        System.out.println("5. Visa vinst");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Customer name: ");
            String name = sc.nextLine();
            manager.addOrder(name, new Villa());
            System.out.println("Villa order added");
        }

        if (choice == 2) {
            System.out.print("Customer name: ");
            String name = sc.nextLine();
            manager.addOrder(name, new Garage());
            System.out.println("Garage order added");
        }

        if (choice == 3) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            manager.removeOrder(id);
            System.out.println("Order removed (om ID fanns)");
        }

        if (choice == 4) {
            manager.listOrders();
        }

        if (choice == 5) {
            System.out.println("Total vinst: " + manager.getTotalProfit());
        }
    }
}
