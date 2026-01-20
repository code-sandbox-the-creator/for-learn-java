package test;

public class SimpleTest {
    
    // The function we want to test (e.g., a simple addition method)
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("--- Start Testing ---");

        // Test Case: 5 + 3 should equal 8
        int expected = 8;
        int result = add(5, 3);

        // Verify the result
        if (result == expected) {
            System.out.println("[PASS] 5 + 3 = 8");
        } else {
            System.out.println("[FAIL] Expected 8 but got " + result);
        }
        
        System.out.println("--- End Testing ---");
    }
}