// 5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.
// Define a common interface or abstract class Ticket with a method bookTicket() that each transportation mode must implement differently.
// Create classes BusTicket, TrainTicket, and FlightTicket that extend the abstract class or implement the interface.
// Demonstrate runtime polymorphism by calling the bookTicket() method using a reference of the base class/interface.

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source and destination");
        String source = scanner.nextLine();
        String destination = scanner.nextLine();
        int ticket_count = scanner.nextInt();

        TicketBookingSystem busTicketBooking = new BusTicket(source, destination);
        TicketBookingSystem trainTicketBooking = new TrainTicket(source, destination);
        TicketBookingSystem fligthTicketBooking = new FlightTicket(source, destination);
    
        BusTicket.setTicketCount(ticket_count);
        TrainTicket.setTicketCount(ticket_count);
        FlightTicket.setTicketCount(ticket_count);

        busTicketBooking.bookTicket(source, destination);
        trainTicketBooking.bookTicket(source, destination);
        fligthTicketBooking.bookTicket(source, destination);
    }    
}

interface TicketBookingSystem {
    void bookTicket(String source, String destination);
}

class BusTicket implements TicketBookingSystem {
    String source;
    String destination;
    static int ticketCount = 0;

    public BusTicket(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public static void setTicketCount(int ticket_count) {
        ticketCount = ticket_count;
    }

    @Override
    public void bookTicket(String source, String destination) {
        if(ticketCount > 0) {
            System.out.println("Bus ticket booked from " + source + " to " + destination);
            ticketCount--;
        }
    }

    public static int getTicketCount() {
        return ticketCount;
    }
}

class TrainTicket implements TicketBookingSystem {
    String source;
    String destination;
    static int ticketCount = 0;

    public TrainTicket(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
    
    public static void setTicketCount(int ticket_count) {
        ticketCount = ticket_count;
    }

    @Override
    public void bookTicket(String source, String destination) {
        if(ticketCount > 0) {
            System.out.println("Train ticket booked from " + source + " to " + destination);
            ticketCount--;
        }
    }

    public static int getTicketCount() {
        return ticketCount;
    }
}

class FlightTicket implements TicketBookingSystem {
    String source;
    String destination;
    static int ticketCount = 0;

    public FlightTicket(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
    
    public static void setTicketCount(int ticket_count) {
        ticketCount = ticket_count;
    }

    @Override
    public void bookTicket(String source, String destination) {
        if(ticketCount > 0) {
            System.out.println("Flight ticket booked from " + source + " to " + destination);
            ticketCount--;
        }
    }

    public static int getTicketCount() {
        return ticketCount;
    }
}
