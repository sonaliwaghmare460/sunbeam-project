package Assign1;
import java.util.Scanner;


public class Foodcourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int quantity;
        int totalBill = 0;
        int priceDosa = 50;
        int priceSamosa = 20;
        int priceIdli = 30;
        int pricepav = 15;
        int pricecoffee =50;
        int pricepizza = 150;
        int priceFries = 90;
        int priceBhaji= 30;
        int priceparatha = 80;
       

       
        System.out.println("Welcome to the Food Menu!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Dosa - Rs. 50");
            System.out.println("2. Samosa - Rs. 20");
            System.out.println("3. Idli - Rs. 30");
            System.out.println("4. pav - Rs. 15");
            System.out.println("5. coffee - Rs. 50");
            System.out.println("6. pizza - Rs. 150");
            System.out.println("7. Fries - Rs. 90");
            System.out.println("8. Bhaji - Rs. 30");
            System.out.println("9. paratha - Rs. 80");
            System.out.println("10. Generate Bill");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity of Dosa: ");
                    quantity = scanner.nextInt();
                    totalBill += priceDosa * quantity;
                    System.out.println(quantity + " Dosa added to your order.");
                    break;
                case 2:
                    System.out.print("Enter quantity of Samosa: ");
                    quantity = scanner.nextInt();
                    totalBill += priceSamosa * quantity;
                    System.out.println(quantity + " Samosa added to your order.");
                    break;
                case 3:
                    System.out.print("Enter quantity of Idli: ");
                    quantity = scanner.nextInt();
                    totalBill += priceIdli * quantity;
                    System.out.println(quantity + " Idli added to your order.");
                    break;
                    
                case 4:
                    System.out.print("Enter quantity of vadapav: ");
                    quantity = scanner.nextInt();
                    totalBill += pricepav * quantity;
                    System.out.println(quantity + " pav added to your order.");
                    break;
                  
                case 5:
                    System.out.print("Enter quantity of coldcoffee: ");
                    quantity = scanner.nextInt();
                    totalBill += pricecoffee * quantity;
                    System.out.println(quantity + " coffee added to your order.");
                    break;
                    
                case 6:
                    System.out.print("Enter quantity of pizza: ");
                    quantity = scanner.nextInt();
                    totalBill += pricepizza* quantity;
                    System.out.println(quantity + " pizza added to your order.");
                    break;
                    
                case 7:
                    System.out.print("Enter quantity of Fries: ");
                    quantity = scanner.nextInt();
                    totalBill += priceFries * quantity;
                    System.out.println(quantity + " Fries added to your order.");
                    break;
                    
                case 8:
                    System.out.print("Enter quantity of Bhaji: ");
                    quantity = scanner.nextInt();
                    totalBill += priceBhaji * quantity;
                    System.out.println(quantity + " Bhaji added to your order.");
                    break;
                    
                case 9:
                    System.out.print("Enter quantity of paratha: ");
                    quantity = scanner.nextInt();
                    totalBill += priceparatha * quantity;
                    System.out.println(quantity + " paratha added to your order.");
                    break;
                    
                case 10:
                    System.out.println("\nGenerating bill...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 10);

        System.out.println("Your total bill is: Rs. " + totalBill);
        System.out.println("Thank you for dining with us!");
        scanner.close();
    }
}
