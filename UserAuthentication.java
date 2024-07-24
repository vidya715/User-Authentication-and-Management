import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuthentication {
    private static Map<String, User> users = new HashMap<>();
    private static String loggedInUser = null; // Track logged in user

    // Register a new user
    public static void registerUser(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("User already exists.");
        } else {
            users.put(username, new User(username, password));
            System.out.println("User registered successfully.");
        }
    }

    // Check if a user is already logged in
    public static boolean isLoggedIn() {
        return loggedInUser != null;
    }

    // Authenticate user based on username and password
    public static boolean authenticateUser(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                loggedInUser = username; // Set logged in user
                return true;
            }
        }
        return false;
    }

    // Update password for an existing user
    public static void updatePassword(String username, String newPassword) {
        if (users.containsKey(username)) {
            users.get(username).setPassword(newPassword);
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("User does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demonstrate the functionalities
        System.out.println("1. Register User");
        System.out.println("2. Authenticate User");
        System.out.println("3. Forget Password (Update Password)");
        System.out.println("4. Check Authentication");
        System.out.print("Choose an option (1/2/3/4): ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (option) {
            case 1:
                System.out.print("Enter username to register: ");
                String regUsername = scanner.nextLine();
                System.out.print("Enter password: ");
                String regPassword = scanner.nextLine();
                registerUser(regUsername, regPassword);
                break;
            case 2:
                System.out.print("Enter username: ");
                String authUsername = scanner.nextLine();
                System.out.print("Enter password: ");
                String authPassword = scanner.nextLine();
                if (authenticateUser(authUsername, authPassword)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid username or password!");
                }
                break;
            case 3:
                System.out.print("Enter username to update password: ");
                String updateUsername = scanner.nextLine();
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                updatePassword(updateUsername, newPassword);
                break;
            case 4:
                if (isLoggedIn()) {
                    System.out.println("Already logged in as " + loggedInUser);
                } else {
                    System.out.println("No user logged in.");
                }
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
