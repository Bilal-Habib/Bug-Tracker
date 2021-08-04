package com.example.BugTracker.ticket;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    public List<Ticket> getTickets() {
        return List.of(new Ticket(1, "Classes", "Create admin class", "Bug Tracker", "Low"));
    }

}
