package travel.user;

import travel.booking.*;

public class User {
    String name;
    String email;
    

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Ticket bookTicket() {
        Ticket ticket = new Ticket("Kerala", 20_000);
        System.out.println("Ticket booked successfully");
        return ticket;
    } 
}
