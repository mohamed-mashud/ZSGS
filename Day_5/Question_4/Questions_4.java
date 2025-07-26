// 4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.

import java.util.Scanner;

public class Questions_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String content = """
        Choose an option :
            1. Book Bus Ticket
            2. Book Train Ticket
            3. Book Flight Ticket
            4. Exit
        """;
        
        while (true) { 
            switch (getUserInput(content,scanner)) {
                case 1:
                    Bus bus = new Bus();
                    bus.bookTicket();
                    break;
                case 2:
                    Train train = new Train();
                    train.bookTicket();
                    break;
                case 3:
                    Flight flight = new Flight();
                    flight.bookTicket();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    
    

    public static int getUserInput(String content, Scanner scanner) {
        System.out.println(content);
        return scanner.nextInt();
    }
}




