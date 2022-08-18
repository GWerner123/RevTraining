package com.revature.data;

import com.revature.entity.Ticket;

import java.util.List;
import java.util.ArrayList;

public class TicketDaoTempImpl implements TicketDao {

    @Override
    public Ticket insert(Ticket ticket) {
        System.out.println("Inserting ticket: " + ticket);
        return ticket;
    }

    @Override
    public Ticket getById(int id) {
        Ticket dummyTicket = new Ticket(1,null,21.34,"Lunch for the office");
        return dummyTicket;
    }

    @Override
    public List<Ticket> getAllTickets() {
        Ticket ticket1 = new Ticket(2,null,32.22,"Paper for the copy machines");
        Ticket ticket2 = new Ticket(3,null,108.75,"Two new chairs for the office");

        List<Ticket> tickets = new ArrayList();
        return tickets;
    }

    @Override
    public Ticket update(Ticket ticket) {
        System.out.println("Updating ticket: " + ticket);
        return ticket;
    }

    @Override
    public boolean delete(int id) {
        System.out.println("Delete ticket with id: " + id);
        return true;
    }
}
