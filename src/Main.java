import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Building Management System!");
        System.out.println("Please select a building type to manage:");
        System.out.println("1. Villa");
        System.out.println("2. Garage");
        System.out.println("3. Exit");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.println("Customer name");
            String name = sc.nextLine();

            System.out.println("Type: (villa)");
            sc.nextLine();

            Building b = new Villa();
            manager.addOrder(name, b);

            System.out.println("Villa order added for " + name);
        } else if (choice == 2) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            manager.removeOrder(id);
        } else if (choice == 3) {
            manager.listOrders();
        } else if (choice == 4) {
            System.out.println(manager.getTotalProfit());
        }
    }
}
