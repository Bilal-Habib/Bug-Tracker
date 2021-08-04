package com.example.BugTracker.ticket;

import java.util.List;

public class TicketService {
    public List<Ticket> getTickets() {
        return List.of(new Ticket(1, "Classes", "Create admin class", "Bug Tracker", "Low"));
    }

}
