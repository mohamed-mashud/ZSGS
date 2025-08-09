import java.util.ArrayList;

public class ATMMachine {
    private static ArrayList<User> users;
    private static boolean populated = false;
    private boolean isPINVerified = false;
    private boolean isWithdrawalDone = false;

    ATMMachine() {
        users = new ArrayList<>();
        ATMMachine.populateUsers();
    }

    public static void populateUsers() {
        if(populated)   return;
        for(int i = 1; i <= 10; i++)
            users.add(new User("User " + i));
        populated = true;
    }

    public User getUser(int uid) {
        for(User user : users)
            if(user.getUID() == uid)    return user;

        return null;
    }

    public synchronized boolean checkPIN(User user, String PIN) {
        for(User otherUser : users) {
            if(otherUser == user && user.getPIN().equals(PIN)) {
                isPINVerified = true;
                return true;
            }
        }
        return false;
    }

    public synchronized void withdraw(User user, long amount) {
        try {
            while(!isPINVerified)   wait();
        } catch(InterruptedException e) {
            System.out.println("Exception caught in waiting at withdraw method " + e.getMessage());
        }

        long balance = user.getBalance();

        if(balance - amount < 0) {
            System.out.println("Insufficient balance");
        } else {
            user.setBalance(balance - amount);
            System.out.println("Amount withdrawn successfully");
        }
        isWithdrawalDone = true;
        notifyAll();
    }

    public synchronized String checkBalance(User user) {
        try {
            while(!isWithdrawalDone)    wait();
        } catch (InterruptedException e) {
            System.out.println("Exception caught in waiting at checkBalance method " + e.getMessage());
        }

        return String.valueOf(user.getBalance());
    }

    public void displayUsers() {
        for(User user : users) {
            System.out.print(user);
        }
    }

    @Override
    public String toString() {
        return "ATMMachine{" +
                "users=" + users +
                ", populated=" + populated +
                '}';
    }
}
