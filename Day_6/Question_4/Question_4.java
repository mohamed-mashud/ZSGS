import travel.booking.Ticket;
import travel.user.User;

public class Question_4 {
    public static void main(String[] args) {
        String name = "Danny";
        String email = "dannydean@gmail.com";
        User user = new User(name, email);

        Ticket bookedTicket = user.bookTicket();
        System.out.println(bookedTicket.toString());
    }    
}
