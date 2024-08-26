import java.util.Scanner;

public class customer-calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            System.out.println("Enter the number of food items to be ordered:");
            int number = sc.nextInt();
            
            // Consume leftover newline character
            sc.nextLine();

            System.out.println("Enter the food item:");
            String fd = sc.nextLine().toLowerCase();  // Convert to lowercase

            System.out.println("You have ordered: " + fd);
            System.out.println("You have successfully placed the order number: " + i);
            
            System.out.print("Total Cost of the order: ");
            switch (fd) {
                case "pizza":
                    System.out.println(40 * number);
                    break;
                case "burger":
                    System.out.println(60 * number);
                    break;
                case "sandwich":  
                    System.out.println(45 * number);
                    break;
                default:
                    System.out.println(10 * number);
            }

            System.out.println("Do you want to exit? (Y/N)");
            String ch = sc.nextLine();

            i++;
            if (ch.equals("Y")){
                break;
            }
        }

        sc.close();
    }
}
