package loop;

public class LoopStructures {
    public static void main(String[] args) {
        
        // 1. For Loop (Used when the number of iterations is known)
        System.out.println("--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 2. While Loop (Repeats while the condition is true)
        System.out.println("\n--- While Loop ---");
        int j = 5;
        while (j > 0) {
            System.out.println("Countdown: " + j);
            j--; // Decrement by 1
        }
        
        // 3. For-Each Loop (Best for iterating through Arrays/Lists)
        System.out.println("\n--- For-Each Loop ---");
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println("I like " + fruit);
        }
    }
}