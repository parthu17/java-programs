// 1. Defining the custom exception
class UserdefinedException extends Exception {
    UserdefinedException() {
        super("User defined exception");
        System.out.println("User defined exception constructor executed");
    }
}

// 2. Main application class to test the exception
public class Main {
    
    // A sample method that validates data and throws the exception if a condition fails
    public static void checkAge(int age) throws UserdefinedException {
        if (age < 18) {
            // Explicitly triggering the custom exception
            throw new UserdefinedException();
        } else {
            System.out.println("Access granted - Age is valid.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Program started...");
        
        try {
            // This will trigger the condition inside checkAge and throw the exception
            checkAge(15); 
        } catch (UserdefinedException e) {
            // Catching and handling the exception
            System.out.println("Caught the exception in main block: " + e.getMessage());
        }

        System.out.println("Program continues executing normally after handling the exception.");
    }
}
