// `travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
package travel.booking;

public class Ticket {
    private int ticketId;
    private String destination;
    private double fare;
    private static int ticket_id = 0;  

    public Ticket(String destination, double fare) {
        this.ticketId = generateTicketID();
        this.destination = destination;
        this.fare = fare;
    }

    private static int generateTicketID() {
        return ticket_id++;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "TicketId: " + this.ticketId +
                "\nDestination: " + this.destination +
                "\nFare: " + this.fare;
    }
}
