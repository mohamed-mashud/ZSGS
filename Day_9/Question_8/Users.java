
import java.util.ArrayList;
import java.util.List;


public class Users {
    private List<User> usersList;
    
    public Users() {
        usersList = new ArrayList<>();
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public void addUser(User user) {
        usersList.add(user);
    }
    
}
