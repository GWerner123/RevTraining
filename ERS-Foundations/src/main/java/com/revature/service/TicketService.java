package com.revature.service;

import com.revature.entity.Ticket;
import com.revature.data.TicketDao;
import com.revature.data.TicketDaoTempImpl;

import java.util.List;

public class TicketService {

    //insert
    public Ticket insert(Ticket ticket) {
        TicketDao ticketDao = new TicketDaoTempImpl();
        return ticketDao.insert(ticket);
    }

    //getById
    public Ticket getById(int id) {
        TicketDao ticketDao = new TicketDaoTempImpl();
        return ticketDao.getById(id);
    }

    //getAllTickets
    public List<Ticket> getAllTickets() {
        TicketDao ticketDao = new TicketDaoTempImpl();
        return ticketDao.getAllTickets();
    }

    //update
    public Ticket update(Ticket ticket) {
        TicketDao ticketDao = new TicketDaoTempImpl();
        return ticketDao.update(ticket);
    }

    //delete
    public boolean delete(int id) {
        TicketDao ticketDao = new TicketDaoTempImpl();
        return ticketDao.delete(id);
    }
}
