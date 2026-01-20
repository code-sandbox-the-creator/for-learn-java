package logic;

public class DecisionMaking {
    public static void main(String[] args) {
        int score = 75;

        // 1. If-Else Statement (Condition)
        if (score >= 80) {
            System.out.println("Grade: A");
        } else if (score >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F");
        }

        // 2. Boolean Logic (AND, OR)
        boolean hasTicket = true;
        boolean isMember = false;

        // Check if user has a ticket OR is a member (|| means OR)
        if (hasTicket || isMember) {
            System.out.println("Access Granted: Welcome!");
        } else {
            System.out.println("Access Denied.");
        }
    }
}