package ss12_tree_map.mvc_java_collection_framework.controller;

import ss12_tree_map.mvc_java_collection_framework.service.IManagerService;
import ss12_tree_map.mvc_java_collection_framework.service.ManagerService;

import java.util.Scanner;

public class ProduceManager {
    private IManagerService productManager = new ManagerService();
    private Scanner scanner = new Scanner(System.in);
    public void manager(){
        String choose;
        do{
            System.out.println("Manager product: \n" +
                    "1. Add \n" +
                    "2. Edit \n" +
                    "3. Delete \n" +
                    "4. Display \n" +
                    "5. Search \n" +
                    "6. Arrange \n" +
                    "7. Exit");
            choose = scanner.nextLine();
            switch (choose){
                case "1":
                    productManager.add();
                    break;
                case "2":
                    productManager.edit();
                    break;
                case "3":
                    System.out.println("Enter id of product:");
                    String id = scanner.nextLine();
                    productManager.delete(id);
                    break;
                case "4":
                    productManager.display();
                    break;
                case "5":
                    System.out.println("Enter name product want find: ");
                    String name = scanner.nextLine();
                    productManager.search(name);
                    break;
                case "6":
                    System.out.print(
                            "Choose arrange: \n" +
                                    "1. Increase \n" +
                                    "2. Decrease \n");
                    byte choice = Byte.parseByte(scanner.nextLine());
                    productManager.arrange(choice);
                    break;
                case "7":
                    System.exit(0);
            }
        }while (true);
    }
}
