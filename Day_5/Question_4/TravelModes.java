class Bus extends Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Bus ticket booked!");
    }
}

class Train extends Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Train ticket booked!");
    }
}

class Flight extends Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Flight ticket booked!");
    }
}