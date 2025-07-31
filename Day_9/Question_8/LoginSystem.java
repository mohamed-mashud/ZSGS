import java.util.List;
import java.util.Scanner;

public class LoginSystem {
    Scanner scanner = new Scanner(System.in);
    public void login() {

        System.out.print("Enter name : ");
        String name = getStringInput();
        System.out.print("Enter the password : ");
        String password = getStringInput();
        
        User user_1 = new User();
        user_1.setUserName(name);
        user_1.setPassword(password);

        Users users = new Users();
        users.addUser(user_1);

        System.out.println(
            """
            Welcome to the login system.
                1. LOGIN
                2. EXIT
            """
        );
        int choice = getIntegerInput();
        consumeLine();
        if (choice == 1) {
            try {
                validateUser(users.getUsersList());
            } catch (InvalidPasswordException e) {
                System.out.println("In catch :" + e.getMessage());
            }
        } else {
            System.out.println("Exiting the system");
            System.exit(0);
        }
    }
    
    private String getStringInput() {
        return scanner.nextLine();
    }

    private int getIntegerInput() {
        return scanner.nextInt();
    }

    private void consumeLine() {
        scanner.nextLine();
    }

    private void validateUser(List<User> usersList) {
        System.out.print("Enter the username : ");
        String usernameFromUser = getStringInput();
        User userFromList = null;


        for(User user : usersList) {
            String currentUserName = user.getUserName();

            if(currentUserName.equals(usernameFromUser)) {
                userFromList = user;
                break;
            }
        }

        if(userFromList == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Enter the password : ");
        String passwordFromUser = getStringInput();
        String passwordFromList = userFromList.getPassword();

        if(validatePassword(passwordFromList, passwordFromUser)) {
            System.out.println("Logged in Successfully");
            return;
        } else {
            throw new InvalidPasswordException("Invalid Password");
        }

    }

    private boolean validatePassword(String password, String passwordToValidate) {
        return password.equals(passwordToValidate);
    }
}
