import java.util.Scanner;

public class HypeMachine {
    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);
        
        System.out.print("Enter a name: ");
        String name = my_scanner.nextLine();
        
        System.out.print("How many times should we hype them up? (1-10): ");
        int hypeLevel = my_scanner.nextInt();
        
        // The For Loop in Action
        for (int i = 1; i <= hypeLevel; i++) {
            System.out.println(i + ". " + name + " is absolutely cracked at coding!");
        }
        
        System.out.println("\nLoop finished! Hype sequence complete.");
        my_scanner.close();
    }
}
